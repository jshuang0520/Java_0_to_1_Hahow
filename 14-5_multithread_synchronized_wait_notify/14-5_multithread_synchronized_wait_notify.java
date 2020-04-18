/**


---------------------------------------------------
-------------------------
同步 synchronized
-------------------------
多執行緒的缺點：
1. 多執行緒在使用同一個資料（「多個執行緒共用同一個物件」）時，會出現資料不一致的情況
    ex. 在多執行緒下，有人塞入資料有人讀取，萬一B執行緒本來要讀取原本的資料，卻因為A執行緒比他早一步塞入資料（更新掉原有的）才被B執行緒取得，就取錯了
2. 因為多執行緒的執行時間不一定，所以問題不一定會發生（但仍然有機會發生）

解決方法：
1. keyword "synchronized"
    (1) to ensure there's ONLY ONE thread using this object
    (2) 同步化區塊 synchronized(this){
                     // do something in this synchronized section...
                  }
    (3) 物件的鎖定(lock)，執行緒要取得lock才能執行synchronized裡面的內容（每個物件的身上都有一個 lock flag）


class User{
    // 2. Instance variable
    private String name;

    // 4. Method
    // ---------- keyword "synchronized" : to solve things bothered by multi-thread issue ----------
    public synchronized setName(String name){
        this.name = name;
    }

    // 4. Method
    public getName{
        return name;
    }
}

ThreadA threadA = new ThreadA(user);
ThreadB threadB = new ThreadB(user);


---------------------------------------------------



multithread - 
Blocked_event 1. synchronized: the one(thread) who gets the 'lock flag' is unblocked, and is able to be back to RUNNABLE
Blocked_event 2. wait: after enough waiting (or notified), then it'll have qualification to chase for the 'lock flag'


new Thread                                                         Dead
(Constructor1. Thread())                                             ^
(Constructor2. Thread(Runnable target))                              |
     |                                                               |          
     |                                                               |          
     |                                                               |          
     |              Unblocked                   Blocked_event        |
     |                                          ex. sleep            |
     |                  --------- BLOCKED <---------                 |
     |                 |                            |                |
     |                 |                            |                |
     |                 |                            |                |
     |                 |                            |                |
     |                 |                            |                |
     |                 |                            |                |
     |                 v                            |                |
     -------------> RUNNABLE <----------------> RUNNING ------------->
        start()               thread_scheduler      |        run()
                                                    |_______________________________
              When a thread yields,                 |                               |
              this thread not only makes way for other threads,                     |
              but also stays in RUNNABLE.           |                               |
              HOWEVER, you DON'T know how much it yields!                           |
              maybe just~ a little bit, or, a lot.  |                               |
                                                    |                               |
                                                    |                               |
                       ^                            |                               |
Unblocked              |                            |                               |
the thread gets the    |                            |                               |
"lock flag" of the object                           |                               |
is unblocked           |                            | synchronized                  | wait
                       |                            |                               |
                       |                            |                               |
                       |       (LOCKED POOL)        v                               |
everyone here(lock pool)                                                            |
need to chase for the "unique" lock flag for that synchronized object,              |
then can go next stage(RUNNING) if thread_scheduler calls                           |
                       <-------- BLOCKED 1 <---------                               |
                    Unblocked          ^      Blocked_event                         |
                                       |      ex. synchronized                      |
                                       |                                            |
                                       |                                            |
                                       |                                            |
                                       |                                            |
                                       |                         (wait POOL)        |
                                            you're NOT qualified to get "lock" flag in "wait pool"
                                        <------------------------ BLOCKED 2 <-------- 
                                    Unblocked                               Blocked_event
                                    ex. notify()                            ex. wait()
                                    ex. interrupt()


*/