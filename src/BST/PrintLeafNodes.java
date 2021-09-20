package BST;

public class PrintLeafNodes {
    BinaryTree.Node root;
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
    public void printLeafNodes(BinaryTree.Node node) {
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
    }
}
