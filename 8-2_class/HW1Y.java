// Class Declaration
public class HW1Y extends HW1X{
    // "default constructor"
	HW1Y(){
        super(6);
        System.out.print(3);
    }
    // "overload constructor"
	HW1Y(int y){
        this();
        System.out.print(4);
    }
    // Methods
    public static void main(String[] a){new HW1Y(5);}
}