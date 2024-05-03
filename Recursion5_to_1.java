public class Recursion5_to_1 {
    // with out Recursion
    public static void withoutRecursion(){
        for(int i=5;i>=1;i--)
        {
            System.out.print(i+" ");
        }
    }
     // with Recursion
    public static void WithRecursion(int i){

        System.out.print(i+" ");
        if(i==1)
        {
            return;
        }
        i--;
       //Recursion
        WithRecursion(i);
    }
    public static void main(String[] args) {
        withoutRecursion();
        System.out.println(" ");
        WithRecursion(5);
    }
    
}
