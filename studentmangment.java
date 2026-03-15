import java.util.ArrayList;
import java.util.Scanner;

class Student{
    String name;
    int id;
    int marks;
}
public Student(int marks,int id, String name){
    this.marks = marks;
    this.name = name;
    this.id = id;
}
public String getName(){
    return name;

}
public int getMarks(){
    return marks;
}
public int getId(){
    return id;
}
public void diplayStudent(){
    System.out.println("1.name: "+name);
    System.out.println("2.id: " + id);
    System.out.println("3.marks: " + marks);

}

public class studentmangment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> studentlist = new ArrayList<>();
        int choice;
        do {
            System.out.println("welcoem to student mangment system");
            System.out.println("1. add studnet ");
            System.out.println("2. viewStudent");
            System.out.println("3. searchStudent");
            System.out.println("4. update Studnent");
            System.out.println("5. deleteStudent");
            System.out.println("6. exit program");
            System.out.println("-----------------------------------");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addStudent();      
                    break;
                case 2:
                    viewStudent();
                    break;
                case 3:
                    searchStudnet();
                    break;
                case 4:
                    updateStudent();
                    break;
                case 5:
                    deleteStudent();
                    break;
                case 6:
                    System.out.println("exit the program");
                    break;
                default:
                    System.out.println("ivalid choice");
                    break;

            }

        } while (choice<=5);
        public void addStudent(){
            System.out.println("enter the name");
            add.name = sc.nextInt();
            System.out.println("enter the id:");
            id = nextInt();
        }
    }
}
