import java.util.*;
public class Oueue_Using_2_Stack {
 static class Queue_Stack
 {
    static Stack<Integer> s1=new Stack<>();
    static Stack<Integer> s2=new Stack<>();
    public static boolean isEmpty()
    {
        return s1.isEmpty();
    }
    public static void add(int data)
    {
        while(!s1.isEmpty())
        {
            s2.push(s1.pop());
        }
        s1.push(data);
        while(!s2.isEmpty())
        {
            s1.push(s2.pop());
        }
    }
    public static int remove()
    {
        return s1.pop();
    }
    public static int peek()
    {
        return s1.peek();
    }
 }
    
    public static void main(String[] args) {
        Queue_Stack Q1=new Queue_Stack();
        Q1.add(1);
        Q1.add(2);
        Q1.add(3);
        Q1.add(4);
        Q1.add(5);
        while(!Q1.isEmpty()) {
            System.out.println(Q1.peek());
            Q1.remove();
        }
 
    }
}
