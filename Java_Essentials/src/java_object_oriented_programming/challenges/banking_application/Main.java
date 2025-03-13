package java_object_oriented_programming.challenges.banking_application;

/*
 ? Main for BankAccount
 ? Create a BankAccount Instace
 ? Withdraw a certain amount using the withdraw method
 ? Print out the resulting balance
 ? Note: The Bank Account attributes should not be directly accessible
 */
public class Main
{
    public static void main(String[] args) {
        BankAccount newAccounOwner = new BankAccount("Carlos Pablo", 35000);

        System.out.println(
                "Banco owner: " +newAccounOwner.getOwnerName() +
                " has: "+ newAccounOwner.getOwnerBalance()+
                " on his account"
        );

        newAccounOwner.withDrawMoney(2500);


        System.out.println(
                "Banco owner: " +newAccounOwner.getOwnerName() +
                        " has: "+ newAccounOwner.getOwnerBalance()+
                        " on his account"
        );
    }
}
