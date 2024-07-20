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

//3 . Height of Nodes 

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

//     public static int height(Node root) {
//         if (root == null) {
//             return 0;
//         }
//         int leftHeight = height(root.left);
//         int rightHeight = height(root.right);

//         int myHeight = Math.max(leftHeight, rightHeight) + 1;

//         return myHeight;
//     }

//     public static void main(String[] args) {
//         int node[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
//         BinaryTree tree = new BinaryTree();
//         Node root = tree.buildTree(node);
//         System.out.println("Height of Tree = " + height(root));
//     }
// }

// Interview Questionn....
// 4 . Diameter Of a Tree : no. of nodes in longest path bett. any 2 Nodes
// NODE is Included 
//Time Complex O(n*n)

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

//     public static int height(Node root) {
//         if (root == null) {
//             return 0;
//         }
//         int leftHeight = height(root.left);
//         int rightHeight = height(root.right);

//         int myHeight = Math.max(leftHeight, rightHeight) + 1;

//         return myHeight;
//     }

//     public static int Diameter(Node root) {
//         if (root == null) {
//             return 0;
//         }

//         int daim1 = Diameter(root.left);
//         int daim2 = Diameter(root.right);
//         int daim3 = height(root.left) + height(root.right) + 1;

//         return Math.max(daim3, Math.max(daim1, daim2));

//     }

//     public static void main(String[] args) {
//         int node[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
//         BinaryTree tree = new BinaryTree();
//         Node root = tree.buildTree(node);
//         System.out.println("Height of Tree = " + height(root));
//         System.out.print("Approach 1 = ");
//         System.out.print("Diameter of Tree with Node  = " + Diameter(root));

//     }
// }

// Approach 2 Node Is not Included
//Time compx O(n) : Linear Time Complex

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

//     public static int height(Node root) {
//         if (root == null) {
//             return 0;
//         }
//         int leftHeight = height(root.left);
//         int rightHeight = height(root.right);

//         int myHeight = Math.max(leftHeight, rightHeight) + 1;

//         return myHeight;
//     }

//     static class TreeInfo {

//         int ht;
//         int diam;

//         TreeInfo(int ht, int diam) {
//             this.ht = ht;
//             this.diam = diam;
//         }
//     }

//     public static TreeInfo diameter2(Node root) {

//         if (root == null) {
//             return new TreeInfo(0, 0);
//         }
//         TreeInfo left = diameter2(root.left);
//         TreeInfo right = diameter2(root.right);

//         int myHeight = Math.max(left.ht, right.ht);

//         int daim1 = left.diam;
//         int daim2 = right.diam;
//         int daim3 = left.ht + right.ht + 1;

//         int mydaim = Math.max(Math.max(daim1, daim2), daim3);

//         TreeInfo mInfo = new TreeInfo(myHeight, mydaim);
//         return mInfo;
//     }

//     public static int Diameter(Node root) {
//         if (root == null) {
//             return 0;
//         }

//         int daim1 = Diameter(root.left);
//         int daim2 = Diameter(root.right);
//         int daim3 = height(root.left) + height(root.right) + 1;

//         return Math.max(daim3, Math.max(daim1, daim2));

//     }

//     public static void main(String[] args) {
//         int node[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
//         BinaryTree tree = new BinaryTree();
//         Node root = tree.buildTree(node);
//         System.out.println("Height of Tree = " + height(root));

//         System.out.print(diameter2(root).diam);

//     }
// }

// 5 . SubTree of Another Tree 

public class binary {

    public static void main(String[] args) {
        System.out.println("Subtree");
    }
}
