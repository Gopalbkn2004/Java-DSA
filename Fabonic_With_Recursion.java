public class Fabonic_With_Recursion {
    public static void fabonic(int a,int b,int n){
        if(n==0)
        {
            return;
        }
        System.out.println(a);
        fabonic(b,a+b,n-1);
    }
    
    public static void main(String[] args) {
        //fabonic(0,1,5);
                
    }
    
}
