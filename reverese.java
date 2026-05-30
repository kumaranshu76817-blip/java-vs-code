import java.util.*;
public class reverese {
    public static int sumofdigit(int n){
        if(n==0){
            return 0;
        }
        return n%10+ (sumofdigit(n/10));
    }

    public static String reverseString(String str){
        if(str.isEmpty()){
            return str;
        }
        return reverseString(str.substring(1))+ str.charAt(0);
    }

    public static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b,a%b);
    }
    public static void main(String[] args) {
        int n = 1234;
        String str = "anshu";
        System.out.println("sum of digit of number " + sumofdigit(n)   );
        System.out.println("revers of string " + reverseString(str));
        System.out.println("gcd of given integer:" + gcd(48, 18));
    }
}
