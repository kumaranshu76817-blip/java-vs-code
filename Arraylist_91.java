import java.util.*;
public class Arraylist_91 {
   
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(12);
        l1.add(34);
        l1.add(23);
        l1.add(23);
        // for(int i=0; i<l1.size(); i++){
        //     System.out.println(l1.get(i));
        // }
        System.out.println(l1.contains(45));
        System.out.println(l1.indexOf(23));
        System.out.println(l1.lastIndexOf(23));
    }
}