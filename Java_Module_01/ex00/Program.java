
public class Program{
    public static void main(String[] args){
        User sender = new User();
        sender.setName("Taha");
        sender.setID(0);
        sender.setBalance(200);
        sender.printConsole();

        User rec = new User();
        rec.setID(1);
        rec.setName("ghita");
        rec.setBalance(100);
        rec.printConsole();


        Transaction tr = new Transaction();

        tr.setSender(sender);
        tr.setRecipient(rec);
        tr.setTransferAmount(5020);
        tr.printConsole();

    }
}