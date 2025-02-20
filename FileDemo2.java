
package file;//C:\Users\DELL\OneDrive\Documents

import java.io.File;
public class FileDemo2 {
    public static void main(String[] args) {
        
        File dir = new File("C:\\Users\\DELL\\OneDrive\\Documents\\person");
        dir.mkdir();//Make Directory
        
        File file1=new File("C:\\Users\\DELL\\OneDrive\\Documents\\person\\Student.txt");
        File file2=new File("C:\\Users\\DELL\\OneDrive\\Documents\\person\\Techer.txt");
        
        try{
            file1.createNewFile();
            file2.createNewFile();
            System.out.println("File has been created");
        }
        
        catch(Exception e){
            System.out.println(e);
        }
    }
}
