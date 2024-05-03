import java.util.Scanner;
public class LinkedList_Range {
    
   


    public Node head;
    int size;
    
    LinkedList_Range()
    {
        this.size=0;
    }
    public class Node{
        public int data;
        public Node next;

        public Node(int data)
        {
            size++;
            this.data=data;
            this.next=null;
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

    public void removeFirst()
    {
        if(head==null)
        {
            System.out.print("Linked list is Empty");
            return;
        }
        size--;
        head=this.head.next;
    }

    public void removeLast()
    {
        Node Cureent;
        Node last;
        if(head==null)
        {
            System.out.print("Linked list is Empty");
            return;
        }
        size--;
        if(head.next==null)
        {
            head=null;
            return;
        }
        Cureent=head;
        last=head.next;
        while(last.next!=null)
        {
            Cureent=Cureent.next;
            last=last.next;
        }
        Cureent.next=null; 

    }
    public void MiddleElementAdd(int index,int data)
    {
        if(index>size || index<0)
        {
            System.out.println("Invalid Index value");
            return ;
        }
        size++;
    Node newNode=new Node(data);
    if(head==null || index==0)
    {
        newNode.next=head;
        head=newNode;
        return;
    }
    Node currNode=head;

    for(int i=1;i<size;i++){
        if(i==index)
        {
            Node nextNode=currNode.next;
            currNode.next=newNode;
            newNode.next=nextNode;
            break;
        }
        currNode=currNode.next;
    }
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
    int getSize()
    {
        return size;
    }
public int Search(int data)
{
    Node newnode =new Node(data);
    int index1=0,result=0;
    Node Cureent;
    Node last;
    if(head==null)
    {
        System.out.print("Linked list is Empty");
        return -1;
    }
    Cureent=head;
    last=head.next;
    while(Cureent.next!=null)
    {
        index1++;
        if(Cureent.data == newnode.data)
        {
            System.out.println("Index Number of "+data+" is "+index1++ );
            //  break;
            result=1;
        }
        Cureent=Cureent.next;
        last=last.next;
        
    }
    return result;
    
}


    public static void main(String[] args) {
        LinkedList_Range l1=new LinkedList_Range();
        Scanner s1=new Scanner(System.in);
        System.out.print("Enter the number between 1 to 50:");
        int range=s1.nextInt();
        int n=0;
        while(n==0)
        {
            if(range<=50 && range>=1)
            {
                break;
            }
            System.out.print("ReEnter the number between 1 to 50:");
            range=s1.nextInt();
        }
        l1.addFirst(1);
        l1.addlast(5);

        l1.addlast(7);
        l1.addlast(3);
        l1.addlast(8);
        l1.addlast(2);
        l1.addlast(3);
        
        l1.printLL();
        int r1=l1.Search(8);
        if(r1==0)
        {
            System.out.println("Data not Found");
        }
        
    }
    

}
