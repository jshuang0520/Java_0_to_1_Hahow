public class TestDemo {
    public static void main(String[] args){
        // for 
        for (int i = 1; i < 10; i++){
            for (int j = 1; j < 10; j++){
                System.out.println(i+"x"+j+"="+i*j);
            }
        }
        
        int [] array = {1,2,3};
        // for
        for(int n = 0; n < array.length; n++){
            System.out.println(array[n]);
        }
        // for each
        for(int m: array){
            System.out.println("\n"+m);
        }
    }
}