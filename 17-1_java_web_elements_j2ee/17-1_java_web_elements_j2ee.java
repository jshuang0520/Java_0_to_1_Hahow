/**


---------------------------------------------------
-------------------------
Java Web Elements
-------------------------
client  - server
request - response

firewall

internet

---------------------------------------------------


---------------------------------------------------
-------------------------
J2EE - Java 2 Enterprise Edition
-------------------------

---
J2EE:
    important-elements:
        Web:
            important-tools:
                JSP: To let one be able to write Java code in HTML
                Servlet: You can see servlet as a class in Java
        EJB(Enterprise Java Bean): 商業邏輯、流程，分散式交易管理機制
                                   ex. 當有多台server，物件和物件之間在不同server之間做溝通時，透過 EJB 的工具來實作

---------------------------------------------------


---------------------------------------------------
-------------------------
Web Container
-------------------------
1. Web Container 即 能運作由Java撰寫的web應用程式 的一個平台
   可以想成是一個 Apache，一個 web server，

   可是 Apache 和 一般的web server 不能運作 Java 的應用程式（只能單純去跑 HTML）．
   如果要運作 Java 的應用程式，要用 Tomcat, JBoss, Weblogic 等 Web Container

2. Java應用程式會依路徑規則包成一個 .war檔 （壓縮檔）

---------------------------------------------------


---------------------------------------------------
-------------------------
Web 程式架構 - MVC
-------------------------

---
MVC(Model-View-Controller):
    Controller: 對 request 做處理與轉發
    View:       前端, 介面呈現方式
    Model:      後端, 商業邏輯與資料庫連接
    


          request      (對 request 做處理與轉發)
user ----------------> Controller(Servlet)
 ^                         |           |
 |                         |           |
 |                         |           |
 |                         |           |
 |                         v           v
 |----------------------- View        Model  
          response        (JSP)      (JavaBean)
                    (前端：介面呈現方式)  | (後端：商業邏輯與資料庫連接)
                                       |
                                       |
                                       |
                                       v
                                     Database

---------------------------------------------------


---------------------------------------------------
-------------------------
Servlet (Controller)
-------------------------
1. 處理 request:
       req.getParameter(): 取得從前端頁面回傳的參數
       req.setAttribute(): 塞入屬性
2. 轉發 JSP:
       req.getRequestDispatcher("xxx.sp").forward(req, resp);


import javax.servlet.http.HttpServlet;
                                // interface HttpServlet
public class HelloWorld extends HttpServlet{

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        String name = req.getParameter("name");
        req.setAttribute("age", 21);

        // 轉發到 JSP
        req.getRequestDispatcher("hello.sp").forward(req, resp);
    }
}

---------------------------------------------------


---------------------------------------------------
-------------------------
JSP (View)
-------------------------
1. 整合 HTML + Java

2. JSP 在執行的時候是一個 Servlet

<html>
  <body>
    <h1>Hello, ${name}</h1>     <! –– This is Java ––>
  </body>
</html>

---------------------------------------------------



WordPress - 受歡迎的假站軟體，佈景主題和外掛


*/