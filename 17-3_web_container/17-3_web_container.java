/**

If encountering any error (like "An internal error occurred during: "Loading descriptor for … java.lang.NullPointerException", can't create a server project, ...),
make sure you've installed these well:
1. Eclipse Java EE Developer Tools
2. Eclipse Java Web Developer Tools
3. JST Server Adapters
4. JST Server Adapters Extensions
https://stackoverflow.com/questions/30250895/an-internal-error-occurred-during-loading-descriptor-for-java-lang-nullpoi

---
web-container:
    name: "Apache Tomcat"
    official-website: "http://tomcat.apache.org/"
    execute:
        folder-path: "apache-tomcat-8.5.54 > bin (all execution files are in this bin folder)"
        command-line:
            turn-on-web-server:   "startup.sh"
            shut-down-web-server: "shutdown.sh"
    connect-to-eclipse:
        extension-needed:
            how-to-install: Eclipse > Help > Install new Software
            extensions: ["Eclipse Java EE Developer Tools", "JST Server Adapters", "JST Server Adapters extensions", "Eclipse Java Web Developer Tools"]
            reference: ["https://stackoverflow.com/questions/13039449/no-server-in-eclipse-trying-to-install-tomcat", "https://stackoverflow.com/questions/23504455/compilation-error-failed-while-installing-dynamic-web-module-2-5"]
    new:
        server: 
            step1: "Eclipse > File > new > others > Server > Server (Or go Eclipse > Window > Show View > Others > Server > Servers)"
            step2: {"Select a server type" : "Apache > Tomcat 8.5",
                    "Server's host name" : "localhost",
                    "Server name" : "Tomcat v8.5 Server at localhost",
                    "in the next step, Server runtime directory" : "/Users/johnson.huang/eclipse_workspace/apache-tomcat-8.5.54 - 輸入到 Apache tomcat 加版本號就好，後面的路徑就不要加了！"}
            step3: "you can see a 'Servers' bookmark if success (Or go Eclipse > Window > Show View > Others > Server > Servers --> click open)"
            info:
                server-name: "Tomcat v8.5 Server at localhost"
                host-name: "localhost"
                runtime-environment: "Apache Tomcat v8.5 (5)"
                configuration-path: "/Servers/Tomcat v8.5 Server at localhost-config"
        dynamic-web-project:
            step1: "Eclipse > File > new > others > Web > Dynamic Web Project"
            step2: {"project name" : "17_web_container_tomcat",
                    "target runtime" : Apache Tomcat 8.5,
                    "content directory" : "WebContent (JSP and other configs will be in this 'WebContent' folder)"}
        jsp-in-webcontainer:
            path: "17_web_container_tomcat > WebContainer"
            step: "right click to WebContainer > new a jsp file"
            page-info-if-success: 
                site: "http://localhost:8080/17_web_container_tomcat/index.jsp"


*/