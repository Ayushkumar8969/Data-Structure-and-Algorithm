class LinkedList{

           Node head;
                  
             // creating a node
                  class Node{
                      int data;
                      Node next;

                      Node(int data){
                          this.data=data;
                          this.next=null;
                      }
                 }
               // printing the linked list
                 public void printList(Node head){
                        Node current=head;
                          while(current!=null){
                              System.out.print(current.data+"->");
                              current=current.next;
                          }
                          System.out.println("END");
                 }

                // sorting the linked list
                 public Node sortList(Node head){
                       // if there is no node or there is only single node then return head
                         if(head==null || head.next==null){
                               return head;
                         }
                         // now we are dividing the whole linked list in two parts

                         // we are finding the middle node
                         Node middle=getMiddle(head);
                         // we are storing the next of middle in node
                         Node node=middle.next;
                         middle.next=null;
                        
                          //sort the first part of linked list 
                         Node left=sortList(head);
                        // sort the second part of linked list
                         Node right=sortList(node);
                         
                         // Now merging the two sorted linked list and returning 
                         return merge(left,right);
                 }
                 
                 public Node getMiddle(Node head){
                         Node slow=head;
                         Node fast=head;
                           while(fast.next!=null && fast.next.next!=null){
                                 slow=slow.next;
                                 fast=fast.next.next;
                           }
                           return slow;
                 }
                 public Node merge(Node left,Node right){
                           Node dummyHead=new Node(-1);
                           Node temp=dummyHead;

                           while(left!=null && right!=null){
                                    if(left.data<=right.data){
                                          temp.next=left;
                                          left=left.next;
                                    }
                                    else{
                                           temp.next=right;
                                           right=right.next;
                                    }
                                    temp=temp.next;
                           }
                           if(left!=null){
                                 temp.next=left;
                           }
                           if(right!=null){
                                temp.next=right;
                           }
                           return dummyHead.next;
                 }

                 public Node insertAtEnd(Node head,int data){
                                 Node newNode=new Node(data);

                                   if(head==null){
                                        head=newNode;
                                   }
                                   else{
                                           Node current=head;
                                           while(current.next!=null){
                                                  current=current.next;
                                           }
                                           current.next=newNode;
                                   }
                                   return head;
                 }
}
public class SortLinkedList {
          
            public static void main(String[] args) {
                       
                LinkedList list=new LinkedList();
                list.head=list.insertAtEnd(list.head,65);
                list.head=list.insertAtEnd(list.head,25);
                list.head=list.insertAtEnd(list.head,15);
                list.head=list.insertAtEnd(list.head,75);
                list.head=list.insertAtEnd(list.head,45);
                list.head=list.insertAtEnd(list.head,85);
                list.head=list.insertAtEnd(list.head,35);

                list.printList(list.head);

                list.head=list.sortList(list.head);

                list.printList(list.head);
            }
                  
}
