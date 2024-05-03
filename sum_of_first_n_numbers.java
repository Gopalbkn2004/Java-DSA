public class sum_of_first_n_numbers {
    public static void sum_n_number_without_Recursion(int n,int sum){
        if(n==0){
            
            System.out.println(sum);
            return;
        }
        sum=sum+n;
        n--;
        sum_n_number_without_Recursion( n, sum);
        

    }
    
    public static void main(String[] args) {
        
        sum_n_number_without_Recursion(5,0);
        
    }    
}
