/**
--------------------------------------------------------------

access modifiers 總結適用範圍：
4. public 都可以使⽤
2. default：同 package (只要不寫 access modifiers 他就預設成 default)
3. protected：同 package，或有繼承(extends)自帶有protected的
1. private：同 class

// public    : anyone
// default   : in the same package
// protected : in the same package & in another package, extends something with protected
// private   : in the same class


--------------------------------------------------------------

access modifiers 存取權限控制

1. private：同一個class
（不管是方法或屬性）只能用在同一個class


2. default：同一個class和package
只要不寫 access modifiers 就預設是 default．


3. protected：同一個class和package，不同套件子類別
「不同套件子類別」-->如果其他 package 裡面的某一個 class 繼承(extends)了帶有 protected 的這個 class，
那個某 class 就能使用 protected 裡面的東西！ 
protected 能做的就是比 default 多這一件事情


4. public 都可以使⽤
不管是不同 package，或不同 class，都可以使用．


*/