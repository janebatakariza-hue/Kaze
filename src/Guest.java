public class Guest extends Person{
    @Override
    public void callName(String name) {
        this.name=name;

    };
    @Override
    public void callEmail(String email) {
this.email=email;
    }

    @Override
    public void callPhone(int phone) {
this.phone=phone;
    }

    @Override
    public void callId(int id) {
this.id=id;
    }
    public String role;
    public void callRole( String role){
        this.role=role;
        System.out.println("Guest's role is:" +role );
    }

}