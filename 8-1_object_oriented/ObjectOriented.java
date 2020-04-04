/**

Object Oriented 物件導向

- 提高軟體的重用性、靈活性、擴充性
- 程式中的物件可以相互存取相關的資料


物件導向的困難點 ！！！ 希望能夠互相合作，又不希望耦合度太高 ！！！ -> 設計模式

===================================================
物件導向的重點：
！！！！！！ 低耦合度 decouple ！！！！！！

1. 物件本身可以自由修改與變化，但不會影響其他物件
2. 外部程式的修改也不會影響到物件本身的功能與運作
3. 物件之間還要能夠互相合作（互相協調、工作）

 (bad)                 (good)
高 耦 合       ----->   低 耦 合
  歐盟                   WTO

                       WTO是只要你符合認定的機制，
                       就能和大家成為合作好夥伴

歐盟用同一種貨幣，
經濟和政治綁太緊，
導致有一兩個國家發生財務危機時，
其他會員國一起被拖下水
===================================================


---------------------------------------------------
Object and Class 物件與類別

Class :
A blueprint, there's no instance.
- attrbute
- method


Object:           實體
An object is an instance of a class (blue print).
---------------------------------------------------




封裝 Encapsulation
繼承 Extends
多型 Polymorphism
抽象 Abstract


---------------------------------------------------
-------------------------
Encapsulation 封裝
principle : 「封裝變化之物」
-------------------------

1. 將「實作」與「外部物件感興趣的操作介面」分開
2. 定義物件的操作介面和隱藏實作細節
3. 使用 private, public 等 access modifiers

--
private String name;
public void setName(String str){
    name = str.trim();
}
public String getName(){
    return name;
}
---------------------------------------------------


---------------------------------------------------
-------------------------
Extends 繼承
-------------------------
1. 基於某個父類別對物件的定義加以擴充
2. 子類別可以新增新的方法，也可以覆寫(overwrite)父類別的方法

class SubClass extends BaseClass{

}
---------------------------------------------------


---------------------------------------------------
-------------------------
Interface 介面
-------------------------
1. 描述不同類別的共同行為
2. 實作與介面分開，以便讓同一個介面但不同實作的物件能透過醫治的面貌讓外界存取
3. keyword: "interface", "implements". 
4. 介面沒有實作的方法，所以他沒辦法產出實體 There are no implements & instances in interfaces.

public interface Car{

    public void goForward();
    public void goBackward();
}

public class Toyota implements Car{
    // implement goForward()

    // implement goBackward()
}
---------------------------------------------------


---------------------------------------------------
-------------------------
Polymorphism 多型
-------------------------
1. 同一個資料型態，操作不同物件實例 -> 2. 降低對資料型態操作的「依賴程度」！
3. 可用介面和父類別宣告物件型態


ps. 介面的第四點：4. 介面沒有實作的方法，所以他沒辦法產出實體
--->所以先透過 new 一個 class() 來產生物件實體
Car toyota = new Toyota();
Car mazda  = new Mazda();
---
底下就是多型的功用
public void process(Car car){  
    // 這裡用 interface 作為資料型態，以達到 2. 降低對資料型態操作的「依賴程度」！
    // 因為我不需要因為是toyota還是mazda而寫成兩個，我只要對 "interface" car 操作就行了

    car.goForward();
    car.goBackward();
    car.goForward();
}

---------------------------------------------------


---------------------------------------------------
-------------------------
Generic 泛型
-------------------------
1. 泛型是多型的一種技巧
2. 當編譯期間無法確定程式碼的撰寫方式，而是依照執行期間的狀況而定
3. 不用因為資料型別的限制而實作多種方法，只需要一種方法即可
4. keyword: <T> & T : T means Data "Type"

public class numbers<T> {            // put <T> here
    public void add(T num1, T num2){ // put  T here: one can use int/float/double...whatever afterwards
        // some codes here......
    }
}

---------------------------------------------------


---------------------------------------------------
-------------------------
Abstract Class 抽象類別
-------------------------
1. 包含抽象方法 -> 2. 不可以被實體化
3. 子類別必須實作抽象類別的抽象方法

public abstract class Toyota{
    // Method(s)
    public void goForward(){
        // some implements here
        System.out.println("I'm implementing...")
    }

    // Abstract Method(s)
    public void openDoor(); // there are no implements 甚至沒有大括弧{}

}

---------------------------------------------------


---------------------------------------------------
-------------------------
UML (Undefined Modeling Language)
-------------------------
1. IT技術人員能夠閱讀、傳達系統組織架構的設計規格
2. 使用案例圖 (Use-case Diagram)
3. 類別圖     (Class Diagram)
4. 循序圖     (Sequence Diagram)
5. 狀態圖     (Statechart Diagram)

---------------------------------------------------





---------------------------------------------------
-------------------------
Design Pattern 設計模式
-------------------------
要怎麼使用物件導向來解決軟體工程的問題？

1. 設計模式是在解決各種問題中的經驗彙整
2. 將反覆出現的各種問題提出的解決方案
3. GoF 提出 23 種經典的設計模式

Design Patterns - Elements of Reuable Object-Oriented Software
四人幫
Erich Gamma
Richard Helm
Ralph Johnson
John Vlissides


---------------------------------------------------

*/