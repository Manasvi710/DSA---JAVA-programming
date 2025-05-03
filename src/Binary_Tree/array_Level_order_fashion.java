package Binary_Tree;

import java.util.LinkedList;
import java.util.Queue;

public class array_Level_order_fashion {
    public static void main(String[] args) {
        Binary_tree5 tree=new Binary_tree5();
        int [] arr={1,2,3,4,5,6,7};
//        tree.root=tree.insertlevel(arr, tree.root, 0);
//        tree.treeprint(tree.root);
//        System.out.println();
       tree.root=tree.tree(arr);
       tree.treeprint(tree.root);
    }
}
class Binary_tree5{
    Node root;
     public Node insertlevel(int [] arr, Node root, int i) {
    // Recursion
         if (i < arr.length) {
             Node temp = new Node(arr[i]);
             root = temp;

             root.left = insertlevel(arr, root.left, 2 * i + 1);
             root.right = insertlevel(arr, root.right, 2 * i + 2);

         }
         return root;
     }

     public Node tree(int [] arr){
     // Without recursion
         if(arr == null || arr.length == 0){
             return null;
         }
         Node r=new Node(arr[0]);
         Queue<Node> q=new LinkedList<>();
         q.add(r);
         int i=1;
         while (i<arr.length){
             Node curr=q.remove();
             if(i<arr.length){
                 curr.left=new Node(arr[i++]);
                 q.add(curr.left);
             }
             if(i<arr.length){
                 curr.right=new Node(arr[i++]);
                 q.add(curr.right);
             }
         }
         return root;
     }
     public void treeprint(Node root){
         if(root==null){
             return;
         }
         treeprint(root.left);
         System.out.print(root.data + " ");
         treeprint(root.right);
     }
}