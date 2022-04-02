package BinaryTree;

public class FullBinaryTree {
    public static void main(String[] args) {

    }
    boolean isFullTree(Node node)
    {
        //add code here.
        if(node==null){
            return true;
        }
        if(node.left==null&&node.right==null){
            return true;
        }
        if(node.left!=null&&node.right!=null){
            return isFullTree(node.left)&&isFullTree(node.right);
        }
        return false;
    }
}
