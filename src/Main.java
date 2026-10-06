
import java.util.Scanner;
public class Main{
        public static void main(String []args){
            Person p= new User();
            User u= new User();
            Person g= new Guest();
            Guest l=new Guest();

            Scanner input= new Scanner(System.in);
            System.out.println("Enter your name:");
            String name= input.nextLine();
            p.callName(name);

            System.out.println("Enter your number:");
            Integer nbr= input.nextInt();
            p.callPhone(nbr);

            input.nextLine();

            System.out.println("Enter your email:");
            String email= input.nextLine();
            p.callEmail(email);

            input.nextLine();

            System.out.println("Enter your id:");
            Integer id= input.nextInt();
            p.callId(id);

            input.nextLine();

           System.out.println("Enter guest email:");
           String Gmail= input.nextLine();
           g.callEmail(Gmail);

            System.out.println("Enter guest name:");
            String Gname= input.nextLine();
            g.callName(Gname);

            System.out.println("Enter guest phone:");
            Integer Gphone= input.nextInt();
            g.callId(Gphone);

            System.out.println("Enter guest id:");
            Integer Gid= input.nextInt();
            g.callEmail(String.valueOf(Gid));

//
//            System.out.println("Your name is:" +g.Gname);
//            System.out.println("Guest's phone number is:" +g.Gphone);
//            System.out.println("Guest's id is:" +g.Gid);

            l.callRole("Guest");
            u.callRole("User");
        }
;



            }