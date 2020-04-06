// 用「多型」建立一個 Network 的變數，卻是一個 FTP 的物件；接著執行 Network 裡面的 transfer
public class MainDemo{

    public static void main(String[] args){
        Network net = new FTP();
        net.transfer("TestFile.txt");
    }
}
