package BST;

public class SumOfLeafNodes {
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
    int sum = 0;

    SumOfLeafNodes(){
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
    public int leaf(){
        int sum =printSumOfLeafNode(root);
        return sum;
    }
    public int printSumOfLeafNode(Node node){
        if(node == null){
            return sum;
        }
        if(node.left == null && node.right == null){
            sum = sum + node.data;
            //System.out.println(node.data);
        }
        printSumOfLeafNode(node.left);
        printSumOfLeafNode(node.right);
        return sum;
    }
    public static void main(String args[]){
        SumOfLeafNodes bt = new SumOfLeafNodes();
        bt.add(3);
        bt.add(1);
        bt.add(21);
        bt.add(5);
        bt.add(81);
        int sum = bt.leaf();
        System.out.println(sum);
    }
}
