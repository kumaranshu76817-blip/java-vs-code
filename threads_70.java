class Mythread1 extends Thread{
    public void run(){
        while (true) {
            System.out.println("my thread is running");
            System.out.println("i am happy");
        }
    }
}
class Mythread2 extends Thread{
    @Override 
    public void run(){
        int i = 0;
        while (i<4000) {
            System.out.println("thread 2 is running");
            System.out.println("i am sad");
            i++;
        }
    }
}
public class threads_70 {
    public static void main(String[] args) {
        Mythread1 t1 = new Mythread1();
        Mythread2 t2 = new Mythread2();
        t1.start();
        t2.start();
    }
}
