// relationship between String(字串) and char(字元)
public class StringDemo{
    // 4. Method
    public static void main(String[] args){

        /* Way 1  */
        char[] c = {'a', 'b', 'c'}; // 而非 char[] c = {"a", "b", "c"};
        System.out.println(c);
        
        /* Way 2 */
        String str2 = "abc";
        System.out.println(str2.charAt(0));

    }
}
