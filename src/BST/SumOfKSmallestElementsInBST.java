package BST;

import java.util.ArrayList;

public class SumOfKSmallestElementsInBST {
    Node root;
    ArrayList<Integer> list = new ArrayList<>();
    int sum1  = 0;
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
    SumOfKSmallestElementsInBST(){
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
    int sumHelper(int k){
        int sum1 = sum(root,k);
        return sum1;
    }
    int sum(Node root, int k) {
        ArrayList<Integer> result = inorder(root);
        for(int i =0;i<k;i++){
            sum1 = sum1 + result.get(i);
        }
        return sum1;
    }
    ArrayList<Integer> inorder(Node root){
        ArrayList<Integer> list2 = inorderRec(root);
        return list2;
    }
    ArrayList<Integer> inorderRec(Node root){
        if (root != null) {
            inorderRec(root.left);
            list.add(root.data);
            inorderRec(root.right);
        }
        return list;
    }
    public static void main(String args[]){
        SumOfKSmallestElementsInBST bt = new SumOfKSmallestElementsInBST();
        bt.add(31);
        bt.add(41);
        bt.add(12);
        bt.add(53);
        bt.add(8);
        int k = 3;
        int sum1  = bt.sumHelper(k);
        System.out.println(sum1);
    }
}
