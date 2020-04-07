import java.util.*;

public class HwGenericB<T extends Pet>{
    public T foo;
    public void setFoo(T foo){
        this.foo = foo;
    }
    public T getFoo(){
        return foo;
    }

    public static void main(String[] args){
        HwGenericB<Cat> bar = new HwGenericB<Cat>();
        bar.setFoo(new Cat());
        Cat c = bar.getFoo();
        System.out.println(bar.getFoo());
    }
}

/*
通配字元(?)不能當作宣告方法的型別，必須要用T或是其他參數名稱
*/