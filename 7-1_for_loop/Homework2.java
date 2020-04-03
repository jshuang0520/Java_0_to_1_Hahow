public class Homework2{
    public static void main(String[] args){
        int[] array = {3,10,18,24};
        // for 
        int sum1 = 0;
        for (int i = 0 ; i < array.length ; i++){
            sum1 += array[i];
        }
        System.out.println("for: " + sum1);

        // foreach
        int sum2 = 0;
        for (int j: array){
            sum2 += j;
        }
        System.out.println("foreach: " + sum2);
    }
}