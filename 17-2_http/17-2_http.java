/**

---------------------------------------------------
-------------------------
HTTP 傳遞資料的方法
-------------------------

---
HTTP:
    methods:
        front-end-to-back-end:
            GET:
                intro:
                    query-string: "?"
                    key-value-pare: "key_1=value_1&key_2=value_2"
                    example: "http://sample.com/register?id=johnson&password=1234"
                pros:
                    speed: "faster than POST"
                cons:
                    security: "plain-code(明碼), unsafe with your password"
            POST:
                intro:
                    example: '''
                             http://sample.com/

                             Register your FB
                             <form action="/register" method="POST">
                             ...
                             </form>
                             '''



---------------------------------------------------


GET, POST, session_id in cookie
---------------------------------------------------
-------------------------
資料傳遞
-------------------------
1. request
       「通常request,response都是一次性的」
       i.e.,當主機回傳給client網頁之後，主機就不記得這個 client 曾經來訪過，
       但偏偏有時候就需要主機知道他自己跟 client 的互動過程，像是購物車紀錄
2. cookie
       由 server 建立出的檔案，儲存在 client 端．
       cookie 存的是 server他需要的資料（如session_id）

       不同網域的主機，不能控制、寫入、讀取對方的cookie， ex. yahoo不能去讀取google的cookie
3. session (透過 cookie 實作出來)
       server 會紀錄 session_id, 並將他存在 cookie 
       解決「通常request,response都是一次性的」問題： server 自己這邊紀錄session_id, 對熟客就查他session_id底下紀錄的內容；對首次來的 client 就新增 session_id

---------------------------------------------------

*/