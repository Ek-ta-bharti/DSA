// Node class representing each node in the binary tree
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

// Binary tree class with inorder traversal method
class BinaryTree {
    TreeNode root;

    public BinaryTree() {
        this.root = null;
    }

    // Method to perform inorder traversal recursively
    public void inorderTraversal(TreeNode node) {
        if (node != null) {
            inorderTraversal(node.left); // Traverse left subtree
            System.out.print(node.val + " "); // Visit the root
            inorderTraversal(node.right); // Traverse right subtree
        }
    }

    public static void main(String[] args) {
        // Creating a sample binary tree
        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);

        System.out.println("Inorder traversal of binary tree:");
        tree.inorderTraversal(tree.root);
    }
}
