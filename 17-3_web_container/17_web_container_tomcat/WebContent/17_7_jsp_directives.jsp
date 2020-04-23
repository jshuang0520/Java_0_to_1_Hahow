<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 

---
JSP Directives 指示元素:
    目的：指示 web container 將 JSP 轉成 Servlet 的時候需要遵守的事項
    語法： \<\%@ 指示類型 屬性="值" %>
        解析：
            step1: \<\% %> 代表可寫 Java code
            step2: @     緊接在@之後的人代表你是指示元素
            step3: 
                指示類型:
                    (1)page: "import package"
                    (2)include: "include other jsp, use them directly"
                    (3)taglib:
 -->

<!-- page: "import package" -->
<%@ page import="java.util.Date" %>
<% out.println("current time: " + new Date()); %>

<!-- include: "include other jsp, use them directly" -->
<%@ include file="ImplicitObjectDemo.jsp" %>

</body>
</html>