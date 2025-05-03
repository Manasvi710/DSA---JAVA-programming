package LinkedList;

public class reverse_linklist_memory {
    public static void main(String[] args) {
        linklist9 ll=new linklist9();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.insert(4);
        ll.insert(5);
        ll.print();
        ll.reverse();
        System.out.println();
        ll.print();
    }
}
class linklist9{
   node9 head;
   public void insert(int data){
       node9 nn=new node9(data);
       if(head == null){
           head=nn;
       }else{
           node9 temp=head;
           while (temp.next != null){
               temp=temp.next;
           }
           temp.next=nn;
       }
   }

   public void reverse(){
       node9 prev=null;
       node9 current=head;
       node9 next=null;
       while (current != null){
           next=current.next;
           current.next=prev;
           prev=current;
           current=next;
       }
       head=prev;
   }
   public void print(){
       node9 temp=head;
       while (temp != null){
           System.out.print(temp.data + " ");
           temp=temp.next;
       }
   }
}
class node9{
    int data;
    node9 next;

    public node9(int data) {
        this.data = data;
    }
}