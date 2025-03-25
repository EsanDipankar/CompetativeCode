class Node{
    int data;
    Node next;
    Node(int data, Node next){
        this.data= data;
        this.next= next;
    }
}

public class LLPalindrome {
    public static Node findMiddle(Node head){
        Node fast=head.next;
        Node slow= head;
        while(fast != null && fast.next!= null){
            fast=fast.next;
            slow= slow.next;
            fast=fast.next;
        }
        return slow;
    }
    public static Node reverseLinkedNode(Node head){
        Node cur=head;
        Node prev= null;
        Node NextNode= null;
        while(cur != null){
            NextNode=cur.next;
            cur.next=prev;
            prev=cur;
            cur=NextNode;
        }
        return prev;
    }
    public static void main(String args[]){
        Node first = new Node(1, null);
        Node second= new Node(2, null);
        Node third = new Node(4, null);
        Node forth = new Node(1, null);
        first.next=second;
        second.next= third;
        third.next=forth;
        
        Node middle = findMiddle(first);
        Node MidNext= middle.next;
        middle.next=null;
        System.out.println(MidNext.data);
        Node start = first;
        Node temp= reverseLinkedNode(MidNext);
        System.out.println(temp.data);
        while(temp!= null && first!= null){
            if(temp.data != start.data){
                System.out.println("Not Palindrome");  
                return;   
            }
            temp=temp.next;
            start=start.next;
        }
        System.out.println("Palindrome");     


        // System.out.println(middle.data);
    }
}