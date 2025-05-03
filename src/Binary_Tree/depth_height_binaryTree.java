package Binary_Tree;

public class depth_height_binaryTree {
    public static void main(String[] args) {
        Binary_tree4 tree=new Binary_tree4();
        tree.root=new Node(10);
        tree.root.left=new Node(20);
        tree.root.right=new Node(30);
        tree.root.left.left=new Node(40);
        tree.root.left.right=new Node(50);
        tree.root.right.left=new Node(60);
        tree.root.right.right=new Node(70);
        System.out.println(tree.height(tree.root));
    }
}
class Binary_tree4{
    Node root;

    public int height(Node root){
        if(root == null){
            return 0;
        }
        int left=height(root.left);
        int right=height(root.right);
        return 1+Math.max(left, right);
    }
}