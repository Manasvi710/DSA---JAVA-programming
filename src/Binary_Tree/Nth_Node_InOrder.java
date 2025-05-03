package Binary_Tree;

public class Nth_Node_InOrder {

    public static void main(String[] args) {
        Binary_tree2 tree=new Binary_tree2();
        tree.root=new Node(10);
        tree.root.left=new Node(20);
        tree.root.right=new Node(30);
        tree.root.left.left=new Node(40);
        tree.root.left.right=new Node(50);
        tree.root.right.left=new Node(60);
        tree.root.right.right=new Node(70);
        System.out.print("Nth Node : ");
        tree.printNth(tree.root, 3);
    }
}
class Binary_tree2{
    Node root;
    static int c=0;
    public void printNth(Node root, int n){
        if(root == null){
            return;
        }
        printNth(root.left, n);
        c++;
        if(c==n){
            System.out.println(root.data);
        }
        printNth(root.right, n);
    }

}