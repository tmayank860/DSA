package BinaryTree;

public class BalancedBinaryTree {
    public static void main(String[] args) {

    }
    public boolean isBalanced(Node root) {
        if(root==null){
            return true;
        }

        if((Math.abs(maxDepth(root.left)-maxDepth(root.right)))<=1){
            return (isBalanced(root.left) && isBalanced(root.right));
        }else{
            return false;
        }

    }
    public int maxDepth(Node root) {
        if (root==null){
            return 0;
        }
        int lHeight=maxDepth(root.left);
        int rHeight=maxDepth(root.right);
        return Math.max(lHeight,rHeight)+1;
    }
}
