/**

---------------------------------------------------
-------------------------
Generics 泛型
-------------------------
1. 泛型是多型(polymorphism)的一種技巧
2. 當編譯期間無法確定程式碼的撰寫方式，得依照「執行期間」的狀況而決定
3. 不需要因為資料型的的限制去實作多種方法，只需要實作一種即可
4. 定義「安全的」泛型類別(Generics Class)，泛型提供編譯時期檢查 --> 尤其若有需要向上/向下轉型，如果使用泛型在寫，則在使用編譯器的期間就能及早發現error --> 不必等到runtime，程式都上線了才發現error


public class Foo<T>{
    private T f;
}

public class Foo<T1,T2>{
    private T1 f1;
    private T2 f2;
}

---------------------------------------------------



---------------------------------------------------
-------------------------
Wildcard 通配字元
「通配字元(?)不能當作宣告方法的型別，必須要用T或是其他參數名稱」
-------------------------
1. 共變性
2. Doo<? extends List> ： 繼承於 List 的子類別或實作 List 介面的類別
   HwGenericB<T extends Pet>
3. Doo<? super List>   ： List 的父類別
   HwGenericB<T super Pet>

Doo<? extends List> 代表 1. 要放到 Doo 這個class的型別，必須要是繼承於 List 的子類別 或者是 2. 實作 List 這個介面的類別

Doo<? super List>


---------------------------------------------------


*/