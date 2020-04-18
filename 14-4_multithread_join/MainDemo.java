public class MainDemo{
    public static void main(String[] args){
        System.out.println("main thread starts");
        Thread thread1 = new Thread(new TestThread("thread1"));
        thread1.start();

        // join thread2 : let thread2 cut in line!
        Thread thread2 = new Thread(new TestThread("thread2"));
        thread2.start();
        try{
            thread2.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        
        System.out.println("main thread ends");
    }
}

/* out:

main thread starts
thread1 start
thread2 start
thread2 running
thread2 end       --------> join thread2, let it cut in line
main thread ends  --------> cut in line by thread2
thread1 running
thread1 end --------------> a sleepy guy (blocked event)

*/