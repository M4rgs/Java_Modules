

import java.util.UUID;

public class Transaction{
    private final UUID ID;
    private User sender;
    private User recipient;
    private int transferAmount;

    Transaction(){
        this.ID = UUID.randomUUID();
    }

    public UUID getUID(){
        return this.ID;
    }

    public void setSender(User sender){
        this.sender = sender;
    }

    public User getSender(){
        return this.sender;
    }

    public void setRecipient(User rec){
        this.recipient = rec;
    }

    public User getRecipient(){
        return this.recipient;
    }

    public int getTransferAmount(){
        return this.transferAmount;
    }

    public void setTransferAmount(int transferAmount){
        if (transferAmount >=0){
            if (sender.getBalance() < transferAmount){
                System.err.print("\nError: No balance enough !\n");
                System.exit(-1);
            }
            
            sender.setTransferType("OUTCOME");
            recipient.setTransferType("INCOME");


            sender.setBalance(sender.getBalance() - transferAmount);
            recipient.setBalance(recipient.getBalance() + transferAmount);

            this.transferAmount = transferAmount;
        }
    }

    public void printConsole() {
        System.out.print("\nID: " + getUID() +
                "\nSender: " + getSender().getName() + " " + -1 * getTransferAmount() + " " + getSender().getTransferType() +
                "\nRecipient: " + getRecipient().getName() + " " + getTransferAmount() + " " + getRecipient().getTransferType() +
                "\n\n||SENDER||\n" + "ID: " + sender.getID() + "\nName: " + sender.getName() + "\nBalance: " + sender.getBalance() +
                "\n\n||RECIPIENT||\n" + "ID: " + recipient.getID() + "\nName: " + recipient.getName() + "\nBalance: " + recipient.getBalance() + "\n");
    }

}