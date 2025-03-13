package java_object_oriented_programming.challenges.banking_application;

/*
 ? Encaplsulate a Bank Account
 ? Add the following funtionality
 ?      Withdraw method
 ?      Deposit method
 */
public class BankAccount
{
    private String ownerName;
    private double ownerBalance;

    //*Default Contructor
    public BankAccount(){

    }

    //*Contructor
    public BankAccount(String ownerName, double ownerBalance) {
        this.ownerName = ownerName;
        this.ownerBalance = ownerBalance;
    }

    public String getOwnerName() {
        return ownerName;
    }
    public double getOwnerBalance() {
        return ownerBalance;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public void setOwnerBalance(double ownerBalance) {
        this.ownerBalance = ownerBalance;
    }

    public void withDrawMoney(int moneyToWithdraw)
    {
        this.ownerBalance -= moneyToWithdraw;
    }
    public void depositMoney(int moneyToDeposit)
    {
        this.ownerBalance += moneyToDeposit;
    }

}
