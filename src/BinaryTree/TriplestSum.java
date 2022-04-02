package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TriplestSum {
    public static void main(String[] args) {
        Node root=new Node(5);
        root.left=new Node(3);
        root.right=new Node(7);
        root.left.left=new Node(2);
        root.left.right=new Node(4);
        root.right.left=new Node(6);
        root.right.right=new Node(8);
        triples(root,15);

    }
    static ArrayList<ArrayList<Integer>> triples(Node root,int target){
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        ArrayList<Integer> ls = new ArrayList<>();
        bfs(root,ls);
        for (int i=0;i< ls.size();i++){

            for (int j=i;j<ls.size();j++){
                for (int k=j;k< ls.size();k++){
                    ArrayList<Integer> temp=new ArrayList<>();
                    if (ls.get(i)+ls.get(j)+ls.get(k)==target){
                        temp.add(ls.get(i));
                        temp.add(ls.get(j));
                        temp.add(ls.get(k));
                    }
                    if (!temp.isEmpty())res.add(new ArrayList<>(temp));
                }
                }

            System.out.println(res);
            return res;
        }


       return res;
    }

    static void bfs(Node root, ArrayList<Integer> ls){
        if (root==null){
            return;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            Node current=q.poll();
            ls.add(current.data);
            if (current.left!=null){
                q.add(current.left);
            }
            if (current.right!=null){
                q.add(current.right);
            }
        }
    }

}
