package BinaryTree;

public class DepthFirstSearch extends Node{
    public DepthFirstSearch(int data) {
        super(data);
    }

    public static void main(String[] args) {
        Node root=new Node(1);                  //1
        root.left=new Node(2);                //2    3
        root.right=new Node(3);            //4    5
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        inOrder(root);
        System.out.println();
        preOrder(root);
        System.out.println();
        postOrder(root);
    }

    //INORDER TRAVERSAL LEFT-ROOT-RIGHT
    static void inOrder(Node root){
        if (root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+"=>");
        inOrder(root.right);

    }

    //PREORDER TRAVERSAL ROOT-LEFT-RIGHT
    static void preOrder(Node root){
        if (root==null){
            return;
        }
        System.out.print(root.data+"=>");
        preOrder(root.left);
        preOrder(root.right);
    }

    //POSTORDER TRAVERSAL LEFT-RIGHT-ROOT
    static void postOrder(Node root){
        if (root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+"=>");
    }
}
