import java.nio.file.Path;
import java.nio.file.Paths;


public class MainDemo{

    public static void main(String[] args){
    	
//      String fileName = "/Users/johnson.huang/Java_0_to_1_Hahow/12_java_io";
//      System.out.println(fileName);
    	
    	
        /* os.path.join() without being bothered by "/" or "\"
        https://stackoverflow.com/questions/412380/how-to-combine-paths-in-java
        https://stackoverflow.com/questions/4871051/getting-the-current-working-directory-in-java */
        Path currentPath = Paths.get(System.getProperty("user.dir"));
        Path filePath = Paths.get(currentPath.toString(), "testFolder"); // , "pikachu_hi_pokemon.png"
        String fileName = filePath.toString();
        System.out.println("fileName: "+fileName);
        // create a folder "testFolder"
        IOUtil.createFolder(fileName);
        System.out.println("mkdir done!");
        // ls "testFolder"
        String[] files = IOUtil.readFolder(fileName);
        for(String name: files) {
        	System.out.println("file: "+name+" in "+fileName);
        }
        
        // rm "testFolder"
        /* How to delete a folder with files using Java

        Java isn't able to delete folders with data in it. 
        You have to delete all files before deleting the folder. 
        https://stackoverflow.com/questions/20281835/how-to-delete-a-folder-with-files-using-java */
        IOUtil.deleteFolder(fileName);
        System.out.println("rm done!");
    }
}