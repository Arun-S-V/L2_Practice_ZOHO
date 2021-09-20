package BST;

public class MaximumInBST {
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

    MaximumInBST(){
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
    public void max(){
        maxValue(root);
    }
    public void maxValue(Node node){
        Node current = node;
        while(current.right != null){
            current = current.right;
        }
        System.out.println(current.data);
    }
    public static void main(String args[]){
        MaximumInBST bt = new MaximumInBST();
        bt.add(3);
        bt.add(1);
        bt.add(21);
        bt.add(5);

        bt.add(8);
        bt.max();
    }
}
