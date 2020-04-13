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


---------------------------------------------------
-------------------------
用文字寫檔
-------------------------
1. FileWriter
2. BufferedWriter  // (put FileWriter into BufferedWriter)
    // forEach - write data line by line
    (1) BufferedWriter.write(String str)  // bw.write(str)
    (2) BufferedWriter.newLine()

new FileWriter(fileName);
new BufferedWriter(fw); // fw == file_writer


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

---------------------------------------------------


---------------------------------------------------
-------------------------
用 Byte 寫檔
-------------------------
1. FileInputStream
    (1) read(byte[] b)
2. OutputStream
    (1) write(byte[] b, int off(起始位置), int len(長度))
    (2) flush()  // to close resourse

new FileInputStream(source)
new FileOutputStream(dest)

byte[] b = new byte[1024];

fis.read()
fos.write()



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

---------------------------------------------------

*/