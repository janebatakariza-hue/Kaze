
abstract class Person<T>{
    public T name;
    public T email;
    public T phone;
    public int T;

    abstract public void callName( T name);
    abstract public void callEmail(String email);
    abstract public void callPhone(int phone);
    abstract public void callId(int id);

}