public class SwitchDemo{
    public static void main(String[] args){
        /**

        Something like "if-else".

        But, to use "switch" statement,
        variables MUST be int or char !!!!!!!!!!!

        And "case" keyword.

        */
        char theCase = 'b'; // use char as variable here

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