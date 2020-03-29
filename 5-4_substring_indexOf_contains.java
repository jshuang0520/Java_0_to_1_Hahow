public class TestDemo{
    // 4. Methods
    public static void main(String[] args){
        String str = "aabbccdd";
        System.out.println(str.indexOf("b"));
        System.out.println(str.lastIndexOf("b"));

        int startIndex = str.indexOf("b");
        int endIndex = str.lastIndexOf("c");
        System.out.println(str.substring(startIndex, endIndex+1));

        System.out.println(str.contains("A"));
    }
}