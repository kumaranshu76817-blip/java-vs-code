import java.util.Scanner;

public class practiceset_86 {
    public static void main(String[] args) {
        // try {
        //     int age = 66/0;
        // } catch (IllegalArgumentException e) {
        //     System.out.println("hehee");// TODO: handle exception
        // }
        // catch (ArithmeticException e){
        //     System.out.println("haaha");
        // }

        //problem no 4
        int [] arr = new int[3];
        arr [0] = 45;
        arr [1] = 23;
        arr [2] = 43;
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        int index;
        int i =0;
       
            
            while (flag && i<5) {
                 try {
                System.out.println("enter the endex");
            index = sc.nextInt();
                System.out.println("the array of index is " + arr[index]);
                break;
            }
         catch (Exception e) {
            System.out.println("invalid code");
            sc.nextLine();// TODO: handle exception
            i++;
        }
    }
}
}
