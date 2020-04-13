/**


---------------------------------------------------
-------------------------
File 檔案
-------------------------
1. java.io.File

File file = new File(fileName);
2. 建立檔案夾 file.mkdir(); 或連同在他所有的上層資料夾一起建 file.mkdirs();
3. 讀取目錄 file.list();
4. 刪除檔案 file.delete();
---------------------------------------------------


---------------------------------------------------
-------------------------
讀取檔案
-------------------------
1. FileInputStream - 讀取影音檔、圖片檔
    (1) 以 Byte 的方式讀取           FileInputStream(fileName)
2. FileReader - 讀取文字檔
    (1) 以 char, String 的方式讀取   FileReader(fileName)

---------------------------------------------------


---------------------------------------------------
-------------------------
寫入檔案
-------------------------
1. FileOutputStream - 寫入影音檔、圖片檔
    (1) 以 Byte 的方式寫入           FileOutputStream(fileName)
2. FileWriter - 寫入文字檔
    (1) 以 char, String 的方式寫入   FileWriter(fileName)

---------------------------------------------------


================================================================

---------------------------------------------------
-------------------------
讀取文字檔
-------------------------
1. FileReader
2. BufferedReader  // (put FileReader into BufferedReader)
    (1) BufferedReader.readLine()

new FileReader(fileName);
new BufferedReader(fr); // fr == file_reader



public static void readTextFile(String fileName){
    
        // 1. fileReader
        FileReader fr = null;
        try{
            fr = new FileReader(fileName);
        }catch(FileNotFoundException e){
            // use printStackTrace in catch
        }

        // 2. BufferedReader (put FileReader into BufferedReader)
        BufferedReader br = new BufferedReader(fr);
        // readLine
        String line = null;
        try{
            while( (line = br.readLine()) != null ){
                // do something to the data
            }
        }catch(IOException e){
            // use printStackTrace in catch
        }finally{
            // close resource
            try{
                br.close();
            }catch(IOException e){
                // use printStackTrace in catch
            }
        }
    }
---------------------------------------------------

*/