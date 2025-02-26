import java.util.*;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class pathsum{
    public static int checkNode(Node A, int B){
        if(A==null) return 0;
        if(A.left==null && A.right== null && B==A.data){
            return 1;
        }
        if (checkNode(A.left, B - A.data) == 1 || checkNode(A.right, B - A.data) == 1) {
            return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
       // Sample Tree:
        //         1
        //        / \
        //       2   3
        //      / \   \
        //     4   5   6
        //    /
        //   7
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        root.left.left.left = new Node(7);

        int a= checkNode(root, 8);
        System.out.println(a);
      
    }
}