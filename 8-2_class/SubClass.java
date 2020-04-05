public class SubClass extends SuperClass{ // 特別重要！！！！！ 當我們在 new 一個子類別的時候，他的父類別同時也會被 new 出來！！！！！
    public String nickName;

    public SubClass(){
        this.nickName = "Here's SubClass, print little " + super.name;
    }
}