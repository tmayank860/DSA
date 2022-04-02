package BinaryTree;

import java.util.*;

public class VerticalTraversal {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(20);
        root.left.left = new Node(3);
        root.left.right = new Node(7);
        root.right.left = new Node(15);
        root.right.right = new Node(6);
        root.left.left.right = new Node(9);
        root.left.left.right.left = new Node(91);
        VerticalTraversal vt=new VerticalTraversal();
        System.out.println(vt.verticalTraversal1(root));
    }

    public static List<List<Integer>> verticalTraversal(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();
        int currentC = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int[] width = new int[2];
        width[0] = min;
        width[1] = max;
        List<Integer> ls = new ArrayList<>();
        traverse(root, map, ls, currentC, width);
        System.out.println(map);
        for (int i = width[0]; i <= width[1]; i++) {
            res.add(new ArrayList<>(map.get(i)));
        }
        return res;
    }

    static void traverse(Node root, Map<Integer, List<Integer>> map, List<Integer> ls, int currentC, int[] width) {
        if (root == null) {
            return;
        }
        width[0] = Math.min(width[0], currentC);
        width[1] = Math.max(width[1], currentC);
        if (map.containsKey(currentC)) {
            ls = map.get(currentC);
        } else {
            ls = new ArrayList<>();
        }
        ls.add(root.data);
        map.put(currentC, ls);
        traverse(root.left, map, ls, currentC - 1, width);
        traverse(root.right, map, ls, currentC + 1, width);
    }

    class Tuple {
        Node node;
        int row;
        int col;

        public Tuple(Node _node, int _col, int _row) {
            node = _node;
            row = _row;
            col = _col;
        }
    }

        public List<List<Integer>> verticalTraversal1(Node root) {

            List<List<Integer>> res = new ArrayList<>();
            TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
            Queue<Tuple> q = new LinkedList<Tuple>();
            q.offer(new Tuple(root, 0, 0));
            while (!q.isEmpty()) {
                Tuple tuple = q.poll();
                Node node = tuple.node;
                int x = tuple.row;
                int y = tuple.col;
                if (!map.containsKey(y)) {
                    map.put(y, new TreeMap<>());
                }
                if (!map.get(y).containsKey(x)) {
                    map.get(y).put(x, new PriorityQueue<>());
                }
                map.get(y).get(x).offer(node.data);
                if (node.left != null) {
                    q.offer(new Tuple(node.left, y - 1, x + 1));
                }
                if (node.right != null) {
                    q.offer(new Tuple(node.right, y + 1, x + 1));
                }
            }
            for (TreeMap<Integer, PriorityQueue<Integer>> qu:map.values()){
                res.add(new ArrayList<>());
                for (PriorityQueue<Integer> p: qu.values()){
                    while (!p.isEmpty()){
                        res.get(res.size()-1).add(p.poll());
                    }
                }
            }
            return res;
        }

    }

