
package file;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class FileDemo5 {
    public static void main(String[] args) {
        
        String id,name;
        
        try{
            Formatter diu = new Formatter("C:\\Users\\DELL\\OneDrive\\Documents\\person\\StudentInput.txt");
            Scanner input=new Scanner(System.in);
            System.out.println("How many student : ");
            int num=input.nextInt();
            
            for(int i=1;i<=num;i++){
                System.out.println("Enter the student id and name : ");
                id=input.next();
                name=input.next();
                diu.format("%s %s\r\n",id,name);
            }
            diu.close();
            
        }
        catch (FileNotFoundException e){
            System.out.println(e);
        }
        
    }
    
}
