public class Class1 {
    // 2. Instance Variables
    static int i = 123;   // "static" allocates memory in the very beginning, so there's no need to "new"(instantiate) before using this in the future.
    /** ex. 
    * If there exists Class3, and it wishes to use this int i in Class1, Class3 can use it directly. 
    * There's no need to new Class1 at first in order to use this int i for Class3. 
    */
    String str = "Hello";

    // 4. Methods
    public void function1(){
        int i = 456;
        System.out.println(i); // 456
    }
}