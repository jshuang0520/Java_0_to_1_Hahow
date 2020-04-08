// a factory to new objects (produce products)
public class Factory{
    // Here's a method to new an object from the factory, from the perspective of objects outside, they don't need to know how the factory to create that object, so ENCAPSULATION here!
    public static Product getProduct(){
        
        System.out.println("Do something");
        /**
        Here means maybe you have to do some procedures/logic to create an object,
        such as:
        - query data from db dynamically
        or
        - call api from other system
        */

        // then can you fianlly new an object
        return new Product();
    }
}


/**
Maybe you want to creat more kind of products,
you can make this Factory as an Interface, and implement it with different factory classes 

*/