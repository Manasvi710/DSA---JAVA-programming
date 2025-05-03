package Binary_Tree;

import java.util.Stack;

public class preOrder_withoutRecursion {
    public static void main(String[] args) {
        Binary_tree7 tree=new Binary_tree7();
        tree.root=new Node(10);
        tree.root.left=new Node(20);
        tree.root.right=new Node(30);
        tree.root.left.left=new Node(40);
        tree.root.left.right=new Node(50);
        tree.root.left.right.right=new Node(70);
        tree.root.right.right=new Node(60);
        tree.root.right.right.left=new Node(80);
        tree.root.right.right.right=new Node(90);
        System.out.print("pre-Order :");
        tree.PreOrder();
    }
}
class Binary_tree7{
    Node root;
    public void PreOrder(){
        Stack<Node> stack=new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node n = stack.pop();
            System.out.print(n.data + " ");
            if(n.right != null){
                stack.push(n.right);
            }
            if(n.left != null){
                stack.push(n.left);
            }
        }
    }
}