/**

Thread 執行緒，是作業系統分配處理器時間的基本單位

單執行緒： 之前用 main()方法 / 過去電腦的cpu只有單核心，只能做一件事
多執行緒： 一人同時多工，同時可以執行多個程式 / 現在cpu有雙核心、四核心，可以同時做多件事情
         一個網站同時有多位使用者登入使用網站的資源，servlet在每一個使用者登進來時就產生一個thread，
         所以不同使用者即使同時使用同一個網站也不會互相干擾


---------------------------------------------------
-------------------------
Thread 物件
https://docs.oracle.com/javase/8/docs/api/java/lang/Thread.html
-------------------------
1. new Thread
-
2. start()                   - 準備執行這個 thread（有點像在eclipse要執行main()時按下run()按鈕）
3. 進去 Runnable 排隊          - 在「start()準備執行」後其實還沒有真的開始執行，而是「進去 Runnable 排隊」
4. 等待 thread scheduler 叫號  - 進去排隊之後，等待thread scheduler排班器叫號
-- 如果被 block (像time.sleep) 就要等到被 block 完之後，重新回到 Runnable 排隊
5. run()                      - 就是到 Running 區，真的在執行
-
6. Thread dead


https://www.javatpoint.com/life-cycle-of-a-thread
1. New
2. Runnable
3. Running
4. Non-Runnable (Blocked)
5. Terminated


1) New
The thread is in new state if you create an instance of Thread class but before the invocation of start() method.

2) Runnable
The thread is in runnable state after invocation of start() method, but the thread scheduler has not selected it to be the running thread.

3) Running
The thread is in running state if the thread scheduler has selected it.

4) Non-Runnable (Blocked)
This is the state when the thread is still alive, but is currently not eligible to run.

5) Terminated
A thread is in terminated or dead state when its run() method exits.





https://docs.oracle.com/javase/8/docs/api/java/lang/Thread.html
java.lang.Thread

Constructors:
Constructor1. Thread()                - Allocates a new Thread object.
Constructor2. Thread(Runnable target) - Allocates a new Thread object.

Ways to generate a thread:
1. extends class Thread - https://docs.oracle.com/javase/8/docs/api/java/lang/Thread.html
    Steps:
    (1) overwrite run() method
    (2) call thread.start() in main() method of your self-defined class
    
    Cons:
    (1) This class can't extend other classes (in Java, you can only extend one class)
2. extends interface Runnable - https://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html
    (1) implements Runnable interface & run() method
    (2) put that object into this constructor: Thread(Runnable target)
    (3) call thread.start() in main() method of your self-defined class


---------------------------------------------------

*/