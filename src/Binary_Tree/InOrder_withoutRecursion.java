package Binary_Tree;

import java.util.Stack;

public class InOrder_withoutRecursion {
    public static void main(String[] args) {
        Binary_tree9 tree = new Binary_tree9();
        tree.root = new Node(10);
        tree.root.left = new Node(20);
        tree.root.right = new Node(30);
        tree.root.left.left = new Node(40);
        tree.root.left.right = new Node(50);
        tree.root.left.right.right=new Node(70);
        tree.root.right.right = new Node(60);
        tree.root.right.right.left=new Node(80);
        tree.root.right.right.right = new Node(90);
        System.out.print("In-Order :");
        tree.InOrder();
    }
}
class Binary_tree9{
    Node root;

    public void InOrder() {
        Stack<Node> stack=new Stack<>();
        Node curr=root;
        while (curr != null || !stack.isEmpty()){
            while (curr != null){
                stack.push(curr);
                curr=curr.left;
            }
            curr=stack.pop();
            System.out.print(curr.data + " ");
            curr=curr.right;
        }
    }
}