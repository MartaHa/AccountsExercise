public class Checking extends Account {


    //properties for the Checking Account

    //constructor
    public Checking(String owner, String ssNumbers, int initialDeposit) {
        super(owner,ssNumbers, initialDeposit);
        System.out.println("Checking account created. The owner is: " + owner);
        AccountNumber = "1" +AccountNumber;
        System.out.println("Account number is " + AccountNumber);
    }

    //methods for the Checking Account
}
