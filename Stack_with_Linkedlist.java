public class Stack_with_Linkedlist {
    static class Node{
        int data;
        Node next;

        public Node(int data)
        {
            this.data=data;
            next=null;
        }
    }
    static class Stack{
        public static Node head;
        public static boolean isempty()
        {
            return head==null;
        }
        public void push(int data){
            Node newnode=new Node(data);
            if(head==null)
            {
                head=newnode;
                return;
            }
            newnode.next=head;
            head=newnode;

        }
        public int pop()
        {
            if(head==null)
            {
                System.out.println("stack is empty");
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;

        }

        public int peek()
        {
            if(head==null)
            {
                System.out.println("stack is empty");
                return -1;
            }
            return head.data;
        }

    }
    public static void main(String[] args) {
        Stack s1=new Stack();
        s1.push(0);
        s1.push(1);
        s1.push(2);
         s1.push(3);
    // while(!s1.isempty())
    // {
    //     System.out.print(s1.peek());
    //     s1.pop();
    // }
    while(!(s1.head==null))
    {
        System.out.print(s1.peek());
        s1.pop();
    }
    
    }
}
