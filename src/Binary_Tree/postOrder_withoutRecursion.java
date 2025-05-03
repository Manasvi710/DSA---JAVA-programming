package Binary_Tree;

import java.util.Stack;

public class postOrder_withoutRecursion {
    public static void main(String[] args) {
        Binary_tree8 tree=new Binary_tree8();
        tree.root=new Node(10);
        tree.root.left=new Node(20);
        tree.root.right=new Node(30);
        tree.root.left.left=new Node(40);
        tree.root.left.right=new Node(50);
        tree.root.left.right.right=new Node(70);
        tree.root.right.right=new Node(60);
        tree.root.right.right.left=new Node(80);
        tree.root.right.right.right=new Node(90);
        System.out.print("post-Order :");
        tree.PostOrder();
    }
}
class Binary_tree8{
    Node root;

    public void PostOrder() {
        Stack<Node> stack=new Stack<>();
        Stack<Node> stack2=new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()) {
            Node n = stack.pop();
            stack2.push(n);
            if (n.left != null) {
                stack.push(n.left);
            }
            if (n.right != null) {
                stack.push(n.right);
            }
        }
        while(!stack2.isEmpty()){
            Node n2=stack2.pop();
            System.out.print(n2.data + " ");
        }
    }
}