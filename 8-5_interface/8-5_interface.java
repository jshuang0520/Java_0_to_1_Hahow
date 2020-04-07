/**
---------------------------------------------------
-------------------------
Interface 介面
-------------------------
1. 介面是一個抽象的概念，只定義方法，沒有實作
2. 使用 interface 的物件時，必須實現其方法
3. In Java, interface 可以多重繼承 (class 則不行多重繼承，重申，是 In Java)
// 4. 在 Java 的 interface 裡面，若要定義「attribute 屬性」，必須是一個「靜態且不能修改 (static + final) 的常數」
5. 優點：涉及系統架構的時候，越上層會傾向用越抽象的方式去設計 --> 以達到能 decouple，又能互相合作


public interface File {

    public void openFile();
}

public class multimedia implements File{
    // some codes here...
}


// 多重繼承
public interface File extends Super1, Super2{
    // some codes here...
}

---------------------------------------------------


---------------------------------------------------
-------------------------

-------------------------
1. 




---------------------------------------------------


---------------------------------------------------
-------------------------

-------------------------
1. 




---------------------------------------------------


*/