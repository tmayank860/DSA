package LeetCodeJuly;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversalII {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ls=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        int max_width=0;
        q.add(root);
        while (!q.isEmpty()){
            int queue_size=q.size();
            List<Integer> current_level=new ArrayList<>();
            for (int i=0;i<queue_size;i++){
                TreeNode current=q.remove();
                current_level.add(current.val);
                if (current.left!=null){
                    q.add(current.left);
                }
                if (current.right!=null){
                    q.add(current.right);
                }
            }
            ls.add(current_level);

        }
        return ls;
    }
    public static void levelorder(TreeNode root){
        List<List<Integer>> ls=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            TreeNode current=q.remove();
            System.out.print(current.val+" --> ");
            if (current.left!=null){
                q.add(current.left);
            }
            if (current.right!=null){
                q.add(current.right);
            }
        }

    }
}
