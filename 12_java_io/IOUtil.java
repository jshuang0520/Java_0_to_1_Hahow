import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;



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
//    public static void readTxtFile(String fileName){
//        // do something...
//    }
//
//    public static void writeTxtFile(String fileName){
//        // do something...
//    }
//    public static void copyPictureFile(File source, File dest){
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

    public static void readTxtFile(String fileName){
        // 1. fileReader
        FileReader fr = null;
        try{
        	fr = new FileReader(fileName);
        }catch(FileNotFoundException e){
            // use printStackTrace in catch
            e.printStackTrace();
        }
        // 2. BufferedReader (put FileReader into BufferedReader)
        BufferedReader br = new BufferedReader(fr);
        // readLine
        String line = null;
        try{
            while( (line = br.readLine()) != null ){
                // do something to the data
                System.out.println(line);
            }
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            // close resource
            try{
                br.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }

    public static void writeTxtFile(String fileName){
        // data to be written
        List<String> strArrayList = new ArrayList();
        strArrayList.add("This is a file to be read."); 
        strArrayList.add("裡面有中文和英文．"); 
        strArrayList.add("測試看看．"); 
        strArrayList.add("Because it's 'readLine', "); 
        strArrayList.add("    so I'm trying to write multiple lines here."); 
        strArrayList.add("    順便在最前方加些空白，"); 
        strArrayList.add("看他的效果怎麼樣！"); 
        
        try{
            // 1. fileWriter
            FileWriter fw = new FileWriter(fileName);
            // 2. BufferedWriter
            BufferedWriter bw = new BufferedWriter(fw);
            // forEach - write data line by line
            for(String str: strArrayList){  // --- loop ---
                bw.write(str);                  // write line
                bw.newLine();                   // new line
            }bw.flush();                    // close resource
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void copyPictureFile(File source, File dest){
        // FileInputStream, FileOutputStream
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try{
            // FileInputStream
            fis = new FileInputStream(source);
            // FileOutputStream
            fos = new FileOutputStream(dest);
            // FileOutputStream - (1) write(byte[] b, int off(起始位置), int len(長度))
            // buffer 是由 byte陣列 所建
            byte[] buffer = new byte[1024];
            // int off(起始位置)
            int off = 0;
            // int len(長度)
            int len = 0;
            // fis.read() - while read file
            while( (len = fis.read(buffer)) != -1 ){// while fis.read()
                // fos.write() - write file             // fos.write()
                fos.write(buffer, off, len);        
            }fos.flush();                           // close resource

        }catch(IOException e){
            e.printStackTrace();
        }finally{
            // close resource
            try{
                fis.close();
                fos.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}