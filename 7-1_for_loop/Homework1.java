import java.util.Arrays;

public class Homework1{
    public static void main(String[] args){
        
    	int [][] array = new int[13][13]; // int [][] array = {}; 把錯誤寫法註解掉
        for(int i = 0 ; i < 13 ; i++){
            for(int j = 0 ; j < 13 ; j++){
                array[i][j] = i*j;
            }
        }
        System.out.println(array[0][0]);
        System.out.println(array[2][2]);
        System.out.println(array[12][12]);
        System.out.println(Arrays.deepToString(array));
        
        /**
         * Java Program to Print an Array
         * https://www.programiz.com/java-programming/examples/print-array
         * 
         * Example 3: Print a Multi-dimenstional Array
         * import java.util.Arrays;
         * println(Arrays.deepToString(array));
         */
        
    }
}

/** Teacher's solution

public class Homework1 {
	public static void main(String[] args) {
		// Print first line
		System.out.print(" ");
		for(int i = 0; i < 13; i ++){
			System.out.print( i + " ");
		}
		System.out.println("");
		// Print 12 x 12 result
		for(int i = 0; i < 13; i ++){
			System.out.print(i + " ");
			for(int j = 0; j < 13; j ++){
				System.out.print(i*j + " ");
			}
			System.out.println("");
		}
	}
}
*/

