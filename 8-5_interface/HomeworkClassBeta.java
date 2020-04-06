public class HomeworkClassBeta{
	// inner class
	
	
    class A implements Foo{
        public int bar(){
            return 1;
        }
    }
    
    
    // Method
    public int fubar(Foo foo){
        return foo.bar();
    }
    // Method
    public void testFoo(){
    	// inner class
    	// @SuppressWarnings("hiding") // the compiler recommended to do so
    	
    	
        class A implements Foo{
            public int bar(){
                return 2;
            }
        }
        
        
        System.out.println(fubar(new A()));
    }
    // Main Method
    public static void main(String[] argv){
        new HomeworkClassBeta().testFoo();
    }
}


/** 第幾行的版面有跑掉 要看講義噢！

Which three statements are true? (Choose three.) 
A. Compilation fails.
B.The code compiles and the output is 2.
C. If lines 16, 17 and 18 were removed（第一個 class A implements）, compilation would fail.
D. If lines 24, 25 and 26 were removed（第二個 class A implements）, compilation would fail.
E. If lines 16, 17 and 18 were removed（第一個 class A implements）, the code would compile and the output would be 2. 
F. If lines 24, 25 and 26 were removed（第二個 class A implements）, the code would compile and the output would be 1.
*/


/** 犯錯版本

我作答的內容: A, C, D 
因為覺得 class A implements 兩次 應該會有 Compilation 上的問題
*/


/** 犯錯版本

解答: B, E, F
*/

