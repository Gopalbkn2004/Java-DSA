public class factorial_n_number {
    public static void factorial_with_recursion(int n,int fact)
    {
        if(n==0)
        {
            System.out.println(fact+" ");
            return;
        }
        fact*=n;
        factorial_with_recursion(n-1,fact);

    }
    public static void main(String[] args) {
        factorial_with_recursion(0,1);
    }
    
}
