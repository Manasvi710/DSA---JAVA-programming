package Binary_Tree;

public class BinarySearch_Implementation {
    public static void main(String[] args) {
        BST bst=new BST();
        bst.insert(10);
        bst.insert(35);
        bst.insert(40);
        bst.insert(20);
        bst.insert(60);
        bst.insert(45);
        bst.insert(50);
        bst.insert(48);
        bst.insert(55);
        bst.insert(51);
        bst.insert(52);
        bst.insert(36);
        bst.insert(49);
        bst.InOrder(bst.root);
        System.out.println();
        System.out.println(bst.search(bst.root, 60));
        bst.delete(60);
        bst.InOrder(bst.root);
    }
}
class BST{
    Node root;

    public void insert(int value){

        root=insert(root, value);
    }
        private Node insert(Node root, int value){
            if(root == null){
                root=new Node(value);
                return root;
            }else if(value> root.data){
                root.right=insert(root.right, value);
            }else{
                root.left=insert(root.left, value);
            }
            return root;
    }
    public void InOrder(Node root){
        if(root==null){
            return;
        }
        InOrder(root.left);
        System.out.print(root.data + " ");
        InOrder(root.right);
    }

    public boolean search(Node root, int value){
        if(root == null){
            return false;
        }
        if(root.data == value){
            return true;
        }
        if(root.data > value){
            return search(root.left, value);
        }
        return search(root.right,value);
    }
    private int minValue(Node node){
        int min= node.data;
        while (node.left != null){
            min=node.left.data;
            node=node.left;
        }
        return min;
    }

    public void delete(int value){
        root=delete(root, value);
    }

    private Node delete(Node root, int value){
        if(root == null){
            return root;
        }
        if(value > root.data){
            root.right=delete(root.right, value);
        }else if(value < root.data){
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