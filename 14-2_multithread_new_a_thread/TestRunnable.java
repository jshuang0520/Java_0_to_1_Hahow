/**
Recommanded !
Recommanded !
Recommanded ! 


Ways to generate a thread:
2. extends interface Runnable - https://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html
    Steps:
    (1) implements Runnable interface & run() method
    (2) put that object into this constructor: Thread(Runnable target)
    (3) call thread.start() in main() method of your self-defined class

*/

public class TestRunnable implements Runnable{
    private String name;

    public TestRunnable(String name){
        this.name = name;
    }

    // implements run() method
    public void run(){
        System.out.println(name + " is running...");
    }
}