class Mythr extends Thread{
    public Mythr(String name){
        super(name);
    }
    public void run(){
        int i = 34;
        while (true) {
            System.out.println("thank you" + getName());
        }
        
    }
}
public class threads_73 {
    public static void main(String[] args) {
        Mythr t1 = new Mythr("anshukumarifyour ");
        Mythr t2= new Mythr("anshu2");
        Mythr t3= new Mythr("anshu3");
        Mythr t4= new Mythr("anshu4");
        Mythr t5 = new Mythr("anshu5");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.start();
        t4.start();
        t5.start();
    }
}
