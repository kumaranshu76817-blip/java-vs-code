class Mythr1 extends Thread{
    public void run(){
        int i =0; 
        while (i<38484) {
            System.out.println("thank you");
            i++;
        }
    }
}
class Mythr2 extends Thread{
    public void run(){
        
        while (true) {
            System.out.println(" my  thank you");
            try {
                Thread.sleep(45);
            } catch (InterruptedException e) {
                e.printStackTrace();// TODO: handle exception
            }
        }
    }
}
public class threads_75 {
    public static void main(String[] args) {
        Mythr1 t1 = new Mythr1();
        Mythr2 t2 = new Mythr2();
        t1.start();
        try{
            t1.join();
        }
        catch(Exception e){
            System.out.println(e);
        }
        t2.start();
    }
}
