public class Video{
	// 封裝：「把某些東西(實作)封裝在自己的物件裡面，然後只開特定的介面，讓外部的物件可以使用和呼叫」
	
	// private attribute
    private String fileName; // 外部物件不能使用他，之後就要開像是 public 方法(或說介面)來讓外界取得，這就是封裝

    // public method (setter)
    public void setFileName(String fileName){
        this.fileName = fileName;
    }
    // public method (getter)
    public String getFileName(){
        return this.fileName;
    }

    // In eclipse, right click -> Source -> Generate Setter&Getter (Once and for all attributes!!!)
}