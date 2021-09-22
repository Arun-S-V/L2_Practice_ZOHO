package BST;

public class SearchInBST {

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
    public Node searchBST(Node root,int val) {
        if (root == null)
            return null;
        else if (root.data == val)
            return root;
        else if (root.data < val)
            return searchBST(root.right, val);
        else
            return searchBST(root.left, val);
    }
}
