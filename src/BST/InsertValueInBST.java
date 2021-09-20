package BST;

public class InsertValueInBST {
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
    Node insert(Node root, int Key) {
        if(root == null){
            return new Node(Key);
        }

        if(root.data < Key){
            root.right = insert(root.right, Key);
        }

        else if(root.data > Key){
            root.left = insert(root.left, Key);
        }

        return root;

    }
}
