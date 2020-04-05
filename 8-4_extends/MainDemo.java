public class MainDemo{
    public static void main(String[] args){
        // Polymorphism checking
        Multimedia media = new Video(); // mdedia 用父類別的 Multimedia 資料型態，但實際上是透過子類別 Video 去 new 出來的物件
        media.play(); // Playing video...，是子類別的方法!! 因為實際上這個 media 物件的實體是由子類別  Video 去 new 出來的啊！
                                           

        /**
        public class B extends A {
            // A 是父類別， B 是子類別

            // (1) 向上轉型 - 將子類別的物件傳給父類別（向父類別轉型）
            B b = new B(); // 原本是子類別B的資料型態；實際上的「物件由子類別B實現」
            A a = b;       // 向上轉型成父類別A的資料型態

            // (2) 向下轉型 - 將父類別的物件傳給子類別（向子類別強制轉型，需要加小括號()）
            A a = new B(); // 原本是父類別B的資料型態；實際上的「物件由子類別B實現」
            B b = (B)a;    // 向下轉型成子類別B的資料型態 // 向下轉型 - 將父類別的物件傳給子類別；強制轉型時，前方加上小括號(裡面寫想要強制轉成的(子類別的)Type)
        }
        */

        // 向上轉型
        Video b1 = new Video(); // 實際上的「物件由子類別實現」
        Multimedia a1 = b1;
        a1.play(); // Playing video...，「是子類別的方法」!! 
        // 因為雖然我們向上喘行把它轉成父類別，但實際執行的時候，物件還是使用子類別的物件


        // 向下轉型
        Multimedia a2 = new Video(); // 實際上的「物件由子類別實現」
        Video b2 = (Video)a2;
        b2.play(); // Playing video...，「是子類別的方法」!! 



        // 結論：不管物件中間有被向上轉型或向下轉型，要看最開始實際上物件是由哪一個類別實現的，之後所使用的屬性和方法就是用那個類別的

    }


    // 4. Methods
    public void process(Multimedia media){ // goodness of polymorphism : decouple, one just need to focus on business model(logic/process) here, no need to concern about implementation and other details
        System.out.println("Start to do something");
        media.play();
        System.out.println("Stop to do something");
    }

}