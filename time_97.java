import java.util.Date;

public class time_97 {
    public static void main(String[] args) {
        System.out.println(Long.MAX_VALUE );
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Float.MAX_VALUE);
        
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getDate());
        System.out.println(d.getSeconds());
        System.out.println(d.getYear());
        System.out.println(d.getMonth());
    }
}
