import java.util.*;
public class ArrayList1 {
   
    public static void main(String[] args) {

        ArrayList <Integer> l1= new ArrayList<Integer>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        System.out.println(l1);

        int g=l1.get(3);
        System.out.println(g);
        
        l1.set(g-1,3);
        System.out.println(l1);
        
        l1.remove(g-1);
        System.out.println(l1);
        
        l1.size();
        System.out.println(l1.size());
        Collections.sort(l1);
        System.out.println(l1);
    }
    
}
