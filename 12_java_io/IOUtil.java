import java.io.File;

//public class IOUtilInterface{
//
//    public static void createFolder(String fileName){
//        // do something...
//    }
//
//    public static String[] readFolder(String fileName){
//        // // do something...
//        return new String[0];
//    }
//
//    public static void deleteFolder(String fileName){
//        // do something...
//    }
//
//    public static void readTextFile(String fileName){
//        // do something...
//    }
//
//    public static void writeTextFile(String fileName){
//        // do something...
//    }
//}

public class IOUtil{
	// mkdir
    public static void createFolder(String fileName){
        File file = new File(fileName);
        file.mkdirs();
    }
    // ls
    public static String[] readFolder(String fileName){
    	File file = new File(fileName);
        return file.list(); // 回傳String陣列（裡面的元素皆為檔案名稱）
    }
    // rm
    public static void deleteFolder(String fileName){
    	// rm "testFolder"
        /* 
        How to delete a folder with files using Java

        Java isn't able to delete folders with data in it. 
        You have to delete all files before deleting the folder. 
        https://stackoverflow.com/questions/20281835/how-to-delete-a-folder-with-files-using-java 
        *
        
		Using FileUtils in eclipse
		https://stackoverflow.com/questions/13166350/using-fileutils-in-eclipse
        *
        
        deleting folder from java [duplicate]
		https://stackoverflow.com/questions/3775694/deleting-folder-from-java
        FileUtils.deleteDirectory(dir);
        */
        File file = new File(fileName);
        file.delete();
        
    }

    public static void readTextFile(String fileName){
        // do something...
    }

    public static void writeTextFile(String fileName){
        // do something...
    }
}