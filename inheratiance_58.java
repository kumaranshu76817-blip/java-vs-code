interface Innerinheratiance_58 {

    void meth1();
    void meth2();

}
interface Myclass extends Innerinheratiance_58 {
   void meth3();
   void meth4();
    

}
class SecondClass implements Myclass{
    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }
    public void meth3(){
        System.out.println("meth3");
    }
    public void meth4 (){
        System.out.println("meth4");
    }
}
public class inheratiance_58 {
    public static void main(String[] args) {
        SecondClass sc = new SecondClass();
        sc.meth1();

    }
}
