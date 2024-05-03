public class Circular_Queue {
    public static void main(String[] args) {
        CQueue q1=new CQueue(5);
        q1.enqueue(4);
        q1.enqueue(5);
        q1.enqueue(6);q1.dequeue();q1.dequeue();//q1.dequeue();q1.dequeue();q1.dequeue();
        q1.enqueue(7);
        q1.enqueue(8);q1.dequeue();
        q1.enqueue(9);
        q1.enqueue(19);q1.enqueue(90);
        //System.out.print(q1.enqueue(9));
        q1.print();

    }
}

class CQueue
{
    public int arr[];
    public int size;
    int front,rear,a;int full=0;

    CQueue(int size)
    {
        this.size=size;
        arr=new int[size];
        this.front=-1;
        this.rear=-1;
    }

    void enqueue(int data)
    {
        if(front==-1 && rear==-1)
        { 
            front++;
            rear++;
            arr[front]=data;
            return ;
        }
        else if((front == 0 && rear == size - 1) || (rear == (front - 1) % (size - 1)))
        {

            System.out.println("Queue is     Full");
            return ;
        }
        else if((rear==size-1) && (front!=0))
        {
        rear=0;
        arr[rear]=data;
        }
       
        rear++;
        arr[rear]=data;
        
       
    }
    void print()
    {
        if(rear>=front)
        {
        for(int i=0;i<=rear;i++)
            System.out.println(arr[i]);
        }
        else
        {
            for(int i=front;i<=size-1;i++)
                System.out.println(arr[i]);
            for(int i=0;i<=rear;i++)
                System.out.println(arr[i]);
            
        }
       
        
  
    }
    void dequeue()
    {
        if(front==-1 || rear==-1)
        {      
            System.out.println("Queue is empty");
            return ;
        }
        a=arr[front];
         for(int i=front;i<=rear-1;i++)
        {
            arr[i]=arr[i+1];         
        }
        rear--;
        return ;     
        
    }
    // void dequeue()
    // {
    //     if(front==-1 || rear==-1)
    //     {      
    //         System.out.print("Queue is empty");
    //         return ;
    //     }
    //     front++;
    //     //System.out.print((front)+"   ");
    // }
}