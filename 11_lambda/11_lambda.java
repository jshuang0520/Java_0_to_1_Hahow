/**

---------------------------------------------------
-------------------------
lambda
-------------------------
1. 定義函式介面實作的一種形式 (Lambda就是在實作一個介面)
2. 不用建立實作的類別
3. 不用輸入方法名稱
4. 表示式
    (1) 等號左邊
        (a) Target Type 目標型態
        (b) Interface 定義函式介面
        (c) 只有一個抽象方法
    (2) 等號右邊
        (a) Expression - Lambda 表示式
        (b) Input -> Body(實作內容)
        (c) 可使用自定義的 Interface



 < Target Type > <Interface>                        < Expression >
               <只有一個抽象方法>            <  Input       ->  Body(實作內容) >
Comparator<Integer>  com     =     (Integer x, Integer y) ->     x-y;

Integer result = com.compare(5,2);



5. Lambda 裡的一個功能： 使用靜態方法來定義函式介面實作
    (1) 函式介面的實作參考某一個類別的靜態方法
    (2) 輸入與回傳的參數需一致
    (3) 物件名稱::方法名稱

// 相減的靜態方法
Math.subtractExact(5,2);

// 「參考」靜態方法
                       < 先寫物件名稱 Math > :: < 才寫靜態方法 subtractExact >
Comparator<Integer> com = Math::subtractExact;

Integer result = com.compare(5,2);


---------------------------------------------------



*/