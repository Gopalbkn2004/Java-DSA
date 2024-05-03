public class Find_1and_last_occurance {
   static int startvalue=-1,Endvalue=-1;
    public static void Occurance(String str,char ele,int ind){
        if(ind==str.length())
        {
            System.out.println(startvalue);
            System.out.println(Endvalue);
            return;
        }
        char curr=str.charAt(ind);
        if(ele==curr)
        {
           if(startvalue==-1)
           {
            startvalue=ind;
           }
           else{
            Endvalue=ind;
            
        }}
        Occurance(str, ele, ind+1);
        //Occurance(str, ele, len-1, start+1);
    }
    
    public static void main(String[] args) {
        String str="acdxyzabcd";
        Occurance(str,'b',0);
    }
}
