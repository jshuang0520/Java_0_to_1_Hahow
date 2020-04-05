// Class Declaration
class X{
    // "default constructor"
    X(){System.out.println(1);}
    // "overload constructor"
    X(int x){
        this();
        System.out.print(2);
    }
}

// Class Declaration
public class Y extends X{
    // "default constructor"
    Y(){
        super(6);
        System.out.print(3);
    }
    // "overload constructor"
    Y(int y){
        this();
        System.out.print(4);
    }
    // Methods
    public static void main(String[] a){new Y(5);}
}






/**

JAVA 證照考題

看最後一行 new Y(5)
↓
呼叫Y有輸入參數的建構子 Y(int y){
    1. this() 呼叫自己 -> 呼叫 Y沒有輸入參數的建構子 Y(){
        1. super(6) -> new 父類別 X，super(6)有放參數6，就是呼叫 X有輸入參數的建構子 X(int x){
            1. this() 呼叫自己 -> 呼叫 X沒有輸入參數的建構子 X(){
                -> print(1)
            }
            2. print(2)
        }
        2. print(3)
    }
    2. print(4)
}

↓
所以最後會 print 出 1234


*/