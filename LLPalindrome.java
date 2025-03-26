class Node{
    int data;
    Node next;
    Node(int data, Node next){
        this.data= data;
        this.next= next;
    }
}

public class DataInsertPreview {
    public static Node swap(Node A){
        if(A==null || A.next==null) return A;
        Node demo= new Node(-1, null);
        demo.next=A;
        Node tail=demo;
        
        while(tail.next != null && tail.next.next != null){
            Node first=tail.next;
            Node second= first.next;

            first.next=second.next;
            second.next=first;
            tail.next= second;
            tail=first;
        }
        return demo.next;
    } 
    public static Node mergelist(Node A, Node B){
        if(A== null) return B;
        if(B== null) return A;
        Node Demo=new Node(-1, null);
        Node tail=Demo;
        while(A!=null && B!= null){
            if(A.data>tail.data){
                tail.next=A;
                A=A.next;
                tail.next=null;
            }else if(B.data>=tail.data){
                tail.next=B;
                B=B.next;
                tail.next=null;
            }
        }
        if(A==null){
            tail.next=B; 
        }
        if(B==null){
            tail.next=A; 
        }
        return Demo.next;
    }
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
        if(head==null || head.next==null) return head;
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
        Node third = new Node(3, null);
        Node forth = new Node(4, null);
        Node fifth = new Node(5, null);
        first.next=second;
        second.next= third;
        third.next=forth;
        forth.next=fifth;
        
        // Node middle = findMiddle(first);
        // Node MidNext= middle.next;
        // middle.next=null;
        // System.out.println(MidNext.data);
        // Node start = first;
        // Node temp= reverseLinkedNode(MidNext);
        // System.out.println(temp.data);
        // while(temp!= null && first!= null){
        //     if(temp.data != start.data){
        //         System.out.println("Not Palindrome");  
        //         return;   
        //     }
        //     temp=temp.next;
        //     start=start.next;
        // }
        // System.out.println("Palindrome");     
        Node start= swap(first);
        while(start != null){
            System.out.println(start.data);
            start=start.next;
        }

        // System.out.println(middle.data);
    }
}
