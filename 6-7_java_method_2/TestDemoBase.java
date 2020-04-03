public class TestDemoBase{
    // 4. Methods
    public static void main(String[] args){
        TestDemoBase base = new TestDemoBase();
        System.out.println(base.shout("Baseclass", "pika pika ~"));

        TestDemoSub sub = new TestDemoSub();
        System.out.println(sub.shout("Subclass", "......"));

    }

    public String shout(String s1, String s2){
        return "In " + s1 + ", Pikachu says: " + s2;
    }
}