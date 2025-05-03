package LinkedList;

public class circular_singly_linklist {
    public static void main(String[] args) {
        linklist10 ll=new linklist10();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.insert(4);
        ll.insert(5);
        ll.print();
        ll.delete(1);
        System.out.println();
        ll.print();
    }
}
class linklist10{
    node10 head;

   public void insert(int data){
       node10 nn=new node10(data);
       if(head==null){
           head=nn;
           nn.next=head;
       }else {
           node10 temp=head;
          while (temp.next != head){
              temp=temp.next;
          }
          temp.next=nn;
          nn.next=head;
       }
   }
   public void print() {
       if (head == null) {
           System.out.println("empty");
           return;
       }
       node10 current = head;
      do {
           System.out.print(current.data + " ");
           current = current.next;
       } while (current != head);
   }

   public void delete(int data){
       if(head == null){
           System.out.println("empty !!");
           return;
       }
       node10 current = head;
       if(head.data==data) {
           while (current.next != head) {
               current = current.next;
           }
           if (head == head.next) {
               head = null;
           } else {
               current.next = head.next;
               head = head.next;
           }
       }
    }
}
class node10{
    int data;
    node10 next;

    public node10(int data) {

        this.data = data;
    }
}