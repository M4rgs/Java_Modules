
public class Program{
    public static void main(String[] args){
        UsersArryList aa = new UsersArryList();

        aa.addUser("taha");
        aa.addUser("salah");
        aa.addUser("marwan");
        
        try{
            aa.retrieveUserByIndex(2);
            aa.retrieveUserById(1);
            aa.retrieveUserById(10);
        }
        catch (UserNotFoundException e){
                System.err.print(e.getMessage());
        }


        aa.prinUsers();
    }
}