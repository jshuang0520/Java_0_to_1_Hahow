<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!-- jsp actions JSP-Actions(JSP 標準標籤) 
purpose: "to avoid writing java code in jsp, or you'll see java and html, it gets harder to maintain"
-->

<!-- 
path of this User.java file to save:
17_web_container_tomcat > Java Resources > folder:codegym > here! (Java Resources這個資料夾是隱藏檔案的樣子，從eclipse外面找不到) 
 -->
<jsp:useBean id="user" class="codegym.User" scope="request" />
<!-- 2. property: 這是物件的屬性！         attr of an object -->
<!-- 3. param   : 這是request中的參數名稱！ name of your parameter in request -->
<jsp:setProperty name="user" property="name" param="name" />
<jsp:setProperty name="user" property="pw"   param="pw" />



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- form & POST method -->
<form action="17_8_jsp_actions.jsp" method="post">
    <!-- use <p> to jump to next line, just for formatting -->
    <input    type="text"     name="your_name" value=""/>
    <p><input type="password" name="your_pw"   value=""/> <!-- type="password" to hide your pw on website -->

    <p><input type="submit"                    value="Login"/>
</form>

<!-- jsp actions JSP-Actions(JSP 標準標籤) 
purpose: "to avoid writing java code in jsp, or you'll see java and html, it gets harder to maintain"
-->
<jsp:getProperty name="user" property="name"/>
<jsp:getProperty name="user" property="pw"/>


</body>
</html>