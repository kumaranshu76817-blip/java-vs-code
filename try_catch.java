// import java.*;

// public class try_catch {
//     class AgeException extends Exception {
//         public AgeException(String message) {
//             super(message);
//         }
//     }

//     public static void checkAge(int age) throws AgeException {
//         if (age < 18) {
//             throw new AgeException("Age must be 18 or older!");
//         } else {
//             System.out.println("Access granted.");
//         }
//     }

//     public static void main(String[] args) {
//         // try {
//         // int a = 10 / 0;
//         // // Exception occurs
//         // } catch (ArithmeticException e) {
//         // System.out.println("Exception handled: " + e.getMessage());
//         // } finally {
//         // System.out.println("This block always executes.");
//         // }
//         try {
//             checkAge(16);
//             // This will throw AgeException
//         } catch (AgeException e) {
//             System.out.println("Exception: " + e.getMessage());
//         }
//     }
// }


class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

public class try_catch {

    public static void checkAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Age must be 18 or older!");
        } else {
            System.out.println("Access granted.");
        }
    }

    public static void main(String[] args) {

        try {
            checkAge(16);
        } catch (AgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }

    }
}