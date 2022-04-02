package BinaryTree;

import java.util.*;

public class TopViewTree {
    static class Tuple {
        Node node;
        int col;

        public Tuple(Node _node, int _col) {
            node = _node;
            col = _col;
        }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(3);
        root.left.right = new Node(7);
        root.right.left = new Node(15);
        root.right.right = new Node(6);
        root.left.left.right = new Node(9);
        root.left.left.right.left = new Node(91);
        TopViewTree t=new TopViewTree();
        System.out.println( topView(root));
    }
     static ArrayList<Integer> topView(Node root)
    {
        // add your code
        ArrayList<Integer> res=new ArrayList<>();
        Map<Integer,ArrayList<Integer>> map=new TreeMap<>();
        Queue<Tuple> q=new LinkedList<>();
        q.offer(new Tuple(root,0));
        while (!q.isEmpty()){
            Tuple tp=q.poll();
            int y=tp.col;
            Node node=tp.node;
            if (!map.containsKey(y)){
                map.put(y,new ArrayList<>());
            }
            map.get(y).add(node.data);
            if (node.left!=null){
                q.offer(new Tuple(node.left,y-1));
            }if (node.right!=null){
                q.offer(new Tuple(node.right,y+1));
            }
            }
        for (Map.Entry<Integer,ArrayList<Integer>> m:map.entrySet()){

            res.add(m.getValue().get(m.getValue().size()-1));
        }
        return res;
        }

    }
}
