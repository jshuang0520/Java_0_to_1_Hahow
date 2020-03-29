public class TestDemo{
    // 4. Method
    public static void main(String[] args){
        String str = "id, name, age";
        String[] sArray = str.split(",");

        System.out.println(sArray[1].trim()); // name
        // .trim() to eliminate spaces, just like .strip() in python

        String str2 = "abcde";
        System.out.println(str2.substring(0,4)); // abcd
        // the same as python, the element of endIndex is not included
    }
}