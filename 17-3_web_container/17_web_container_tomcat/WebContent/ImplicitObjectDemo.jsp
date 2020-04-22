<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 

String myInput = request.getParameter("number");
int i = 1;
if (myInput != null){
	i = Integer.valueOf(myInput);
	i++;
}
%>
<%
String myHeight = request.getParameter("height");
String myWeight = request.getParameter("weight");
double height = 1.0;
double weight = 1.0;
if (myHeight != null){
	height = Double.valueOf(myHeight) / 100;
	weight = Double.valueOf(myWeight);
}

%>
<!-- form & POST method -->
<form action="ImplicitObjectDemo.jsp" method="post">
    <input type="text" name="number" value="<% out.print(i); // casting %>"/>
    <input type="submit" value="SubmitButton_PressMe"/>

    <input type="text" name="height" value="172"/>
    <input type="text" name="weight" value="65"/>
    <input type="submit" value="Calculate"/>
</form>
<h2> Squared </h2>
<% out.print((int) Math.pow(i, 2.0)); // casting %>
<h2> BMI </h2>
<% out.print(weight / Math.pow(height, 2.0)); // casting %>


</body>
</html>