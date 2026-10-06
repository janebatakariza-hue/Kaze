abstract class Person{
    public String name;
    public String email;
    public int phone;
    public int id;
    abstract public void callName( String name);
    abstract public void callEmail(String email);
    abstract public void callPhone(int phone);
    abstract public void callId(int id);

}