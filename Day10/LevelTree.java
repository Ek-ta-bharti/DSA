
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }
}

class Max {
    public static boolean printLevel(TreeNode root, int level) {
        if (root == null) {
            return false;
        }
        if (level == 1) {
            System.out.println(root.val + " ");
            return true;
        }
        boolean left = printLevel(root.left, level - 1);
        boolean right = printLevel(root.right, level - 1);
        return (left || right);
    }

    public static void levelOrder(TreeNode root) {
        int level = 1;
        while (printLevel(root, level) == true) {
            level++;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(13);
        root.right = new TreeNode(9);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(6);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(6);
        levelOrder(root);
    }
}
