class LL{
           
               Node head;
               class Node{
                     int data;
                     Node next;
                     Node(){
                        this.data=0;
                        this.next=null;
                     }
                     Node(int data){
                         this.data=data;
                         this.next=null;
                     }
               }
               public void insertAtFirst(int data){
                          Node newNode=new Node(data);
                            newNode.next=head;
                            head=newNode;
               }
               public void print(){
                      Node temp=head;
                      while(temp!=null){
                           System.out.print(temp.data+"->");
                           temp=temp.next;
                      }
                      System.out.println("END");
               }
}
public class LinkedList{
                public static void main(String[] args) {
                           LL list=new LL();
                           list.insertAtFirst(20);
                           list.insertAtFirst(10);
                           list.insertAtFirst(40);
                           list.insertAtFirst(60);
                           list.insertAtFirst(80);
                           list.print();

                }
}