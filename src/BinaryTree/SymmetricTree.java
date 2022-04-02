package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree {
    public static void main(String[] args) {

    }
    //ITERATIVE
    boolean symmetricTree(Node root){
        if(root==null||root.left==null&&root.right==null){
            return true;
        }
        Queue<Node> qLeft=new LinkedList<>();
        Queue<Node> qRight=new LinkedList<>();
        qLeft.add(root.left);
        qRight.add(root.right);
        while (!qLeft.isEmpty()&&!qRight.isEmpty()){
            Node left=qLeft.poll();
            Node right=qRight.poll();
            if (left==null&&right==null){
                continue;
            }if (left==null||right==null){
                return false;
            }
            if (left.data!=right.data){
                return false;
            }
            qLeft.add(left.left);
            qLeft.add(left.right);
            qRight.add(right.left);
            qRight.add(right.right);
        }
        return true;
    }

//RECURSIVE
boolean symmetricTreeRec(Node root){
    if(root==null||root.left==null&&root.right==null){
        return true;
    }
    return symmetric(root.left,root.right);
}
static boolean symmetric(Node left,Node right){
        if (left==null||right==null){
            return left==right;
        }
        if (left.data!=right.data){
            return false;
        }
        return symmetric(left.left,right.right)&&symmetric(left.right,right.left);
}
    boolean isIsomorphic(Node root1, Node root2)
    {
        // code here.
        if(root1==null&&root2==null){
            return true;
        }
        if(root1==null||root2==null){
            return root1==root2;
        }
        if(root1.data!=root2.data){
            return false;
        }
        return isIsomorphic(root1.left,root2.right)&&isIsomorphic(root1.right,root2.left);
    }
}
