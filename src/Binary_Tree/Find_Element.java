package Binary_Tree;

public class Find_Element {
    public static void main(String[] args) {
        Binary_tree3 tree=new Binary_tree3();
        tree.root=new Node(10);
        tree.root.left=new Node(20);
        tree.root.right=new Node(30);
        tree.root.left.left=new Node(40);
        tree.root.left.right=new Node(50);
        tree.root.right.left=new Node(60);
        tree.root.right.right=new Node(70);
        System.out.println(tree.findNode(tree.root, 40));
    }
}
class Binary_tree3{
    Node root;

    public boolean findNode(Node root, int value){
        if(root == null){
            return false;
        }
        if(root.data==value){
            return true;
        }
        return findNode(root.left, value)|| findNode(root.right, value);
    }
}
