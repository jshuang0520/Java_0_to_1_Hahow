import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.File;

public class MainDemo{
    public static void main(String[] args){
        // read data from excel
        Path currentPath = Paths.get(System.getProperty("user.dir"));
        String readFileName = Paths.get(currentPath.toString(), "Sample_data.xlsx").toString();
        System.out.println("file path: " + readFileName);
        
        try {
        	ExcelUtil.readFile(readFileName);
        }catch(IOException e) {
        	e.printStackTrace();
        }
        
        // write data to excel
        String writeFileName = Paths.get(currentPath.toString(), "write_to_file.xlsx").toString();
        DataHelper dataHelper = new DataHelperImp(); // you CAN'T implement interface "DataHelper", so use a class DataHelperImp (though there's a "default" implementation of method in interface "DataHelper")
        List<String[]> list = dataHelper.getData();
        try {
        	ExcelUtil.writeFile(writeFileName, list);
        }catch(IOException e) {
        	e.printStackTrace();
        }
        System.out.println("\n"+"Done to write an excel file!");
        
        
    }
}