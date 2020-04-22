// If you want to write Java code in JSP, use this <% ...write some java code here... %>

<%

/*

When the file is updated,
if you use jsp, just save and refresh it.
if you use Servlet, you need to restart the server (tomcat)

「當 client 端在呼叫 jsp 的時候，背後會跑一個 servlet」（因為這個 class extends HttpServlet）
以 tomcat > webapps > examples > WEB-INF > classes > HelloWorldExample.java 來看，
(/Users/johnson.huang/Java_0_to_1_Hahow/17-3_web_container/apache-tomcat-8.5.54/webapps/examples/WEB-INF/classes)
這個 class extends HttpServlet，代表現在這個 class 是一個「客製化」的 Servlet．
底下有個 PrintWriter，他把 out 轉型了，所以用到的 out，都變成在用 PrintWriter 這個物件
而 PrintWriter 在做的事情是，「把運算過後的 HTML 用 println 印出 html 的程式碼再傳回來給 client 端」，所以他是一個「動態」的網站

比較：
靜態網站： server 直接把內容丟給 client
  缺點： 不能執行運算、不能去撈資料庫的資料來即時呈現

動態網站：
  執行原理：「當 client 端在呼叫 jsp 的時候，背後會跑一個 servlet」（因為這個 class extends HttpServlet，所以他是一個「客製化」的 Servlet）  
  而其中 PrintWriter 這個物件在做的事情是，「把運算過後的 HTML 用 println 印出 html 的程式碼再傳回來給 client 端」，所以他是一個「動態」的網站

*/


// implicit element: out
String name = "JS`";
out.println("Hello " + name);

out.println("You can write Java code in JSP as long as using notation <% and its closing tag!\n");
%>