/**
Ways to generate a thread:
1. extends class Thread - https://docs.oracle.com/javase/8/docs/api/java/lang/Thread.html
    Steps:
    (1) overwrite run() method
    (2) call thread.start() in main() method of your self-defined class
    Cons:
    (1) This class can't extend other classes (in Java, you can only extend one class)
*/

public class TestThread extends Thread{
    private String name;

    public TestThread(String name){
        this.name = name;
    }

    // overwrite run() method
    public void run(){
        System.out.println(name + " is running...");
    }
}