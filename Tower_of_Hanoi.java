public class Tower_of_Hanoi {
    public static void TowerOfHanoi(int n,String src,String helper,String Dest)
    {
        if(n==1)
        {
            System.out.println("transfer disk"+n+" from "+src+" to "+Dest+" with help of "+helper);
            return;
        }
        TowerOfHanoi(n-1,src,Dest,helper);
        System.out.println("transfer disk "+n+" from "+src+" to "+Dest+" with help of "+helper);
        TowerOfHanoi(n-1,helper,src,Dest);
    }
    public static void main(String[] args) {
        TowerOfHanoi(4,"A","B","c");
    }



    
}
