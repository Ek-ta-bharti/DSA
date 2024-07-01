
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
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        
        return Math.max(leftDepth, rightDepth) + 1;
    }
}

public class MaxDept {
    public static int height(TreeNode root){
        if(root == null){
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }
    public static void main(String[] args) {
      TreeNode root = new TreeNode(1);
      root.left = new TreeNode(13);
      root.right =new TreeNode(9);
      root.left.left =new TreeNode(4);
      root.left.right =new TreeNode(6);
      root.right.left =new TreeNode(6);
      root.right.right =new TreeNode(6);

      System.out.println("Height of tree is : " +height(root));
    }
}
