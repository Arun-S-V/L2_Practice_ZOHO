package BST;


import java.util.ArrayList;
import java.util.Stack;

public class BinaryTree {
    Node root;
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }

    BinaryTree(){
        root = null;
    }

    private Node addRecursive(Node current, int data){
        if (current == null) {
            return new Node(data);
        }
        if (data < current.data) {
            current.left = addRecursive(current.left, data);
        }
        else if (data > current.data) {
            current.right = addRecursive(current.right, data);
        }
        else {
            // value already exists
            return current;
        }
        return current;
    }

    public void add(int data) {
        root = addRecursive(root, data);
    }

    void inorder()
    {
        inorderRec(root);
    }
    void inorderRec(Node root)
    {
        if (root != null) {
            System.out.println(root.data);
            inorderRec(root.left);
            inorderRec(root.right);
        }
    }

     public static void main(String args[]){
        BinaryTree bt = new BinaryTree();
        bt.add(3);
        bt.add(1);
        bt.add(2);
        bt.add(5);

        bt.add(8);
//        bt.add(7);
//        bt.add(35);
//        bt.add(33);
//        bt.add(37);
        bt.inorder();
        bt.leaf();
        //System.out.println(bt);
    }
    public void printLeafNodes(Node node) {
        if (node == null) {
            return ;
        }
        if (node.left == null && node.right == null) {
            System.out.print(node.data+" ");
        }
        printLeafNodes(node.left);
        printLeafNodes(node.right);
    }
    public void leaf(){
        printLeafNodes(root);
        sumOfLeafNodes(root);
    }
    public static int sumOfLeafNodes(Node root) {
        System.out.println();
        int sum = 0;
        if (root == null) {
            return sum;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node node = stack.pop();

            if (node.right != null) {
                stack.add(node.right);
            }

            if (node.left != null) {
                stack.add(node.left);
            }
            if (node.left == null && node.right == null) {
                System.out.print(node.data + " ");
                sum = sum + node.data;
            }

        }
        System.out.println(sum);
        return 1000;
    }
}
