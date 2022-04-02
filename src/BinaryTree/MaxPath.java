package BinaryTree;

public class MaxPath {
    public static void main(String[] args) {

    }
    public int maxPathSum(Node root) {
       if (root==null){
           return 0;
       }
       int[] maxSum=new int[1];
       maxSum[0]=Integer.MIN_VALUE;
       maxDepth(root,maxSum);
       return maxSum[0];
    }
    public static int maxDepth(Node root,int[] maxHeight) {
       if(root==null){
           return 0;
       }
       int lHeight=Math.max(0,maxDepth(root.left,maxHeight));
       int rHeight=Math.max(0,maxDepth(root.right,maxHeight));
       maxHeight[0]=Math.max(maxHeight[0],lHeight+rHeight+root.data);
       return Math.max(lHeight,rHeight)+root.data;
    }
}
