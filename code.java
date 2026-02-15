class Base1{
    Base1(){
        System.out.println("i am a consturntor");
    }
    Base1(int x){
        System.out.println("i am a all over constuctor");
    }
}
class Derived1 extends Base1{
    Derived1(){
        System.out.println("i am a derive class constructor ");
    }
    Derived1(int x,int y ){
        super(x);
        System.out.println("i am an overloader constructor of derivew with value of y as" + y);
    }
}

public class code {
    public static void main(String[] args) {
        Derived1 d = new Derived1();
}
}
