// Class Declaration
public class OuterClass{

    // inner class - Class Declaration
    private class InnerClass{
        // Instance Variables 
        private String name;
        
        // Methods
        public void sayHello(){
            System.out.println("Hello " + name);
        }
    }

    // Methods
    public void callInnerClass(){
        InnerClass inner = new InnerClass();
        inner.name = "JS";
        inner.sayHello();
    }
}