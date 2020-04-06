public interface File {

    // 4. 在 Java 的 interface 裡面，若要定義「attribute 屬性」，必須是一個「靜態且不能修改 (static + final) 的常數」
    public static final String test = "test";

    // Methods (in Java interface, don't implement the methods)
    public String getFileName();
}