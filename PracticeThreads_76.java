class practice extends Thread{
    public void run(){
       
        try {
            Thread.sleep(200);
        } catch (Exception e) {
            System.out.println(e);// TODO: handle exception
        }
        while (true) {
            System.out.println("thank you!");
        }
    }
}
class practice1 extends Thread{
    public void run(){
        try {
            Thread.sleep(200);
        } catch (Exception e) {
            System.out.println(e);// TODO: handle exception
        }
        System.out.println("good morning");
       
    }
}
public class PracticeThreads_76 {
  public static void main(String[] args) {
    practice p1 = new practice();
    practice1 p2 = new practice1();
    p1.start();
    p2.start();
  }  
}
