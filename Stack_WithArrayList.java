import java.util.*;
public class Stack_WithArrayList 
{ 
    public static class stack1
    {
        static ArrayList<Integer> a1=new ArrayList<>();
        public static boolean isEmpty()
        {
            return a1.size()==0;
        }
        public static void push(int data)
        {
            a1.add(data);
        }
        public static int pop()
        {
            if(isEmpty())
            {
                return -1;
            }
           int top= a1.get(a1.size()-1);
           a1.remove(a1.size()-1);
           return top;
        }
        public static int peek()
        {
            if(isEmpty())
            {
                return -1;
            }
            return a1.get(a1.size()-1);
        }
    }
    public static void main(String[] args) 
    {
        stack1 s1=new stack1();
        //Stack<Integer> s1=new Stack<>();
        s1.push(1);
        s1.push(2);
         s1.push(3);
         while(!s1.isEmpty())
         {
             System.out.println(s1.peek());
             s1.pop();
         }
   }
}

//Using Stack frame work
// public static void main(String[] args) 
//     {
        
//         Stack<Integer> s1=new Stack<>();
//         s1.push(0);
//         s1.push(1);
//         s1.push(2);
//          s1.push(3);
//          while(!s1.isEmpty())
//          {
//              System.out.println(s1.peek());
//              s1.pop();
//          }
//    }