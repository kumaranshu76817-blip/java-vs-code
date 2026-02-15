

class Base{
    int x;
    public void setX(int x){
        this.x = x;

    }
    public int getX(){
        return x;
    }
    public void printMe(){
        System.out.println("this is inhertaince");
    }
}
class Derived extends Base{
    int y;
    public void setY(int y){
        this.y = y;
    }
    public int getY(){
        return y;
    }
}
public class inhertaince {
    public static void main(String[] args) {
        Base b = new Base();
        b.setX(5);
        System.out.println(b.getX());
        

        Derived d = new Derived();
        d.setY(45);
        d.setX(23);
        System.out.println(d.getX());
        System.out.println(d.getY());

    }
}
