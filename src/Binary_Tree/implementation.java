package Binary_Tree;


import java.util.LinkedList;
import java.util.Queue;

public class implementation {
    public static void main(String[] args) {
         Binary_tree tree=new Binary_tree();
         tree.root=new Node(10);
         tree.root.left=new Node(20);
         tree.root.right=new Node(30);
         tree.root.left.left=new Node(40);
         tree.root.left.right=new Node(50);
         tree.root.right.left=new Node(60);
         tree.root.right.right=new Node(70);
         System.out.println("Level Order");
         tree.levelOrder();
        System.out.println();
         System.out.println("InOrder Traversal");
         tree.InOrder(tree.root);
        System.out.println();
        System.out.println("preOrder Traversal");
        tree.preOrder(tree.root);
        System.out.println();
        System.out.println("postOrder Traversal");
        tree.postOrder(tree.root);
    }
}
class Node{
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }
}
class Binary_tree{
   Node root;

    public void levelOrder() {
        if(root == null){
            return;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            Node n=q.poll();
            System.out.print(n.data + " ");
            if(n.left != null){
                q.add(n.left);
            }
            if(n.right != null){
                q.add(n.right);
            }
        }
    }
    public void InOrder(Node root){
        if(root==null){
            return;
        }
        InOrder(root.left);
        System.out.print(root.data + " ");
        InOrder(root.right);
    }
    public void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public void postOrder(Node root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }
}
