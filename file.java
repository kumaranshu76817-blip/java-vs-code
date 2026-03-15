import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class file {
    public static void main(String[] args) {




        // // create the file.
        // File myFile = new File("anshu.txt");
        // try {
        //     myFile.createNewFile();
        // } catch (Exception e) {
        //     System.out.println("unable to create file  ");// TODO: handle exception
        //     e.printStackTrace();
        // }




        // // writting the file.
        // try {
        //     FileWriter fileWriter = new FileWriter("anshu.txt");
        //     fileWriter.write("this is our first file from this java course\n oka now bye");
        //     fileWriter.close();    
        // } catch (Exception e) {
        //     // TODO: handle exception
        //     e.printStackTrace();
        // }




        // //reading a file.
        // File myFile2 = new File("anshu.txt");
        // try {
        //     Scanner sc = new Scanner(myFile2);
        //     while (sc.hasNextLine()) {
        //         String line = sc.nextLine();
        //         System.out.println(line);
        //     }
        //     sc.close();
        // } catch (Exception e) {
        //     // TODO: handle exception
        //     e.printStackTrace();
        // }



        // dleteing the file
        File myFile = new File("day");
        if(myFile.delete()){
            System.out.println("i have deleted:" + myFile.getName());
        }
        else{
            System.out.println("some problem accurred while deleting the file");
        }

    }
}
