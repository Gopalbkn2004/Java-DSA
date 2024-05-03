public class LinkedListQuestion {
        public Node head;
        public int size=0;
    class Node
    {
        int data;
        Node next;
          
        Node(int data)
        {
           this.data=data;
           next=null;
           size++;
        }
    }
     public void addFirst(int data)
    {
            Node newnode=new Node(data);
            newnode.next=head;
            head=newnode;
    }
    
    public void addLast(int data)
    {
        Node newNode=new Node(data);
        Node curr=head;
        if(curr==null)
        {  
            curr=newNode; 
            return;  
        }
        while(curr.next!=null)
        {
            curr=curr.next;
        }
            curr.next=newNode;
    }
    public void PrintList()
    {
        Node curr=head;
        if(head==null)
        {
            return ;
        }
        while(curr!=null)
        {
             System.out.print(curr.data+" ");
             curr=curr.next;
        }
        System.out.println(" ");
    }
     public void removeFirst()
    {
        if(head==null)
        {
            System.out.print("List is Empty ");
            return;
        }
        head=head.next;
        size--;
    }
    public void removeLast()
    {
        Node curr=head;
        if(head==null)
        {
           System.out.println("List is Empty ");
            return;
        }
        size--;
        if(head.next==null)
        {
            head=null;
            return;
        }
        while(curr.next.next!=null)
        {
            curr=curr.next;
        }
          curr.next=null;
    }
    public int getSize()
    {
        return size;
    }
    public void MiddleElement(int index,int data)
    { 
           
        Node curr=head;
        if(index>size || index<0)
        {
            System.out.println("Invalid Index");
            return;
        }
        Node newNode=new Node(data);
        if(head==null || index==1)
        {
            newNode.next=head;
            head=newNode;
            return;
        }
        for(int i=1;i<size;i++)
        {
            if(i+1==index)
            {
                Node nextNode=curr.next;
                curr.next=newNode;
                newNode.next=nextNode;
                break;
            }
            curr=curr.next;
        }
    }
    public void SwapNode()
    {
        Node curr=head;
         while(curr!=null && curr.next!=null)
         {
               int extra=curr.data;
                curr.data=curr.next.data;
                curr.next.data=extra;
                curr=curr.next.next;
        }
    }
    public static void main(String[] arg)
    {
        LinkedListQuestion l1=new LinkedListQuestion();
        l1.addFirst(5);
        l1.addFirst(3);
        l1.addFirst(2);
        l1.addFirst(1);
        l1.PrintList();
        l1.SwapNode();
        l1.PrintList();
        System.out.print(l1.getSize());
    }
}

