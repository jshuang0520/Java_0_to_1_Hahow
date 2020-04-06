/**

---------------------------------------------------
-------------------------
Abstract Class 抽象類別
-------------------------
1. 至少一個抽象方法的類別
2. 繼承抽象類別的子別，必須要實作抽象方法

public abstract class Network{
    public abstract void connect();
}

---------------------------------------------------

*/

/**

Overload (多載) vs. Override (覆寫) — (I)
https://notfalse.net/58/overload

Overload (多載) vs. Override (覆寫) — (II)
https://notfalse.net/59/override

*/


/** Homework

// interface
interface Data {
    public void load();
}

// abstract class
abstract class Info {
    public abstract void load();
}

Q : Which class correctly uses the Data interface and Info class?
我的答案 : A. public class Employee extends Info implements Data{
    public void load(){
        // do something here...
    }
}


但我本來以為是先 implements Data 再 extends Info，
沒想到是相反，是 class ... extends <Abstract Class> implements <Interface>

*/