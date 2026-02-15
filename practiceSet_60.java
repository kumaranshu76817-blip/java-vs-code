abstract class Pen{
    abstract void write();
    abstract void refile();
}
class FountainPen extends Pen{
    public void write(){
        System.out.println("write");
        
    }
    public void refile(){
        System.out.println("refile");
    }
    public void rewrite(){
        System.out.println("rerefile in pen ");
    }
}
class Monkey{
    void jump(){
        System.out.println("jumpint");
    }
    void bite(){
        System.out.println("bitting..");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    void speaks(){
        System.out.println("hello sir");
    }
    public void eat(){
        System.out.println("eatting...");
    }
    public void sleep(){
        System.out.println("sleeping");
    }
}


public class practiceSet_60 {
 public static void main(String[] args) {
    FountainPen f = new FountainPen();
    f.write();
    f.refile();
    f.rewrite();


    Human h = new Human();
    h.sleep();
 }   
}
