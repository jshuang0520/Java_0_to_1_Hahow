public class MainDemo{
    public static void main(String[] args){
        System.out.println("main thread starts");

        // Constructor1. Thread() 
        TestThread thread1 = new TestThread("thread1");
        TestThread thread2 = new TestThread("thread2");
        TestThread thread3 = new TestThread("thread3");
        thread1.start(); // thread 被啟動(start)之後，就像失散的孤兒，去過自己的生活，人生就是自己的
        thread2.start();
        thread3.start();


        // Recommanded - Constructor2. Thread(Runnable target)
        Thread thread4 = new Thread(new TestRunnable("thread4"));
        Thread thread5 = new Thread(new TestRunnable("thread5"));
        Thread thread6 = new Thread(new TestRunnable("thread6"));
        thread4.start(); // thread 被啟動(start)之後，就像失散的孤兒，去過自己的生活，人生就是自己的
        thread5.start();
        thread6.start();

        System.out.println("main thread ends");
    }
}

/* 
out1:

main thread starts
main thread ends
thread2 is running...
thread1 is running...
thread3 is running...

*/


/*
out2:

main thread starts
thread2 is running...
thread3 is running...
thread1 is running...
thread4 is running...
main thread ends
thread6 is running...
thread5 is running...


out3:

main thread starts
thread1 is running...
thread2 is running...
thread3 is running...
thread4 is running...
thread5 is running...
main thread ends
thread6 is running...

*/
