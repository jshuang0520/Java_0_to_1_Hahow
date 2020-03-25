/* 犯錯版本
public class VariableType{
    // 4. Method
    public static void main(String args[]){
        // futureValue = presentValue * (1+i)^n
        double presentValue;
        double i;
        double futureValue = presentValue * Math((1+i), n);
        System.out.println(futureValue)
    }
}
*/

public class VariableType{
    // 4. Method
    public static void main(String[] args){               // not String args[]
        // futureValue = presentValue * (1+i)^n
        int presentValue = 1000;                          // not everyone should be double
        double i = 0.01;
        int n = 5;
        double futureValue = presentValue * Math.pow((1+i), n); // Math.pow()
        System.out.println(futureValue)
    }
}

/* 老師版本
package codegym;
public class HomeWork {
	public static void main(String[] args) {
		int pv = 100000;
		double i = 0.02;
		int n = 10;
		double fv = pv*Math.pow((1+i), n);
		System.out.println(fv);
	}
}
*/