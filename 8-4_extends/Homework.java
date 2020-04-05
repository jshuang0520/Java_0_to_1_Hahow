public class Homework{
    // inner class
    class Animal {
        public String noise(){
            return "peep";
        }
    }
    // inner class
    class Dog extends Animal{
        public String noise(){
            return "bark";
        }
    }
    // inner class
    class Cat extends Animal{
        public String noise(){
            return "meow";
        }
    }

    public static void main(String[] args){
        Animal animal = new Dog();
        Cat cat = (Cat)animal;
        System.out.println(cat.noise()); 
        
        /** 犯錯版本
        未看先猜答案是 D: Compilation fails，因為他這不是向上轉型或向下轉型
        */

        /** 老師解答

        答案是 E. An exception is thrown at runtime.
        Animal 的 refrence 是指向 Dog 物件實體，所以轉為 Cat 會在 runtime 時期發⽣生錯誤
        */
        
    }
}

