import java.util.*;
public class StackProblem1 {
    public static void Push_On_Buttom(Stack<Integer> s,int data)
    {
        if(s.isEmpty())
        {
            s.push(data);
            return;
        }
        int temp=s.pop();
        Push_On_Buttom(s,data);
        s.push(temp);

    }
    public static void reverse(Stack<Integer> s){
        if(s.isEmpty())
            return;
        int top =s.pop();
        reverse(s);
        Push_On_Buttom(s,top);
    }
    public static void main(String[] args) {
        Stack<Integer> s1=new Stack<>();
        s1.add(1);
        s1.add(2);
        s1.add(3);
        reverse(s1);
        while(!s1.isEmpty())
        {
            System.out.println(s1.pop());
        }

    }
}
