public class QuickSort {
    public static int partition(int arr[],int low,int high)
    {
        int pivot=arr[high];
        int i=low-1;

        for(int j=low; j<high;j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }

        i++;
        int temp= arr[i];
        arr[i]=pivot;
        arr[high]=temp;
        return i;
    }
    public static void quickSort(int arr[],int low,int high)
    {
        if(low<high){
            int pidx=partition(arr,low,high);
            quickSort(arr,low,pidx-1);
            quickSort(arr,pidx+1,high);
        }
        else 
        {
            System.out.println("InCorrect Argument Pass");
        }
    }
    public static void main(String args[]){
        int[] arr ={62,5,32,61,31,4,2,7,9,10,1};
        int n=arr.length;
        quickSort(arr,0,n-1);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
}
