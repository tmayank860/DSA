package BinaryTree;

import java.util.ArrayList;

public class BoundaryTraversal {
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(5);
        root.right=new Node(20);
        root.left.left=new Node(3);
        root.left.right=new Node(7);
        root.right.left=new Node(15);
        root.right.right=new Node(6);
        root.left.left.right=new Node(9);
        root.left.left.right.left=new Node(91);
        boundary(root);
    }
    static boolean isLeaf(Node root){
        return root.left==null&&root.right==null;
    }
    static ArrayList<Integer> boundary(Node root){
        ArrayList<Integer> ls=new ArrayList<>();
        ls.add(root.data);
        leftInsert(root.left,ls);
        insterLeaf(root,ls);
        rightInsert(root.right,ls);
        System.out.println(ls);
        return ls;
    }
    static void leftInsert(Node left,ArrayList<Integer> ls){
        while (left!=null){
            if (isLeaf(left)==false){
                ls.add(left.data);
            }
            if (left!=null){
                left=left.left;
            }else {
                left=left.right;
            }
        }
    }
    static void rightInsert(Node right,ArrayList<Integer> ls) {
        ArrayList<Integer> temp=new ArrayList<>();
        while (right != null) {
            if (isLeaf(right)==false) {
                temp.add(right.data);
            }
            if (right != null) {
                right = right.right;
            } else {
                right = right.left;
            }
        }
        for (int i=temp.size()-1;i>=0;i--){
            ls.add(temp.get(i));
        }
    }
    static void insterLeaf(Node root,ArrayList<Integer> ls){
        if (isLeaf(root)) {
            ls.add(root.data);
            return;
        }
        if (root.left != null) insterLeaf(root.left, ls);
        if (root.right != null) insterLeaf(root.right, ls);
    }
}
