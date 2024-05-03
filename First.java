class First{

public static void ButterflyPattern()
{
    int n=4;
    for(int j=1;j<=n;j++)
    {
        for(int i=1;i<=j;i++)
        {
            System.out.print("*");
        }
    
       int space=2*(n-j);
       for(int i=1;i<=space;i++)
        {
            System.out.print(" ");
        }
        for(int i=1;i<=j;i++)
        {/*  */
            System.out.print("*");
        }
        System.out.println(" ");
    }
    for(int j=3;j>=1;j--)
    {
        for(int i=1;i<=j;i++)
        {
            System.out.print("*");
        }
        int space=2*(n-j);
        for(int i=1;i<=space;i++)
         {
             System.out.print(" ");
         }
        for(int i=1;i<=j;i++)
        {
            System.out.print("*");
        }
        System.out.println(" ");
    }
}

public static void rombase()
{
    for(int i=1;i<=5;i++)
    {
        for(int s=4;s>=i;s--)
        {
            System.out.print(" ");
        }
        for(int j=1;j<=5;j++)
        {
            System.out.print("*");
        }
        System.out.println(" ");
    }
}

public static void trainglePattern()
{
    for(int i=1;i<=5;i++)
    {
        for(int j=4;j>=i;j--)
        {
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++)
        {
            System.out.print(j+" ");
        }
        System.out.println(" ");
    }
}
 
public static void trainglePattern1()
{
    for(int i=1;i<=5;i++)
    {
        for(int j=4;j>=i;j--)
        {
            System.out.print("  ");
        }
        for(int j=2;j<=i;j++)
        {
            System.out.print(j+" ");
        }
        for(int j=1;j<=i;j++)
        {
            System.out.print(j+" ");
        }
        System.out.println(" ");
    }
}

public static void Diamend()
{
    for(int i=1;i<=5;i++)
    {
        for(int j=4;j>=i;j--)
        {
            System.out.print("  ");
        }
        for(int j=2;j<=i;j++)
        {
            System.out.print("*"+" ");
        }
        for(int j=1;j<=i;j++)
        {
            System.out.print("*"+" ");
        }
        System.out.println(" ");
    }
    
    for(int i=4;i>=1;i--)
    {
        for(int j=4;j>=i;j--)
        {
            System.out.print("  ");
        }
        for(int j=2;j<=i;j++)
        {
            System.out.print("*"+" ");
        }
        for(int j=1;j<=i;j++)
        {
            System.out.print("*"+" ");
        }
        System.out.println(" ");
    }
}

public static void Binary_trainglePattern()
{
    for(int i=1;i<=5;i++)
    {
        for(int j=1;j<=i;j++)
        {
            int sum=i+j;
            if(sum%2==0)
            {
                System.out.print("1");
            }
            else
            {
                System.out.print("0");
            }
        }
        System.out.println(" ");
    }
}

    public static void main(String[] args) {
       // Diamend();
       String first="Gopal";
       String se="kishan";
       String full=first + "@" + se;
       System.out.println(full);
        
    }
}