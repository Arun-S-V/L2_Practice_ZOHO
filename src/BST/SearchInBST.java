package BST;

public class SearchBST {

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
    public Node searchInBST(Node root,int val) {
        if (root == null)
            return null;
        else if (root.data == val)
            return root;
        else if (root.data < val)
            return searchInBST(root.right, val);
        else
            return searchInBST(root.left, val);
    }
}
