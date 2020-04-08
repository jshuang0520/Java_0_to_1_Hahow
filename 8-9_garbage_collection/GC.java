public class GC{
    private String name;

    // Method - Constructor Declaration
    public GC(String name){
        this.name = name;
        System.out.println(this.name + ": Start");
    }

    // Method - finalize(): is a method which be last executed method of an object
    protected void finalize(){
        System.out.println(this.name + ": End");
    }
}