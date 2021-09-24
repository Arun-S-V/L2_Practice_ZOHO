package BST;

public class TrimABST {
    TreeNode root;
    class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if (root == null) return null;
        if (root.data < low) {
            return trimBST(root.right, low, high);
        }
        if (root.data > high) {
            return trimBST(root.left, low, high);
        }
        root.left = trimBST(root.left, low, high);
        root.right = trimBST(root.right, low, high);
        return root;
    }
    public TreeNode trimHelp(int low ,int high){
        root = trimBST(root,low,high);
        return root;
    }
    public TreeNode addRecursive(TreeNode current,int data){
        if(current == null){
            return new TreeNode(data);
        }
        if(data<current.data){
            current.left = addRecursive(current.left,data);
        }
        if(data>current.data){
            current.right = addRecursive(current.right,data);
        }
        else{
            return current;
        }
        return current;
    }
    public void inOder(){
        inOrderRecursive(root);
    }
    public void inOrderRecursive(TreeNode root){
        if(root != null){
            System.out.println(root.data);
            inOrderRecursive(root.left);
            inOrderRecursive(root.right);
        }
    }
    public void add(int data){
        root = addRecursive(root,data);
    }
    public static void main(String args[]){
        int low =1;
        int high = 3;
        TrimABST bt = new TrimABST();
        bt.add(3);
        bt.add(0);
        bt.add(4);
        bt.add(2);
        bt.add(1);
        TreeNode node = bt.trimHelp(low,high);
        bt.inOrderRecursive(node);
    }
}
