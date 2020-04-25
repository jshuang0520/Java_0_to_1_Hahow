/**

---
JSP-Actions(JSP 標準標籤)
    purpose: "to avoid writing java code in jsp, or you'll see java and html, it gets harder to maintain"
    jsp-actions:
        implement-in-this-section:
            1: "jsp:useBean"
            2: "jsp:setProperty"
            3: "jsp.getProperty"
        others:
            4: "jsp:forward"
            5: "jsp:include"
            6: "jsp:plugin"
            7: "jsp.element"
            8: "jsp:attribute"
            9: "jsp:body"
            10: "jsp:text"




---------------------------------------------------
-------------------------
jsp:useBean
use it with jsp:setProperty and jsp.getProperty, to get & show params
-------------------------
1. id    --> mapping: <id of jsp:useBean> to <name of jsp:setProperty & jsp.getProperty> (to retrieve & set values)
2. class --> want to reference this: "package.class"
3. scope --> we use 'request' here as an example

<jsp:useBean 
id="user"
class="codegym.User"
scope="request"/>



--
Let's check an onject "User" first:
package codegym;
public class User implements Serializable{
    private String name;
    private String pw;
    ...
}

// Note. Serializable 序列化： 將物件變成資料流，可以儲存為文件，或是經由網路傳輸

---------------------------------------------------


---------------------------------------------------
-------------------------
jsp:setProperty
-------------------------
1. name     --> mapping: <name of jsp:setProperty & jsp.getProperty> to <id of jsp:useBean> (to retrieve & set values)
2. property --> 這是物件的屬性！         attr of an object
3. param    --> 這是request中的參數名稱！ name of your parameter in request

<jsp:setProperty 
name="user"
property="name"
param="name"/>

---------------------------------------------------


---------------------------------------------------
-------------------------
jsp:getProperty
-------------------------
1. name     --> mapping: <name of jsp:setProperty & jsp.getProperty> to <id of jsp:useBean> (to retrieve & set values)
2. property --> 這是物件的屬性！         attr of an object


<jsp:getProperty 
name="user"
property="name"/>

---------------------------------------------------


*/