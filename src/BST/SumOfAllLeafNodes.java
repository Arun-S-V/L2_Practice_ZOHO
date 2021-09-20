package BST;

import java.util.Stack;

public class SumOfAllLeafNodes {
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

    void sumOfLeafNodes(Node root) {
        System.out.println();
        int sum = 0;
        if (root == null) {
            return;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node node = stack.pop();

            if (node.right != null) {
                stack.add(node.right);
            }
            if (node.left != null) {
                stack.add(node.left);
            }
            if (node.left == null && node.right == null) {
                System.out.print(node.data + " ");
                sum = sum + node.data;
            }
        }
        System.out.println(sum);
    }
}
