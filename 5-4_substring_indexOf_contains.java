public class TestDemo{
    // 4. Method
    public static void main(String[] args){
        String str = "aabbccdd";
        System.out.println(str.indexOf("b"));     // 2
        System.out.println(str.lastIndexOf("b")); // 3

        int startIndex = str.indexOf("b");
        int endIndex = str.lastIndexOf("c");
        System.out.println(str.substring(startIndex, endIndex+1)); // bbcc

        System.out.println(str.contains("A"));    // false
    }
}