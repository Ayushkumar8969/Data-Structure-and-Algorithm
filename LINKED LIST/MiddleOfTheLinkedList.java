class LinkedList{
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
             public Node middleNode(Node head) {
                int N=countLength(head);
                 Node temp=head;
                 for(int i=0;i<N/2;i++){
                     temp=temp.next;
                 }
                return temp;
        }
        public static int countLength(Node head){
                  Node temp=head;
                  int count=0;
                  while(temp!=null){
                      count++;
                      temp=temp.next;
                  }
                  return count;
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

}
public class MiddleOfTheLinkedList {
           
                  public static void main(String[] args) {
                          LinkedList list=new LinkedList();
                          list.insertAtEnd(65);
                          list.insertAtEnd(75);
                          list.insertAtEnd(85);
                          list.insertAtEnd(95);
                          list.insertAtEnd(15);
                          list.insertAtEnd(25);
                          list.insertAtEnd(35);

                          list.printList(list.head);

                          System.out.println(list.middleNode(list.head).data);


                  }
}
