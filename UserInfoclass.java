
/**
 * Write a description of class UserInfoclass here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class UserInfoclass
{
    public static void main(String [] args)
    {
        //below is just some code I typed to help become more familiar with using Scaner
        UserInfo jesse = new UserInfo();
        Scanner pogba = new Scanner(System.in);
        System.out.println("Please enter your staff id: ");
        jesse.set_staff_id(pogba.nextInt());
        System.out.println("Please enter your first name: ");
        jesse.setName(pogba.next());
        System.out.println("Please enter your date of birth in the following format(MM/DD/YYYY): ");
        jesse.set_date_of_birth(pogba.next());
        
        System.out.println("This is your full name: "+jesse.getName() + '\n'+ "This is your date of birth: "+jesse.get_date_of_birth() + '\n'+ "This is your staff id: "+jesse.get_staff_id());
        
        UserInfo frank = new UserInfo();
        System.out.println(frank.getName());
        frank.setName("Gareth Barry");
        System.out.println(frank.getName());
        System.out.println(frank.get_staff_id());
        frank.set_staff_id(170819);
        System.out.println(frank.get_staff_id());
        System.out.println(frank.get_date_of_birth());
        frank.set_date_of_birth("8/15/1998");
        System.out.println(frank.get_date_of_birth());
        
    }
}
