public class MainDemo{

    public static void main(String[] args){
        try {
        	System.out.println("here's in try");
        	throw new CustomizedException("Error, e04!"); // to throw an except intentionally
        }catch(CustomizedException e){
        	System.out.println(e.getMessage());
        	System.out.println("here's in except");
        }
    }
}