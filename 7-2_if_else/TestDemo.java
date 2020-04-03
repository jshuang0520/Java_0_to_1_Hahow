public class TestDemo{
    public static void main(String[] args){
    	TestDemo demo = new TestDemo();
        System.out.println(demo.inverse(123));
        System.out.println(demo.inverse(-123));
        System.out.println(demo.inverse(-96463453));
        System.out.println(demo.inverse(43713));
    }
    
    // Use char[] rather than String, cause array can use array[i] manipulation, String can't
    public char[] inverse(int num){
    	// int to string
        String strI = Integer.toString(num);
        // String.toCharArray()
        char[] charArray = strI.toCharArray();
        // empty char array -> to put the result (answer) here
        char[] charArrayReverse = new char[charArray.length];
        
        if (num > 0){
        	System.out.println("condition: >0");
            int j = 0;
            for (int i = charArray.length-1 ; i > -1 ; i--){ // charArray.length - 1, rather than charArray.length ; i > -1, rather that i > 0
            	charArrayReverse[j] = charArray[i];
            	j ++ ;
            }
            return charArrayReverse;
        }else{
        	System.out.println("condition: <0");
            int j = 1;                                      // not j = 0;
            charArrayReverse[0] = charArray[0];
            for (int i = charArray.length-1 ; i > 0 ; i--){ // i > 0, rather that i > -1
            	charArrayReverse[j] = charArray[i];
            	j ++ ;
            }
            return charArrayReverse;
        }
    }
}




/** 犯錯版本：直接用 String 而不是做出 char 的 array，就不能用 array[i] 去操作，卡住

public class TestDemo{
    public static void main(String[] args){
    	TestDemo demo = new TestDemo();
        System.out.println(demo.inverse(123));
        
    }

    public String inverse(int num){
        String strI = Integer.toString(num);
        System.out.println(strI);
        if (num > 0){
        	System.out.println(">0");
            String str = "";
            for (int i = strI.length() ; i > 0 ; i--){
            	System.out.println(strI[i]);
                str += strI;
            }
            return str;
        } else{
            System.out.println("else");
            return "";
        }

    }
}

 */


/**

參考老師解答：要把做成 char 的 array，是 array 才能用 array[i] 去操作

public static char[] reverse(int x){
	// 先將輸入值數字轉為字串
	String str = String.valueOf(x);

	// 將字串轉為字元陣列
	char[] cArray = str.toCharArray();

	// 宣告一個新的陣列，下方反轉後的字元將會放入此新陣列當中
	char[] cRet = new char[cArray.length];
	
	// 下方for迴圈，是將原本的數字，從最後方，也就是個位數字開始取
	// 然後依序將取出來的數字放入新的陣列cRet當中，從索引值0開始依序放入，如此就將原本的數字做反轉的動作
	int j = 0;
	for(int i = cArray.length-1; i>=0; i --){
		cRet[j] = cArray[i];
		j ++;
	}
	
	return cRet;
 */
