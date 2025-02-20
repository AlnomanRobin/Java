
package file;

import java.io.File;
import java.util.Scanner;

public class FileDemo6 {
    public static void main(String[] args) {

        try {
            File diu = new File("C:\\Users\\DELL\\OneDrive\\Documents\\person\\StudentInput.txt");
            Scanner scanner = new Scanner(diu);

            while(scanner.hasNext()){
                String id = scanner.next();
                String name = scanner.next();
                System.out.println("Id: " + id + " Name: " + name);
            }   
            scanner.close();
        } catch (Exception e){
            System.out.println(e);
       }
    }
}