package Library;

import java.util.Scanner;
import javax.xml.crypto.Data;

public class Main {

    
    static Scanner s;
    static Database database;

    public static void main(String[] args) {

         database= new Database();
        System.out.println("Welcome to library management system!\n" + "1.Login\n2. new user");
        s = new Scanner(System.in);
        int n = s.nextInt();

        
        switch (n) {
            case 1:
                login();
            case 2:
                newuser();
            default:
                System.out.println("Error");
        }
    }

    private static void login() {
        System.out.println("Enter phone number");
        String phonenumber = s.next();
        System.out.println("Enter email");
        String email = s.next();
        if (database.login(phonenumber, email) != -1) {
            User user = database.getUser(database.login(phonenumber, email));
            System.out.println("Welcome " + user.getName());
        } else {
            System.out.println("User not found");
            
        }
    }

    private static void newuser() {
        System.out.println("Enter name:");
        String name = s.next();
        System.out.println("Enter phone number");
        String phonenumber = s.next();
        System.out.println("Enter email");
        String email = s.next();
        int n2 = s.nextInt();
        if (n2 == 1) {
            User admin = new Admn(name, email, phonenumber);
        } else {
            User user = new User(name, email, phonenumber);
        }
    }

}
