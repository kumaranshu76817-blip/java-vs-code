import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>(6,0.5f);
        myHashSet.add(4);
        myHashSet.add(46);
        myHashSet.add(43);
        myHashSet.add(47);
        System.out.println(myHashSet);
        System.out.println(System.currentTimeMillis()/1000/3600/24/365/);
    }
}
