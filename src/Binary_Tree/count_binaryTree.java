package Binary_Tree;

public class count_binaryTree {
    public static void main(String[] args) {
        Binary_tree1 tree=new Binary_tree1();
        tree.root=new Node(10);
        tree.root.left=new Node(20);
        tree.root.right=new Node(30);
        tree.root.left.left=new Node(40);
        tree.root.left.right=new Node(50);
        tree.root.right.left=new Node(60);
        tree.root.right.right=new Node(70);
        System.out.println("Node : "+tree.countNode(tree.root));
    }
}
class Binary_tree1{
    Node root;
     public int countNode(Node root){
         if(root == null){
             return 0;
         }
         return 1+countNode(root.left)+countNode(root.right);
     }
}
