public class User extends Person{
    @Override
    public void callName(String name) {
        this.name=name;

    }
    public void callEmail(String email){
        this.email=email;
    }

    @Override
    public void callId(int id) {
        this.id=id;
    }

    @Override
    public void callPhone(int phone) {
        this.phone=phone;
    }
    public String role;
    public void callRole( String role){
        this.role=role;
        System.out.print("Guest's role is:" +role );
    }
    
}