
package file;

import java.io.FileNotFoundException;
import java.util.Formatter;

public class FileDemo4 {
    public static void main(String[] args) {
        try{
            Formatter diu=new Formatter("C:\\Users\\DELL\\OneDrive\\Documents\\person\\Student.txt");
            diu.format("%s %s\r\n", "101", "Inki");
            diu.format("%s %s\r\n", "102", "Pinki");
            diu.format("%s %s\r\n", "103", "Ponki");
            diu.close();
            
        }
        catch (FileNotFoundException e){
            System.out.println(e);
        }
        
    }
    
}
