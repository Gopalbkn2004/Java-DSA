//import javax.lang.model.type.NullType;

public class Queue {
    public static void main(String[] args) {
        MainQueue q1=new MainQueue(5);
        q1.enqueue(4);
         q1.enqueue(5);
        q1.enqueue(6);     
        
        q1.dequeue();q1.dequeue();

        q1.enqueue(7);
        q1.enqueue(8);
        
       q1.dequeue();
             
       
       q1.print();

    }
}

class MainQueue
{
    public int arr[];
    public int size;
    int front,rear,a;

    MainQueue(int size)
    {
        this.size=size;
        arr=new int[size];
        front=-1;
        rear=-1;
    }

    void enqueue(int data)
    {
        if(front==-1 && rear==-1)
        { 
            front++;
            rear++;
            arr[front]=data;
            return;
        }
        
        if(rear==size-1)
        {
            System.out.println("Queue is full");
            return;
        }
        rear++;
        arr[rear]=data;

    }
    void print()
    {
        for(int i=0;i<=rear;i++)
        {
            System.out.println(arr[i]);
        }
    }
    void dequeue()
    { rear--;
        if(front==-1 || rear==-1)
        {      
            System.out.print("Queue is empty");
            return ;
        }
        a=arr[front];
         for(int i=front;i<=rear;i++)
        {
            arr[i]=arr[i+1];         
        }
       
        return ;     
        
    }
}