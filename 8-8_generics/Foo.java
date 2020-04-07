// public class Foo<T extends List>{ // using wildcard <? extends ...>
public class Foo<T>{
    private T foo;

    // Method - getter
    public T getFoo(){
        return foo;
    }
    // Method - setter
    public void setFoo(T foo){
        this.foo = foo;
    }
}