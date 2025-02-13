package Library;

import java.util.Scanner;

public class Main {

    
    static Scanner s;
    static Database database;

    public static void main(String[] args) {

         database= new Database();
        
         int num;
         do {
            System.out.println("Welcome to library management system!\n" + "0. Exit\n" + "1.Login\n2. new user");
        s = new Scanner(System.in);
        num  = s.nextInt();

        
        switch (num) {
            case 1:
                login();
            case 2:
                newuser();
            default:
                System.out.println("Error");
        }
         }while(num!=0);

    }

    private static void login() {
        System.out.println("Enter phone number");
        String phonenumber = s.next();
        System.out.println("Enter email");
        String email = s.next();
        int n= database.login(phonenumber, email);
        if (n != -1) {
            User user = database.getUser(n);
            
        } else {
            return;
            
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
            User admin = new Admin(name, email, phonenumber);
            database.AddUser(admin);
        } else {
            User user = new User(name, email, phonenumber);
            database.AddUser(user); 
        }
    }

}
