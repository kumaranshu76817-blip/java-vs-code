import java.util.Scanner;

class Myexception extends Exception{
    
    public String toString(){
        return "i am string";
    }
    
    public String getMessage(){
        return "i am getmessage";
    }
}
public class exception_83 {
    public static void main(String[] args) {
        System.out.println("enter the number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a<9){
            try {
                throw new Myexception();
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println(e.getMessage());
                System.out.println(e);
            }
        }
    }
}
