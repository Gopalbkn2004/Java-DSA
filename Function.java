import java.util.*;
class Function
{
    public static void sumOdd()
    {
        int sum=0;
        Scanner s1=new Scanner(System.in);
        System.out.println("enter the number");
        int n=s1.nextInt();
        s1.close();
        for(int i=1;i<=n;i++)
        {
            if(i%2!=0)
            {
               sum=sum+i; 
               System.out.println(i);
            }
        }
        System.out.println(sum);
    }

public static int greaterReturn()
{
    Scanner s1=new Scanner(System.in);
        System.out.print("enter the number :");
        int a=s1.nextInt();
        System.out.print("enter the number :");
        int b=s1.nextInt();
        //s1.close();
        if(a>b)
        {
            return a;
        }
        else if(a==b)
        {
            
            return 0;
        }
        else
        {  return b;}

}

public static void fabonic() {
    Scanner s1=new Scanner(System.in);
    System.out.print("enter the number :");
    int a=s1.nextInt();
    //s1.close();
    int aa=0,b=1,c=0;
    for(int i=0;i<=a;i++){
        System.out.println(aa);
        c=aa+b;
        aa=b;
        b=c;

    }
}

    public static void main(String[] args) {
        fabonic();
        int result=greaterReturn();
        if(result==0)
        System.out.println("Both are Equal");
        else 
        System.out.println(result +" is greater");
    }
}