package BST;

public class LevelOrderTraversal {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }
    static Node getNode(int data){
        Node node = new Node(data);
        return node;
    }
    static Node LevelOrder(Node root, int data){
        if (root == null){
            root = getNode(data);
            return root;
        }

        if (data <= root.data){
            root.left = LevelOrder(root.left, data);
        }
        else{
            root.right = LevelOrder(root.right, data);
        }
        return root;
    }

    static Node constructBST(int []arr){
        int n = arr.length;
        if (n == 0){
            return null;
        }
        Node root = null;

        for(int i = 0; i < n; i++){
            root = LevelOrder(root, arr[i]);
        }

        return root;
    }
}
