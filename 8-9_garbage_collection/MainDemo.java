public class MainDemo{
    public static void main(String[] args){
        // new objects
        GC gc1 = new GC("gc1");
        GC gc2 = new GC("gc2");
        GC gc3 = new GC("gc3");

        // assign it(reference) to null --> means the object is no longer be used!!
        gc1 = null;
        gc2 = null;
        gc3 = null;

        // call gc method --> Sys WON'T do it immediately, it'll wait until it ensures this object is no longer be used, then garbage collect it!
        System.gc();

        try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}