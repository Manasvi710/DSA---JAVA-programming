package revision;

public class Bst {
    public static void main(String[] args) {
        bst1 b=new bst1();
        b.insert(8);
        b.insert(10);
        b.insert(3);
        b.insert(1);
        b.insert(6);
        b.insert(14);
        b.insert(4);
        b.insert(7);
        b.insert(13);
        b.InOrder(b.root);
        System.out.println(b.search(b.root, 1));
        b.delete(3);
        b.InOrder(b.root);
    }
}
class bstNode{
    int data;
    bstNode left,right;

    public bstNode(int data) {
        this.data = data;
    }
}
class bst1{
    bstNode root;
    public void insert(int value){
        root=insert(root, value);
    }
    public bstNode insert(bstNode root, int value){
        if(root == null){
            root=new bstNode(value);
            return root;
        }else if(value > root.data){
            root.right=insert(root.right, value);
        }else {
            root.left=insert(root.left, value);
        }
        return root;
    }
    public void InOrder(bstNode root){
        if(root==null){
            return;
        }
        InOrder(root.left);
        System.out.print(root.data + " ");
        InOrder(root.right);
    }

    public boolean search(bstNode root, int value){
        if(root==null){
            return false;
        }
        if(root.data==value){
            return true;
        }
        if(root.data > value){
            return search(root.left, value);
        }
        return search(root.right, value);
    }

    public int minValue(bstNode node){
        int min=node.data;
        while (node.left != null){
            min=node.left.data;
            node=node.left;
        }
        return min;
    }
    public void delete(int value){
        root=delete(root, value);
    }

    public bstNode delete(bstNode root, int value){
        if(root==null){
            return root;
        }
        if(value > root.data){
            root.right=delete(root.right, value);
        }else if(value< root.data){
            root.left=delete(root.left, value);
        }else{
            if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }
            root.data=minValue(root.right);
            root.right=delete(root.right, root.data);
        }
        return root;
    }
}