import java.io.*;

/**
public class HWReadFile{
    public static void main(String[] args){
        try{
            File ____ = new File("MyText.txt");
            ____ ____ = new ____(x1);
            ____ x4 = new ____(x2);
            String x3 = null;
            while( (x3 = ____.____() != null)){
                System.out.println(x3);
            }____.____();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}  
*/  

public class HWReadFile{
    public static void main(String[] args){
        try{
            File x1 = new File("MyText.txt");
            FileReader x2 = new FileReader(x1);
            BufferedReader x4 = new BufferedReader(x2);
            String x3 = null;
            while( (x3 = x4.readline() != null)){
                System.out.println(x3);
            }x4.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}  

/**
x1 == fileName (path)
x2 == fr (file reader)
x3 == line (tmp)
x4 == br (buffered reader)
finally close buffered reader
*/