import java.util.Scanner;
public class binarysearchtree{
    //node class that defines BST node
    class Node {
        int key;
        Node left, right;

        public Node(int data) {
            key = data;
            left = right = null;
        }
    }

    // BST root node
    Node root;

    // Constructor for BST =>initial empty tree
    binarysearchtree() {
        root = null;
    }
    void insert(int key)  {
        root = insert_Recursive(root, key);
    }

    //recursive insert function
    Node insert_Recursive(Node root, int key) {
        //tree is empty
        Node newnode=new Node(key);
        if (root == null) {
            root = newnode;
            return root;
        }
        //traverse the tree
        if (key < root.key)     //insert in the left subtree
            root.left = insert_Recursive(root.left, key);
        else if (key > root.key)    //insert in the right subtree
            root.right = insert_Recursive(root.right, key);
        // return pointer
        return root;
    }
    void inorder() {
        inorder_Recursive(root);
    }

    // recursively traverse the BST
    void inorder_Recursive(Node root) {
        if (root != null) {
            inorder_Recursive(root.left);
            System.out.print(root.key + " ");
            inorder_Recursive(root.right);
        }
    }

    public static void main(String[] args) {
        Scanner old =new Scanner(System.in);
        binarysearchtree bin=new binarysearchtree();
        int range=old.nextInt();
        for(int i=0;i<range;i++){
            int key=old.nextInt();
            bin.insert(key);
        }
        bin.inorder();

    }


}