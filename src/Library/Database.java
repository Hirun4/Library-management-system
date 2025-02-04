package Library;

import java.util.ArrayList;


public class Database {

    ArrayList<User> users= new ArrayList<User>();
    ArrayList<String> usernames= new ArrayList<String>();
    public void AddUser(User s){
        users.add(s);
        usernames.add(s.getName());
    }

    public boolean login(String phonenumber,String email) {
        boolean n =  false;
        for(User s : users){
            if (s.getPhoneNumber().matches(phonenumber) && s.getEmail().matches(email)) {
                n= true;
                break;
                
            }
        }
        
        return n;
    }
}
