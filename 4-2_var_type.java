/* 犯錯版本
public class Trapezoid{
    public main(String args[]){
        int upperLine = 4
        int baseLine = 6
        int height = 5
        int area = (upperLine + baseLine) * height / 2
        System.out.println("area: "+ area)
    }
}
*/

public class Trapezoid{
    // 4. Method
    public static void main(String[] args){ // not String args[]
        int upperLine = 4;
        int baseLine = 6;
        int height = 5;
        int area = (upperLine + baseLine) * height / 2;
        System.out.println("area: "+ area);
    }
}