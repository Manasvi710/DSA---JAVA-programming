package revision;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class binaryTree {
    public static void main(String[] args) {
        binary tree=new binary();
        tree.root=new node(10);
        tree.root.left=new node(20);
        tree.root.right=new node(30);
        tree.root.left.left=new node(40);
        tree.root.left.right=new node(50);
        tree.root.right.left=new node(60);
        tree.root.right.right=new node(70);
        System.out.print("level Order : ");
        tree.levelOrder();
        System.out.println();
        System.out.print("pre-Order : ");
        tree.preOrder(tree.root);
        System.out.println();
        System.out.print("In-Order : ");
        tree.inOrder(tree.root);
        System.out.println();
        System.out.print("Post-Order : ");
        tree.postOrder(tree.root);
        System.out.println();
        System.out.print("Nth-Node : ");
        tree.nth_order(tree.root, 5);
        System.out.println();
        System.out.println("Node : " + tree.count_node(tree.root));
        System.out.println("Height : " + tree.height(tree.root));
        System.out.println("Find node : " + tree.findNode(tree.root, 50));
        tree.spiral(tree.root);
    }
}
class node{
    int data;
    node left, right;

    public node(int data) {
        this.data = data;
    }
}
class binary{
    node root;
    public void levelOrder(){
        if(root == null){
            return;
        }
        Queue<node> q=new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            node n=q.poll();
            System.out.print(n.data + " ");
            if(n.left != null){
                q.add(n.left);
            }
            if(n.right != null){
                q.add(n.right);
            }
        }
    }
    public void preOrder(node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inOrder(node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public void postOrder(node root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }
    static int c=0;
    public void nth_order(node root, int n){
        if(root==null){
            return;
        }
        nth_order(root.left,n);
        c++;
        if(c==n) {
            System.out.print(root.data + " ");
        }
        nth_order(root.right, n);
    }
    public int count_node(node root){
        if(root==null){
            return 0;
        }
        return 1+count_node(root.left)+count_node(root.right);
    }

    public int height(node root){
        if(root == null){
            return 0;
        }
        int left=height(root.left);
        int right=height(root.right);
        return 1+Math.max(left, right);
    }

    public boolean findNode(node root, int value){
        if(root == null){
            return false;
        }
        if(root.data==value){
            return true;
        }
        return findNode(root.left, value) || findNode(root.right, value);
    }

    public void spiral(node root){
        if(root == null){
            return;
        }
        Deque<node> q=new LinkedList<>();
        q.addFirst(root);
        boolean flag=true;
        while(!q.isEmpty()){
            int count =q.size();
            while (count > 0){
                if(flag){
                    node n=q.removeFirst();
                    System.out.print(n.data + " ");
                    if(n.left != null){
                        q.addLast(n.left);
                    }
                    if(n.right != null){
                        q.addLast(n.right);
                    }
                }else {
                    node n=q.removeLast();
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
            flag =! flag;
        }
    }
}