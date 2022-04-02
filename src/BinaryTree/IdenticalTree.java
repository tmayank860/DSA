package BinaryTree;

import java.util.ArrayList;

public class IdenticalTree {
    public static void main(String[] args) {
        Node p=new Node(1);
        p.left=new Node(2);
        Node q=new Node(1);
        q.right=new Node(2);
        System.out.println(isSameTree(
                p,q
        ));

    }
    public static boolean isSameTree(Node p, Node q) {

        ArrayList<Integer> t1=new ArrayList<>();
        ArrayList<Integer> t2=new ArrayList<>();
        traversal(p,t1);
        traversal(q,t2);
        return t1.equals(t2);
    }
    static void traversal(Node root,ArrayList<Integer> ls){
        if (root==null){
            ls.add(null);
            return;
        }
        ls.add(root.data);
        traversal(root.left,ls);
        traversal(root.right,ls);
    }
}
