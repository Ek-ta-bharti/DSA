import java.util.*;

class Node {
    int data;
    Node left = null;
    Node right = null;

    Node(int data) {
        this.data = data;
    }
}

class QueueTree {
    public static ArrayList<Integer> levelOrder(Node node) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (node == null) {
            return ans;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(node);

        while (!q.isEmpty()) {
            Node n = q.remove();
            ans.add(n.data);

            if (n.left != null) {
                q.add(n.left);
            }
            if (n.right != null) {
                q.add(n.right);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(13);
        root.right = new Node(9);
        root.left.left = new Node(4);
        root.left.right = new Node(6);
        root.right.left = new Node(6);
        root.right.right = new Node(6);

        System.out.println(levelOrder(root));
    }
}
