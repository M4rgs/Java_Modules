
public class User{
    private Integer id;
    private String name;
    private Integer balance;
    private String getTransferType;

    public void setID(Integer id){
        this.id = id;
    }

    public Integer getID(){
        return this.id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setBalance(Integer balance){
        this.balance = balance;
    }

    public Integer getBalance(){
        return this.balance;
    }

    public void setTransferType(String type){
        this.getTransferType = type;

    }

    public String getTransferType(){
        return this.getTransferType;
    }

    public void printConsole(){
        System.out.format("\nID: %d\nNmae: %s\nBalance: %d", this.id, this.name, this.balance);
    }

}