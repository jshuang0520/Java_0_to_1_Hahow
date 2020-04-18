/**



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
                       |                            |                               |
                       |                            |                               |
                       |                            |                               |
                       |                            |                               |
                       |                            |                               |
                       |       (LOCKED POOL)        v                               |
                       <-------- BLOCKED 1 <---------                               |
                    Unblocked          ^      Blocked_event                         |
                                       |      ex. synchronized                      |
                                       |                                            |
                                       |                                            |
                                       |                                            |
                                       |                                            |
                                       |                         (wait POOL)        |
                                        <------------------------ BLOCKED 2 <-------- 
                                    Unblocked                               Blocked_event
                                    ex. notify()                            ex. wait()
                                    ex. interrupt()


*/