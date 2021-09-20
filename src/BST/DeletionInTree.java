package BST;


public class DeletionInTree {
        // Function to delete a node from BST.
    Node root;
    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    static Node deleteNode(Node root, int X) {
        if (root == null) {
            return null;
        }
        if (X > root.data) {
            root.right = deleteNode(root.right, X);
        } else if (root.data > X) {
            root.left = deleteNode(root.left, X);
        } else {
            if (root.left != null && root.right != null) {
                int left_max = new DeletionInTree().lmax(root.left);
                root.data = left_max;
                root.left = deleteNode(root.left, left_max);
                return root;
            } else if (root.left != null) {
                return root.left;
            } else if (root.right != null) {
                return root.right;
            } else {
                return null;
            }
        }
        return root;
    }

    int lmax(Node root) {
        if (root.right != null) {
            return lmax(root.right);
        }
        else {
            return root.data;
        }
    }
}
