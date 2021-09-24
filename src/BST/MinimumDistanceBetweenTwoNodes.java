package BST;

import java.util.ArrayList;
import java.util.List;

public class MinimumDistanceBetweenTwoNodes {
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
    MinimumDistanceBetweenTwoNodes(){
        root = null;
    }
    public int minDiffInBST(Node root) {
        List<Integer> list = new ArrayList<>();
        inOrder(root, list);
        int min = list.get(0);
        for(int i = 0; i < list.size()-1; i++)
            if(min > list.get(i+1)-list.get(i))
                min = list.get(i+1)-list.get(i);
        return min;
    }
    public void inOrder(Node t, List<Integer> l){
        if(t == null) return;
        inOrder(t.left, l);
        l.add(t.data);
        inOrder(t.right, l);
    }
    public static void main(String args[]){
        MinimumDistanceBetweenTwoNodes bt = new MinimumDistanceBetweenTwoNodes();
    }
}
