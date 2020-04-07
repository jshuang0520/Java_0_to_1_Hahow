import java.util.List;
import java.util.ArrayList;

public class MainDemo{

    public static void main(String[] args){
        // -------------------------------------------------------------------------------------------------------------------
    	// Generics - good choice
    	// -------------------------------------------------------------------------------------------------------------------

    	// Type String
        Foo<String> fooObj1 = new Foo<String>();
        fooObj1.setFoo("test");
        System.out.println("fooObj1: "+fooObj1.getFoo());

        // Type Double
        Foo<Double> fooObj2 = new Foo<Double>();
        fooObj2.setFoo(3.141592d); // notice the last word follows "d"
        System.out.println("fooObj2: "+fooObj2.getFoo());

        // Type Integer
        Foo<Integer> fooObj3 = new Foo<Integer>();
        fooObj3.setFoo(3); // notice the last word follows "d"
        System.out.println("fooObj3: "+fooObj3.getFoo());
        
        // ---------------------------------------------
        // polymorphism - bad choice
        Object fooObj = new Integer("1"); // Object is a SuperClass for all classes -> SuperClass: Object, SubClass: Integer
        Integer integer = (Integer)fooObj; // downCasting : SuperClass(Object) --to--> SubClass(Integer)
        System.out.println("fooObj: "+integer);



        // -------------------------------------------------------------------------------------------------------------------
        // Wildcard 通配字元
        // -------------------------------------------------------------------------------------------------------------------
        
        // <? extends ...>
        Foo<? extends List> fooObj4 = new Foo<ArrayList>();

        // <? super ...>
        Foo<? super ArrayList> fooObj5 = new Foo<List>();

    }
}