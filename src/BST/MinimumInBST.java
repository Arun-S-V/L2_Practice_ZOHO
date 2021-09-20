package BST;

public class MinimumInBST {
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

    MinimumInBST(){
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
        minValue(root);
    }
    public void minValue(Node node){
        Node current = node;
        while(current.left != null){
            current = current.left;
        }
        System.out.println(current.data);
    }
    public static void main(String args[]){
        MinimumInBST bt = new MinimumInBST();
        bt.add(3);
        bt.add(1);
        bt.add(21);
        bt.add(5);
        bt.add(8);
        bt.max();
    }
}
