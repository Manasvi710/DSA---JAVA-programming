package Binary_Tree;

import java.util.Deque;
import java.util.LinkedList;

public class spiral {
    public static void main(String[] args) {
        Binary_tree6 tree=new Binary_tree6();
        tree.root=new Node(10);
        tree.root.left=new Node(20);
        tree.root.right=new Node(30);
        tree.root.left.left=new Node(40);
        tree.root.left.right=new Node(50);
        tree.root.right.left=new Node(60);
        tree.root.right.right=new Node(70);
        System.out.print("spiral : ");
        tree.spiral(tree.root);
    }
}
class Binary_tree6{
    Node root;

    public void spiral(Node root){
        if(root == null){
            return;
        }
        Deque<Node> q=new LinkedList<>();
        q.addFirst(root);
        boolean flag=true;
        while (!q.isEmpty()){
            int count=q.size();
            while (count>0){
                if(flag){
                    Node n=q.removeFirst();
                    System.out.print(n.data + " ");
                    if(n.left != null){
                        q.addLast(n.left);
                    }
                    if(n.right != null){
                        q.addLast(n.right);
                    }
                }else{
                    Node n=q.removeLast();
                    System.out.print(n.data + " ");
                    if(n.right != null){
                        q.addFirst(n.right);
                    }
                    if(n.left != null){
                        q.addFirst(n.left);
                    }
                }
                count--;
            }
            flag=!flag;
        }
    }
}