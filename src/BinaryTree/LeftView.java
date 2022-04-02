package BinaryTree;

import java.util.ArrayList;

public class LeftView {
    public static void main(String[] args) {

    }
    ArrayList<Integer> leftView(Node root)
    {
        // Your code here
        ArrayList<Integer> ls=new ArrayList<>();
        if(root==null){
            return ls;
        }
       left(root,ls,0);
        return ls;
    }
    static void left(Node root, ArrayList<Integer> ls, int level){
        if (root==null){
            return;
        }
        if (level==ls.size()){
            ls.add(root.data);
        }
        left(root.left,ls,level+1);
        left(root.right,ls,level+1);
    }
}
