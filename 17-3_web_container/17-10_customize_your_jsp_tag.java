/**


在Webcontent > WEB-INF > lib > 新增 一個叫做 "tag" 的資料夾，
對他按右鍵 > New > Other > 找 Web - JSP Tag，這邊把這個jsp tag檔名取成 message，選擇 New Tag File >
新增的檔案第一行會有 <%@ tag language="java" pageEncoding="UTF-8"%>

對於客製化的標籤:
  step1: 定義傳進來的參數 attribute
         <%@ attribute name="message" type="java.lang.String" required="true" description="message" %>
  step2: 下面再做一些事情
         <h1>Hello ${message}</h1>
         註解：因為剛剛定義說 attribute name="message"，參數就是message囉，那著個參數的type是String



如果要在JSP裡面使用自定義的tag的話，跟在使用JSTL有點相似：
要在JSP裡面加入taglib：
JSTL 的 taglib： <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
自定義的 taglib： <%@ taglib prefix="codegym" tagdir="/WEB-INF/tags" %>

<codegym:message message="Ryan"></codegym:message>





*/