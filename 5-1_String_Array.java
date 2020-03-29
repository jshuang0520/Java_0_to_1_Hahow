public class Alligator{
    // 4. Method
    public static void main(String[] args){
        int[]x[]={{1,2},{3,4,5},{6,7,8,8}}; // int[]x[] 即 int[][]x
        int[][]y = x;
        System.out.println(y[2][1]);

        System.out.println(x[0][1]); //2
        System.out.println(y[1][1]); //4
        System.out.println(x[2][3]); //9

        // // https://stackoverflow.com/questions/409784/whats-the-simplest-way-to-print-a-java-array
        // String[][] deepArray = new String[][] y;
        // System.out.println(Arrays.deepToString(deepArray));
    }
}

// Java 多維陣列 即 {{}, {}, {}, ..., {}}，有點像R的list，但並非矩陣，他終究是array，像是抽屜
public class StringAndArray{
    // 4. Method
    public static void main(String[] args){
        // 0:22 Every element in an array should be the same (primitive) data type

        /* Way 1  to create an array */
        int[] num = {1,2,4,8,16};   // An "int" one-dimensional array
        System.out.println(num);    // [I@6d06d69c
        System.out.println(num[1]); // 2
        System.out.println(num[2]); // 4


        /* Way 2  to create an array */
        int[] num2 = new int[5];  // An "int" one-dimensional array, with length 5
        num2[0]=1;                // Then, fill the elements
        num2[1]=2;
        num2[2]=4;
        num2[3]=8;
        num2[4]=16;
        System.out.println(num2[0]); // 1


        int[][] num3 = new int[2][2]; // An "int" two-dimensional array, it's 2x2
        // or int[][] num3 = {{1,0}, {0,1}};
        num3[0][0]=1;
        num3[0][1]=0;
        num3[1][0]=0;
        num3[1][1]=1;
        System.out.println(num3[1][1]); // 1


        // 為什麼要用 Arrays.copyOf()
        // 12:29 物件的參考(reference) 
        /**
         * 物件的 參考(reference) 與 實體(instance) 是分開存放的
         * 在記憶體儲存的部分，分為 Stack & Heap 兩個地方
         * Heap 儲存 物件實體（真實資料的內容）
         * Stack 儲存 「Heap裡面那些實體的位址」
         * // Java 和 C 不同，C 可以透過指標(pointer)或其他的方式去存取記憶體/控制記憶體的位置
         * // 但在 Java 裡面卻不能碰到記憶體的位置，所以稱之為 reference
         * 但請注意，在Java讀到的reference也不會是記憶體裡真實的位置，而是指向Heap裡的位置 
         *  
         * =============================================================
         * 所以當透過 var1 去把 1 改成 2 時， var2 的值也會被改變
         * 因為這兩個變數的 reference 都指向同一個實體！！！！！！！！！！！
         *        Stack          Heap (儲存 物件實體（真實資料的內容）)
         * 
         *        var1   ------->  1 (the real value)
         *                     |
         *        var2   ______|
         * =============================================================
         */

         /**
          * int[] num2 = num1; 
          * 16:17 這一行的意思是：我把num1這個物件的reference指派給num2
          * 所以在做完這一行之後，num1和num2的 reference 都指向同一個實體物件，存在Heap上！！
          */

    }
}