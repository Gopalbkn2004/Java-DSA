public class Array_SortedCheck {
    public static void SortedArray(int[] arr,int n)
    {
        if(n==arr.length-1)
        {
            System.out.print("Array Sorted");
            return;
        }
        if(arr[n]<arr[n+1])
        {
            SortedArray(arr,n+1);
        }
        else
        {
            System.out.print("Array can not be arrange in increment order");
            return;
        }

    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        SortedArray(arr,0);
    }
}
