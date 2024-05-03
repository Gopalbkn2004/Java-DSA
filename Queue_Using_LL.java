public class Queue_Using_LL {
    public static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            next=null;
        }
    }
    public static class Queue_LL{
        static Node head=null;
        static Node tail=null;

        public static boolean isempty()
        {
            return head==null && tail==null;
        }
        public static void add(int data)
        {
            Node newData=new Node(data);
            if(isempty())
            {
                tail=head=newData;
            }
            else{
                tail.next=newData;
                tail=newData;
            }
        }
        public static int remove()
        {
            if(isempty())
            {
                System.out.println("Queue is empty");
                return -1;
            }
            int result=head.data;
            //single node
            if(tail==head)
            {
                tail=null;
            }
            head=head.next;
            return result;
        }
        public static int peek(){
            if(isempty())
            {
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Queue_LL q1=new Queue_LL();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(1);

        while (!q1.isempty()) {
            System.out.print(q1.peek());            
            q1.remove();
        }
        
    }
}
