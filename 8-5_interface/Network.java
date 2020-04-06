public interface Network{

    // 網路可能有 http, ftp, ssh, ...，不管他用哪一種，都可以使用以下定義的功能(method)
    public void connect();
    public void transfer(String fileName);
    public void disconnect();
}