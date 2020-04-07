public class MainDemo{

    public static void main(String[] args){
        Video video = new Video();
        // video.fileName; --> NO!! It's private now, encapsulated in class Video
        video.setFileName("TestFile.txt");
        System.out.println("The file name is: " + video.getFileName());
        
    }
}