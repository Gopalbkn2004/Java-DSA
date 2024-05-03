import java.util.*;

public class Reverse_LInkedLIst {
    
    public Node head;
    public int size=0;
    public class Node{
        int data;
        Node next ;
        Node(int data)
        {
            this.data=data;
            next=null;
        }
    }
    public void addFirst(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
           // System.out.print("Linked list is Empty");
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void addlast(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
           // System.out.print("Linked list is Empty");
            head=newNode;
            return;
        }
        Node lastNode=head;
        while(lastNode.next!=null)
        {
            lastNode=lastNode.next;
        }
        lastNode.next=newNode;
    }


    public void ReverseLoop()
    {
        if(head==null || head.next==null )
        {
            return;
        }
        Node prev=head;
        Node curr=head.next;
        while(curr!=null)
        {
            Node nextNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
        }
        head.next=null;
        head=prev;
    } 
    public Node ReverseRecursive(Node head)
    {
        if(head==null || head.next==null )
        {
            return head;
        }
        Node newnode=ReverseRecursive(head.next);
        head.next.next=head;
        head.next=null;
        return newnode;
    }
    void printLL()
    {
        Node lastNode=head;
        while(lastNode!=null)
        {
            System.out.print(lastNode.data+" ");
            lastNode=lastNode.next;
        }
        System.out.println(" ");
    }
    public static void main(String[] args) {
        Reverse_LInkedLIst l1=new Reverse_LInkedLIst();
        //LinkedList<Integer> l1=new LinkedList<Integer>();
        l1.addFirst(1);
        l1.addFirst(2);
        l1.addFirst(3);
        l1.addFirst(4);
        l1.printLL();
        l1.head=l1.ReverseRecursive(l1.head);
        l1.printLL();
    }
}
