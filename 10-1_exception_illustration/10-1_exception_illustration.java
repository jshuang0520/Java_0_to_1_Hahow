/**


---------------------------------------------------
-------------------------
Exception 例外處理
-------------------------
1. 避開可能會發生的錯誤
2. Exception 是一個 java 錯誤的物件 ("allThings" extends Object)
3. Checked Exception / Compile Time Exception （編譯時期會遇到的）
4. Unchecked Exception / Runtime Exception （執行時候才會遇到 - ex. NullPointerException）

---------------------------------------------------


---------------------------------------------------
-------------------------
try-catch
-------------------------
1. catch 捕捉例外發生處理
2. finally 是最後執行的區塊，大多用在「關閉資源」(ex. connection)


try{
    // do something here
}catch{
    // exception handling
}finally{
    // often used to close resource here
}
---------------------------------------------------


---------------------------------------------------
-------------------------
throw, thorws 
主動拋出 Exception
-------------------------
1. 主動拋出 Exception
2. 將 Exception 向外拋出，由呼叫他的物件處理


void getName() throws Exception{
    if(i > 10) 
        throw new Exception();
}


https://stackoverflow.com/questions/36706553/throw-exception-in-java
void createArray(int size) {
    if (size < 0)
        throw IllegalArgumentException("Size must be non-negative " + size);
    this.array = new int[size];
}
---------------------------------------------------


---------------------------------------------------
-------------------------
NullPointerException
-------------------------
1. 開發 java 程式時應盡量避免的錯誤
2. 在設計系統時，就應該要考慮到這個錯誤的發生，資料庫的設定和前端頁面的檢查

方法 1 :
if(obj == null){
    return new Object();
}

方法 2 :
// To judge if str is null. If it is, retrun "", if it isn't, return that str.
(str == null) ? "":str; 


---------------------------------------------------

*/