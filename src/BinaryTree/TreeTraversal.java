package BinaryTree;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left,right;

     public Node(int data) {
         this.data = data;
     }
 }

public class TreeTraversal {
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(5);
        root.right=new Node(20);
        root.left.left=new Node(3);
        root.left.right=new Node(7);
        root.right.left=new Node(15);
        root.right.right=new Node(6);
//        inOrder(root);
//        System.out.println();
//        preOrder(root);
//        System.out.println();
//        postOrder(root);
        levelorder(root);
//System.out.print(height(root));
//        int[] arr={1,2,3,4,5,6,7,8,9,10};
//        alternate(arr);
    }
    public static void inOrder(Node root){
        if (root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" --> ");
        inOrder(root.right);
    }
    public static void postOrder(Node root){
        if (root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" --> ");
    }
    public static void preOrder(Node root){
        if (root==null){
            return;
        }
        System.out.print(root.data+" --> ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void levelorder(Node root){
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            Node current=q.remove();
            System.out.print(current.data+" --> ");
            if (current.left!=null){
                q.add(current.left);
            }
            if (current.right!=null){
                q.add(current.right);
            }
        }

    }
    public static int height(Node root){
        // Your code here
        if (root==null){
            return 0;
        }
        int h_left=height(root.left);
        int h_right=height(root.right);

        return Math.max(h_left,h_right)+1;
    }

    public static void alternate(int[] arr){
        for(int i=0;i<=9;i++){
            if((i+1)%2!=0){
                System.out.print(arr[i]);
            } 
        }
    }
}
