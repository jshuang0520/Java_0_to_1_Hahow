public class MainDemo{
    public static void main(String[] args){
        System.out.println("main thread starts");
        Thread thread1 = new Thread(new TestThread("thread1"));
        Thread thread2 = new Thread(new TestThread("thread2"));
        Thread thread3 = new Thread(new TestThread("thread3"));

        thread1.start();
        thread2.start();
        thread3.start();
        System.out.println("main thread ends");
    }
}