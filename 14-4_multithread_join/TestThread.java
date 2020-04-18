public class TestThread implements Runnable{
    private String name;

    public TestThread(String name){
        this.name = name;
    }
    // implements
    public void run(){
    	System.out.println(name + " start");

    	/* Trail 2 : sleep - blocked event */
    	try {
    		if ("thread1".equals(name))
    			Thread.sleep(1000); // 1 sec
    	}catch (InterruptedException e) {
    		e.printStackTrace();
    	}
    	
    	
    	System.out.println(name + " running");
        System.out.println(name + " end");
    }
}