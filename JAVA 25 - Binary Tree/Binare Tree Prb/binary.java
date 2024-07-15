// Q 1 Count Of Nodes 
//ANS IS 6

// public class binary {

//     static class Node {
//         int data;
//         Node left;
//         Node right;

//         Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     static class BinaryTree {

//         static int idx = -1;

//         public Node buildTree(int nodes[]) {
//             idx++;
//             if (nodes[idx] == -1) {
//                 return null;
//             }

//             Node newNode = new Node(nodes[idx]);
//             newNode.left = buildTree(nodes);
//             newNode.right = buildTree(nodes);
//             return newNode;
//         }
//     }

//     public static int countNodes(Node root) {
//         if (root == null) {
//             return 0;
//         }
//         int leftNode = countNodes(root.left);
//         int rightNode = countNodes(root.right);
//         return rightNode + leftNode + 1;
//     }

//     public static void main(String[] args) {
//         int node[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
//         BinaryTree tree = new BinaryTree();
//         Node root = tree.buildTree(node);
//         System.out.println("Total Count of Nodes = " + countNodes(root));
//     }
// }

//2 . Sum Of Nodes 

//ANS IS 21

// public class binary {

//     static class Node {
//         int data;
//         Node left;
//         Node right;

//         Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     static class BinaryTree {

//         static int idx = -1;

//         public Node buildTree(int nodes[]) {
//             idx++;
//             if (nodes[idx] == -1) {
//                 return null;
//             }

//             Node newNode = new Node(nodes[idx]);
//             newNode.left = buildTree(nodes);
//             newNode.right = buildTree(nodes);
//             return newNode;
//         }
//     }

//     public static int sumNodes(Node root) {
//         if (root == null) {
//             return 0;
//         }
//         int leftSum = sumNodes(root.left);
//         int rightSum = sumNodes(root.right);

//         return leftSum + rightSum + root.data;
//     }

//     public static void main(String[] args) {
//         int node[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
//         BinaryTree tree = new BinaryTree();
//         Node root = tree.buildTree(node);
//         System.out.println("Sum of Nodes = " + sumNodes(root));
//     }
// }

//3 . Height of Tree 

public class binary {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {

        static int idx = -1;

        public Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    public static int sumNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftSum = sumNodes(root.left);
        int rightSum = sumNodes(root.right);

        return leftSum + rightSum + root.data;
    }

    public static void main(String[] args) {
        int node[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(node);
        System.out.println("Sum of Nodes = " + sumNodes(root));
    }
}
