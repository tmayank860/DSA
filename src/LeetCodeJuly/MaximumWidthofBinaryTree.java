package LeetCodeJuly;
import java.util.*;

// * Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class MaximumWidthofBinaryTree {
    public static void main(String[] args) {

    }

    public static int widthOfBinaryTree(TreeNode root) {
        TreeNode current = root;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(current);
        Map<TreeNode, Integer> posDic = new HashMap<>();
        int max_width = Integer.MIN_VALUE;
        while (!queue.isEmpty()) {
            int size = queue.size();
            int left = -1;
            for (int i = 0; i < size; i++) {
                TreeNode n = queue.poll();
                if (i == 0)
                    left = posDic.getOrDefault(n, 1); //first polled node from queue is the left side of the tree in same level
                if (n.left != null) {
                    queue.offer(n.left);
                    posDic.put(n.left, posDic.getOrDefault(n, 1) * 2);
                }
                if (n.right != null) {
                    queue.offer(n.right);
                    posDic.put(n.right, posDic.getOrDefault(n, 1) * 2 + 1);
                }
                max_width = Math.max(max_width, posDic.getOrDefault(n, 1) - left + 1);
            }
        }
        return max_width;
    }

    private int max = 1;

    public int widthOfBinaryTreeOpt(TreeNode root) {
        if (root == null) return 0;
        List<Integer> startOfLevel = new LinkedList<>();
        helper(root, 0, 1, startOfLevel);
        return max;
    }

    public void helper(TreeNode root, int level, int index, List<Integer> list) {
        if (root == null) return;
        if (level == list.size()) list.add(index);
        max = Math.max(max, index + 1 - list.get(level));
        helper(root.left, level + 1, index * 2, list);

    }
}
