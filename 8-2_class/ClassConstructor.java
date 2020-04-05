/**

---------------------------------------------------
-------------------------
Constructor 建構子
當物件被 new 出來的時候，他會執行建構子裡面的動作
(當子類別 extends 父類別的時候，父類別就被 new 出來了)
-------------------------
1. 建構物件的同時，可以初始化一些必要的資訊
2. 也可以稱為建構方法，不回傳值的方法 --> Consider a "constructor" as a "method", it can be two or more methos(constructors), can be overloaded
3. 建構子名稱和類別名稱一樣 --> The name of the constructor is just the same as the class's
4. 建構子可以被重載 (Overload) --> One can define two or more constructors in a class!


public class Superclass{
    
    // A "default constructor" (with no args/params)
    public SuperClass(){
        // something here...
    }

    // A constructor with args/params -> This is overload of a constructor
    public SuperClass(int i){
        // something here...
    }
}


---------------------------------------------------


---------------------------------------------------
-------------------------
This
(It seems similar to "self" in python)
-------------------------
1. 參考物件本身 (代表這個class的物件自己本身)
2. this() 也表示呼叫物件那個沒有參數的"default"建構子(因為是"()"，裡面沒有參數)

public class SuperClass{
    public String name;

    public SuperClass(){
        this.name = "JS";
    }
}

---------------------------------------------------


---------------------------------------------------
-------------------------
Super
-------------------------
1. 跟this有點像，但他是參考父類別的屬性或方法 

public class SubClass extends SuperClass{
    public String nickName;

    public SubClass(){
        this.nickName = "little" + super.name;
    }
}

---------------------------------------------------



「當我們在 new 一個子類別的時候，他的父類別同時也會被 new 出來」

老師的這句話應該是指
像在SubClass.java 寫 public class SubClass extends SuperClass{...}
在Main.java 寫 SubClass subClass = new SubClass();
在 new 一個子類別 SubClass 的時候，他的父類別同時也會由父類別沒有參數的"default"建構子被 new 出來（就可以透過 super 使用父類別的屬性和方法）


這邊想問：
1. 在 extends 的作用下，當我們 new 一個子類別 SubClass 的時候，他的父類別只能透過沒有參數的"default"建構子被 new 出來嗎，還是他也能透過有參數的建構子被 new 出來？
（我試過一個方法是，把父類別那個沒有參數的建構子註解掉，留下有參數的那個建構子，這樣會編譯失敗）

2. 所謂 new 出來應該是產生實體(object或稱為instance)吧，
那在 new SubClass() 時候，他是產生 SubClass這個型別 的實體subClass，也就是他的實體存在subClass這裡，那父類別產生的實體會存在哪裡呢？





---------------------------------------------------
-------------------------
Static
-------------------------
1. 靜態區塊
2. 載入類別時進行初始化動作
3. 只執行一次！！！！！！！！！！！！！！！！！！

static{
    // do something here ONLY ONCE!!!!!!!!!!!!!!!!
}

---------------------------------------------------


*/