// interface Demoano{
//     public void meth1();
// }
// class AnoyDemo implements Demoano{
//     public void meth1(){
//         System.out.println("i am meth1 demo");
//     }
// }
// public class lamda_ {
//     public static void main(String[] args) {
//         AnoyDemo obj = new AnoyDemo();
//         obj.meth1();
    
//     Demoano obj = ()-->{
//         System.out.println("ia method 1 from tthis lamda");
    
//     }
// }
// }
interface Anshu{
    void meth1();
}
public class lamda_ {

    public static void main(String[] args) {
        Anshu obj = () -> System.out.println("hellow world");
        obj.meth1();
    }
}