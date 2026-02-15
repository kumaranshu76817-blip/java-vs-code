import java.util.Scanner;

public class nested_try_82 {
    public static void main(String[] args) {
        int arr [] =  {1,3,4,6};
       
        boolean flag = true;
         Scanner sc = new Scanner(System.in);
        System.out.println("enter the syntax to print:");
        int ind = sc.nextInt();
        while (flag) {
            try {
            System.out.println("welcome to level 1");
           
            try {
                System.out.println(arr[ind]);
                 flag = false;
            } catch (ArrayIndexOutOfBoundsException e) {
                // TODO: handle exception
                System.out.println("error in  expection 2");
                System.out.println("sorry the arrayist is not found");
            }
        } catch (Exception e) {
            System.out.println(e);// TODO: handle exception
        }
        }
        
        System.out.println("welcome to using this code");

    }
}
