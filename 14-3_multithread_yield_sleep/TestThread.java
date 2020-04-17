public class TestThread implements Runnable{
    private String name;

    public TestThread(String name){
        this.name = name;
    }
    // implements
    public void run(){
    	System.out.println(name + " start");
    	
//    	/* Trail 1 : yield() - still in RUNNABLE */
//    	if ("thread1".equals(name)) // there's no big bracket {}, so, for "if condition", it'll execute next line only
//    		Thread.yield(); // he makes way for others, but he still stays in RUNNABLE... who knows how fast(or slow) he'll be called by the thread scheduler!
        
    	
    	
    	
    	/* Trail 2 : sleep - blocked event */
    	try {
    		if ("thread1".equals(name))
    			Thread.sleep(3000); // 3 seconds
    	}catch (InterruptedException e) {
    		e.printStackTrace();
    	}
    	
    	
    	System.out.println(name + " running");
        System.out.println(name + " end");
    }
}