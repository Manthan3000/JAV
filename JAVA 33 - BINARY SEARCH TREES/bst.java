// package JAVA 33 - BINARY SEARCH TREES;

// Build A BST
public class bst {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;

        }

        if (root.data > val) {
            // left SubTree
            root.left = insert(root.left, val);

        } else {
            // right Subtree
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
        System.out.print(root.right + " ");
    }

    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data > key) {
            // BST LEFT
            return search(root.left, key);
        }

        else if (root.data == key) {
            return true;
        }

        else {
            // BST RIGHT
            return search(root.right, key);
        }

    }

    public static Node delete(Node root, int val) {

        if (root.data > val) {
            root.left = delete(root.left, val);
        } else if (root.data < val) {
            root.right = delete(root.right, val);
        } else {
            // Case 1 :
            if (root.left == null && root.right == null) {
                return null;
            }

            // Case 2 :
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Case 3 :

            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);

        }
        return root;

    }

    // Find In Order Successor MOST IMP
    public static Node inorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void main(String[] args) {

        int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        // [1,2.3,4,5,7]
        Node root = null;
        // ADD IN TREE
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        // Q 1 BUILD BST
        inOrder(root); // 1,3,4,5,6,8,10,11,14
        System.out.println();

        // Q 2 BST SEARCH NODE O(H)
        if (search(root, 5)) {// 5 found
            System.out.println(" found ");
        } else {
            System.out.println("Not Found ");
        }

        // Q 3 DELETE NODE
        delete(root, 10);// 10 is delete
        inOrder(root);// 11,3,4,5,6,11,14
    }
}
