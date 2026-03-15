import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class practice_101 {
      public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("student 1");
        arr.add("student 1");
        arr.add("student 1");
        arr.add("student 1");
        arr.add("student 1");
        for(Object o: arr){
            System.out.println(o);
        }
        Date d = new Date();
        System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());
        Calendar c = new Calendar.getInstance();
        System.out.println(Calendar.get );
        
      }  
}
