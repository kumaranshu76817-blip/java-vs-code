class Phone{
    public void showTime(){
        System.out.println("whati is time");
    }
    public void on(){
        System.out.println("turnning on phone...");
    }
}
class Smartphone extends Phone{
    public void music(){
        System.out.println("music on");
    }
    public void on(){
        System.out.println("turnning on smart phone");
    }
}
public class dynamicMethod49 {
public static void main(String[] args) {
    Phone obj = new Smartphone();
    obj.on();
    obj.showTime();
}
    
}