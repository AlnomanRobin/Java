
package file;

import java.io.File;

public class DemoFile3{
    public static void main(String[] args) {
        
        File dir = new File("C:\\Users\\DELL\\OneDrive\\Documents\\person");
        dir.mkdir();//Make Directory
        String path=dir.getAbsolutePath();
        
        File file3=new File(path+"/Nabil.txt");
        File file4=new File (path+"/Robin.txt");
        try{
            file3.createNewFile();
            file4.createNewFile();
            System.out.println("File are created");
        }
        catch(Exception e){
            System.out.println(e);
        }
        file4.delete();
        if(file4.exists()){
            System.out.println("File Exists");
        }
        else{
            System.out.println("File Don't Exists");
        }
    }
}
   