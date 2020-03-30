public class TestDemo{
    // 4. Method
    public static void main(String[] args){
        String str = "abcABC123";
        
        // replace
        System.out.println(str.replace("a", "f")); // fbcABC123

        // regex + replaceAll
        System.out.println(str.replaceAll("\\d", "!")); // abcABC!!!

        /**                      <  package  >  <class>
         * Regular Expression - java.util.regex.Pattern
         * 
         * \\	The backslash character （最前面的反斜線是跳脫符號）
         *
         *
         * .	Any character (may or may not match line terminators)
         * \d	A digit: [0-9]
         * \D	A non-digit: [^0-9]
         *
         *
         * [a-zA-Z]	a through z or A through Z, inclusive (range)
         * 
         * [a-d[m-p]]	a through d, or m through p: [a-dm-p] (union)
         */
    }
}