// Abstract Class
public abstract class Network{
    // implemented method (abstract methods are also used here)
    public void transfer(String fileName){
        connect();
        System.out.println("Transfer " + fileName);
        disconnect();
    }

    // abstract methods
    public abstract void connect();
    public abstract void disconnect();
}