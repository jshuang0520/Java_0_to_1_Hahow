public class MainDemo{

    public static void main(String[] args){
        /**
        SuperClass super1 = new SuperClass();
             |        |      |             |_________________
       ______|        |      |__________________             |
      |               |                         |            |
A "type SuperClass" object(or say instance) is newed by a "default constructor"

        */

    	// new SuperClass()     -----> A "default constructor" (with no args/params)
        SuperClass super1  = new SuperClass();
        SuperClass super11 = new SuperClass(); // new it to check if static only executes once
        SuperClass super12 = new SuperClass(); // new it to check if static only executes once
        System.out.println(super1.name); // someone (newed by 'default' constructor in SuperClass)

        // new SuperClass("JS") -----> A "overload constructor" (with args/params)
        SuperClass super2 = new SuperClass("JS");
        /** A "type SuperClass" object(super2) is newed by a "overload constructor"
        */
        System.out.println(super2.name); // JS (newed by 'overload' constructor in SuperClass)


        // new SubClass(), but SubClass extends SuperClass, so actually, SuperClass() is newed in the meanwhile
        SubClass subClass = new SubClass();
        System.out.println(subClass.nickName); // Here's SubClass, print little someone (newed by 'default' constructor in SuperClass)
    }

    
}