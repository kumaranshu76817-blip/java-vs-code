class A{
     int anshu(){
        return 4;

    }
    void meth2(){
        System.out.println("i am method 2 of claass a");
    }

}
class B extends A{
    @Override
    public void meth2(){
        System.out.println("i am method o2 of class b");
    }
    public void meth3(){
        System.out.println(" ia ma method 3 of class b");
    }
}
public class overRiding {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();
        
        B b= new B();
        b.meth2();
    }
}
