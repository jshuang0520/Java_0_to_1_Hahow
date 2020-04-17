/**



new Thread                                                         Dead
(Constructor1. Thread())                                             ^
(Constructor2. Thread(Runnable target))                              |
     |                                                               |          
     |                                                               |          
     |                                                               |          
     |                                                               |
     |                  --------- BLOCKED <---------                 |
     |                 |                            |                |
     |                 |                            |                |
     |                 |                            |                |
     |                 |                            |                |
     |                 |                            |                |
     |                 |                            |                |
     |                 v                            |                |
     -------------> RUNNABLE <----------------> RUNNING ------------->
        start()               thread_scheduler               run()

              When a thread yields,
              this thread not only makes way for other threads,
              but also stays in RUNNABLE.
              HOWEVER, you DON'T know how much it yields!
              maybe just~ a little bit, or, a lot.

                                         sleep is a blocked event



                       ^                            |                 
                       |                            |                 
                       |                            |                 
                       |                            |                 
                       |                            |                 
                       |                            |                 
                       |                            v 
                       <-------- BLOCKED <---------
                    Unblocked                Blocked_event
                                             ex. sleep



*/