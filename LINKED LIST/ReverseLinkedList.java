class LL{
            Node head;
             class Node{
                  int data;
                  Node next;

                    Node(int data){
                        this.data=data;
                        this.next=null;
                    }
             }

             public void printList(Node head){
                Node current=head;
                  while(current!=null){
                      System.out.print(current.data+"->");
                      current=current.next;
                  }
                  System.out.println("END");
         }
         public void insertAtEnd(int data){
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
            }
            public Node reverseList(Node head) {

                if(head==null || head.next==null){
                      return head;
                }
                  
                Node previous=null,current=head,forward=null;

                  while(current!=null){
                      forward=current.next;
                      current.next=previous;
                      previous=current;
                      current=forward;
                }
             return previous;
 }
}
public class ReverseLinkedList {
        public static void main(String[] args) {
                 LL list=new LL();
                 list.insertAtEnd(65);
                    list.insertAtEnd(85);
                 list.insertAtEnd(95);
                 list.insertAtEnd(15);
                 list.insertAtEnd(25);
                 list.insertAtEnd(35);

                 list.printList(list.head);
              //   65->85->95->15->25->35->END
                 
                 list.head= list.reverseList(list.head);

                 list.printList(list.head);
              //35->25->15->95->85->65->END
        }
}
