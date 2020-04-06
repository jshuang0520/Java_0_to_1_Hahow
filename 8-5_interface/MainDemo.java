public class MainDemo{

    public static void main(String[] args){
        // polymorphism : object file is Type "File", but newed(implemented) by "Multimedia" --> So acutually, it's a object of "Multimedia" !!!
        File file = new Multimedia();
        System.out.println(file.getFileName()); // file is actually a "Multimedia" object, cause it was newed by it, so the methods of "Multimedia" would be called
    }
    // Methods
    public void process(File file, Network net){
        net.connect();
        net.transfer(file.getFileName());
        net.disconnect();
    }
}