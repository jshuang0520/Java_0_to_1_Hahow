/**

---
folder-structure-of-tomcat:
    tomcat:
        bin: ["startup.sh", "shutdown.sh"]
            purpose: for server to startup or shutdown
        webapps:
            purpose: put all apllication apps here
            subfolder:
                examples: ["xxx.html", 
                           "classes folder(put all .java files & servlet here)", 
                           "jsp folder", 
                           "lib folder(put all .jar files here)", 
                           "WEB-INF folder > web.xml(put all configs here)"]

lib -> 第三方套件
/Users/johnson.huang/Java_0_to_1_Hahow/17-3_web_container/apache-tomcat-8.5.54/webapps/examples/WEB-INF/lib        

HelloWorldExample.java
/Users/johnson.huang/Java_0_to_1_Hahow/17-3_web_container/apache-tomcat-8.5.54/webapps/examples/WEB-INF/classes

web.xml -> config 
其中最重要的是 Servlet 的設定 config
<servlet>, <servlet-mapping> 這兩個標籤是一對的
/Users/johnson.huang/Java_0_to_1_Hahow/17-3_web_container/apache-tomcat-8.5.54/webapps/examples/WEB-INF/web.xml 

把需要的 web project 打包成 war檔的步驟：
step1: 按右鍵 > export > .war
step2: 路徑為 webapps 底下 - /Users/johnson.huang/Java_0_to_1_Hahow/17-3_web_container/apache-tomcat-8.5.54/webapps
step3: 執行
         錯誤執行方式：從 eclipse 執行
         正確執行方式：從 terminal 啟動 server (tomcat)
                     $ cd (to-your-tomcat-path)
                     $ sudo chmod *.sh    --> means 確保讓 .sh 的檔案都能被執行
                     $ ./startup.sh       --> 開啟 server
                     --> 發現 .war 被解壓縮成一個檔案
                     --> 此時若在瀏覽器輸入剛才的網址，就能看到和剛剛一樣的結果
                                            (網址 http://localhost:8080/17_web_container_tomcat/index.jsp)
                     $ ./shutdown.sh      --> 關閉 server


---------------------------------------------------
-------------------------
web.xml 說明
-------------------------

補 2:38 開始

---------------------------------------------------

*/