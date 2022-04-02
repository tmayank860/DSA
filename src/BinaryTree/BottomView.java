package BinaryTree;

import java.util.*;

public class BottomView {
    public static void main(String[] args) {

    }
    class Tuple {
        Node node;
        int col;

        public Tuple(Node _node, int _col) {
            node = _node;
            col = _col;
        }
    }
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root)
    {
        // Code here
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

