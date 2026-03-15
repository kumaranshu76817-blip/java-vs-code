import java.util.ArrayList;
class Mygenric<T1>{
    int val ;
    private T1 t1;
    public Mygenric(int val , T1 t1){
        this.val = val;
        this.t1 = t1;
    }
    public int getVal(){
        return val;
    }
    public void setVal(int val){
        this.val = val;
    }
    public T1 getT1(){
        return t1;
    }
    public void setT1(T1 t1){
        this.t1 = t1;
    }
}
public class generics {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        // arrayList.add("str1 ");
        arrayList.add(54);
        arrayList.add(453);
        int a = arrayList.get(0);
        // System.out.println(a);
        Mygenric<String> g1 = new Mygenric(23, "mystring is my string");
        String str = g1.getT1();
        System.out.println(str);
    }
}
