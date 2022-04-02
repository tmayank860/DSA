package BinaryTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal extends Node{
    public LevelOrderTraversal(int data) {
        super(data);
    }

    public static void main(String[] args) {
        Node root=new Node(1);                  //1
        root.left=new Node(2);                //2    3
        root.right=new Node(3);            //4    5
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        BFS(root);
//        System.out.println(isFullTree(root));
    }
    static void levelOrder(Node root){
        Queue<Node> queue =  new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node current=queue.remove();
            System.out.print(current.data+" => ");
            if (current.left!=null){
                queue.add(current.left);
            }
            if (current.right!=null){
                queue.add(current.right);
            }
        }
    }
    static void BFS(Node root){
        Queue<Node> queue =  new LinkedList<>();
        queue.add(root);
        int flag=0;
        ArrayList<ArrayList<Integer>> ls=new ArrayList<>();
        while (!queue.isEmpty()){
            ArrayList<Integer> ds=new ArrayList<>();
            int size=queue.size();
            for (int i=0;i< size;i++){
                Node current=queue.remove();
                ds.add(current.data);
                if (current.left!=null){
                    queue.add(current.left);
                }
                if (current.right!=null){
                    queue.add(current.right);
                }
            }
            if (flag==0){
                ls.add(ds);
                flag=1;
            }else {
                Collections.reverse(ds);
           ls.add(ds);
           flag=0;
            }
        }
        System.out.println(ls);
    }
    static boolean isFullTree(Node node)
    {
        //add code here.
        if(node==null){
            return true;
        }
        if(node.left==null&&node.right!=null||node.left!=null&&node.right==null){
            return false;
        }
        isFullTree(node.left);
        isFullTree( node.right);
        return true;

    }

}
