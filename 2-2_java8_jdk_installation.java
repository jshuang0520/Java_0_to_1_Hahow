/**

Java 環境介紹

1. JVM (Java Virtual Machine)：Java 虛擬機器
- java可跨平台的關鍵:把JAVA程式碼翻譯成各作業系統能看得懂的語言


2. JRE (Java Runtime Environment)：Java 執行環境
- 運作 java 程式用


3. JDK (Java Developement Kit)：Java 開發工具
- 由 Oracle 提供
- 包含 JVM + JRE + 開發常用函式庫
- 開發人員下載這個


4. SDK (Software Developement Kit)：軟體 開發工具
- JDK 就是其中一種 SDK
- 需要用到第三方平台軟體(ex. google)，而不只是 Oracle 的，就稱為 SDK




                         (    JDK    )
                         Javac_compiler                       JVM
Java_source_code( .java ) ------------> byte_code( .class ) -------> machine_code_for_host_system (ex. Linux / Windows / Mac )
                                        (0 & 1 only)           |
                                                               |
                                                               v
                                                        JVM (即虛擬機，就有記憶體)
                                                
                                                        // Java 記憶體大小控制
                                                        java -Xmx2048m -Xms256m

                       note. Javac : the "c" means compiler
 */


/**

================== java 8 jdk download ==================

1. Download
google : java 8 jdk download
--> https://www.oracle.com/java/technologies/javase-jdk8-downloads.html

(MacOS version)
newest java 8 version for 2020-04-02 is "java 8 version 241" (jdk-8u241-macosx-x64.dmg)

2. Installation

3. Check
$ java -version
and see this message : java version "1.8.0_241"
so far so good!


================== IDE download - Eclipse ==================
https://www.eclipse.org/

- click "IDE and Tools"
===== download - JavaEE (for web development in Java) =====

For now (2020-03 version), one just need to download Eclipse. It's all good.

*/



/**

Another choice for IDE :
================== IDE download - IntelliJ IDEA ==================

https://www.jetbrains.com/idea/


Free, open-source version : Community Version
Pro version               : Ultimate Version - For web and enterprise development

WARNING : 
Developing a Java EE Application
- This feature is only supported in the Ultimate edition.
// https://www.jetbrains.com/help/idea/creating-and-running-your-first-java-ee-application.html


*/

// So I choce Eclipse for my IDE eventually.