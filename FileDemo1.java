
package file;//C:\Users\DELL\OneDrive\Documents

import java.io.File;
public class FileDemo1 {
    public static void main(String[] args) {
        
        File dir = new File("C:\\Users\\DELL\\OneDrive\\Documents\\person");
        
        dir.mkdir();//Make Directory
        String path=dir.getAbsolutePath();
        System.out.println(path);
        System.out.println(dir.getName());
        if (dir.delete()){
            System.out.println(dir.getName()+ " folder has been deleted");
        }
        
    }
}