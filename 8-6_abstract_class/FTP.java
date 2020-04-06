public class FTP extends Network{
    @Override
    public void connect(){
        System.out.println("FTP connect");
    }

    @Override
    public void disconnect(){
        System.out.println("FTP disconnect");
    }
}


/**

Overload (多載) vs. Override (覆寫) — (I)
https://notfalse.net/58/overload

Overload (多載) vs. Override (覆寫) — (II)
https://notfalse.net/59/override

*/