package BinaryTree;

import java.util.*;

public class LeftRightNode {
    public static void main(String[] args) {
        Node node=new Node(1);
        node.left=new Node(2);
        node.right=new Node(3);
        node.right.left=new Node(5);
        node.right.right=new Node(6);
        node.right.right.left=new Node(9);
        node.right.right.right=new Node(10);
        node.left.left=new Node(4);
        node.left.left.left=new Node(7);
        node.left.left.right=new Node(8);
        System.out.println(printLeftRightMostNodes(node));
    }
    public static List<Integer> printLeftRightMostNodes(Node root) {
        // Write your code here.
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            int s=q.size();
            List<Integer> ls=new ArrayList<>();
            for (int i=0;i<s;i++){
                Node current=q.remove();
                ls.add(current.data);
                if (current.left!=null) {
                    q.offer(current.left);
                }
                if (current.right!=null) {
                    q.offer(current.right);
                }
            }
            res.add(new ArrayList<>(ls));
        }
        for (List<Integer> l:res
             ) {
            if (l.size()==1){
                list.add(l.get(0));
            }else {
                list.add(l.get(0));
                list.add(l.get(l.size()-1));
            }
        }
        return list;
    }
}
