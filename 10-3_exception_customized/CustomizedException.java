public class CustomizedException extends Exception{
    // Instance Variable
    private String msg;

    // Constructor Declaration
    public CustomizedException(String msg){
        this.msg = msg;
    }
    // Methods
    public String getMessage(){
        return "test message: " + msg;
    }
}

/* out:

here's in try
test message: Error, e04!
here's in except
*/