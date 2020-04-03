public class SwitchDemo{
    public static void main(String[] args){
        char theCase = 'b';

        switch(theCase){
            case 'a':
            System.out.println("a");
            break; // use "break" to stop if matched, to be more efficient
            
            case 'b':
            System.out.println("b");
            break;

            // optional, there's no need to set default
            default :
            System.out.println("default");
        }
    }
}