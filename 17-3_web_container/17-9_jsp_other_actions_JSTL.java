/** 

---------------------------------------------------
-------------------------
JSTL 標籤庫(other jsp actions)：希望減少Java程式出現在JSP的頻率
https://www.tutorialspoint.com/jsp/jsp_standard_tag_library.htm
-------------------------
1. 核心標籤庫
        if, foreach, ...
2. 格式標籤庫
        數字, 日期格式化, ...
3. SQL標籤庫
4. XML標籤庫
5. 函式標籤庫


6. 使用方式 - taglib:
       (1)JSTL標籤庫與JSP標籤庫不同，JSTL並不是J2EE原有的標準標籤，所以需要手動匯進來(maven)
            - 步驟：
              (a) right click to your project folder > Configure > Convert to Maven Project
              (b) Find "pom.xml",
                  add the fllowing: (add it right after the close tag </build>)
                  <dependencies>
                    <depnedency>
                      <groupId>javax.servlet</groupId>
                      <artifactId>jstl</artifactId>
                      <version>1.2</version>
                    <depnedency/>
                  <dependencies/>
                (c) Find your .jsp file,
                    add the following: (add it before where HTML starts, i.e., before <!DOCTYPE html ...>)

---------------------------------------------------



---------------------------------------------------
-------------------------
Expression Language(EL)
-------------------------
1. 比JSP標準標籤還要更快速使用  <---------> JSP actions 對照組
2. 取得參數的值 ${param.name}             jsp:useBean + jsp:getProperty
3. ${requestScope.name}
4. ${sessionScope.name}

---------------------------------------------------



17_8.jsp 示範內容：
1. 用 EL 取得參數 
2. 用 JSTL(取代Java code)的if來做條件判斷

我要用到的if屬於core功能，從<c:if>略知一二，
所以在開始HTML之前我要貼上這段 taglib：
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

然後在<form>...</form>之後
<c.if test="${param.pw} == '1234'">
    <h1> 恭喜你成功登入囉！</h1>
</c:if>

(記得要在Webcontent > WEB-INF > lib > 匯入 JSTL 的jar檔)


*/