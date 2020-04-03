public class WhileDemo{
    int i = 11;
    // while    : pre-test loop  (前測試迴圈)
    while (i < 10){
        System.out.println(i);
        i++;
    }
    // do-while : post-test loop (後測試迴圈)
    do{
        System.out.println(i);
        i++;
    }while (i < 10);
}