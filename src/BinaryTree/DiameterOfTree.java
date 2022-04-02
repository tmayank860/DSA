package BinaryTree;

public class DiameterOfTree {
    public static void main(String[] args) {

    }
    static int maxHeight=0;
    public static int diameterOfBinaryTree(Node root) {
        if (root==null){
            return -1;
        }
        int []maxHeight=new int[1];
        maxHeight[0]=0;
        maxDepth(root,maxHeight);
        // // maxHeight=Math.max(maxHeight,maxDepth(root.right));

        return maxHeight[0];
    }
    public static int maxDepth(Node root,int[] maxHeight) {
        if (root==null){
            return 0;
        }
        int lHeight=maxDepth(root.left,maxHeight);
        int rHeight=maxDepth(root.right,maxHeight);
        maxHeight[0]=Math.max (maxHeight[0],lHeight+rHeight);
        return Math.max(lHeight,rHeight)+1;
    }
}
