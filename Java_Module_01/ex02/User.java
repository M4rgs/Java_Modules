
public class User{
    private int ID = -1;
    private String name;
    private int balance; 

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Integer getId(){
        return this.ID;
    }

    public void setId(int id){
        this.ID = id;
    }

    public void printConcole(){
        System.out.format("\nID: %d\nName: %s\nBalance: %d\n", ID, name, balance);
    }
}
