public class SuperClass {
    public String name;

    // staic
    static{
    	System.out.println("See, even if you new SuperClass() multiple times in MainDemo, static only executes ONCE!\n");
    }
    
    // A "default constructor" (with no args/params)
    public SuperClass(){
        this.name = "someone (newed by 'default' constructor in SuperClass)";
        System.out.println("Running default constructor in SuperClass()...\n");
    }

    // A "overload constructor" (with args/params)
    public SuperClass(String name){
        this.name = name + " (newed by 'overload' constructor in SuperClass)";
    }
}