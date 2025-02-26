import java.util.*;
class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}
public class Deserilized {
    public static void main(String[] args){
        int[] arr= {1,2,3,4,-1,-1};
        int n=arr.length-1;
        Node root= gererateTree(arr, 0, n);
        
    }
    public static Node gererateTree(int[] arr, int i, int n){
        Queue<Node> Q= new LinkedList<Node>();
        Node root = new Node(arr[0]);
        Q.add(root);
        i=1;
        while(!Q.isEmpty() && i < arr.length){
            Node curr= Q.poll();
            if(i<=n){
                if(arr[i] != -1){
                    Node newNode = new Node(arr[i]);
                    curr.left= newNode;
                    Q.add(newNode);
                }
                else{
                    curr.left=null;
                }
                i++;
            }
            if(i<=n){
                if(arr[i] != -1){
                    Node newNode = new Node(arr[i]);
                    curr.right= newNode;
                    Q.add(newNode);
                }
                else{
                    curr.right=null;
                }
                i++;
            }
        }
        return root;
    }
}
