public class Savings extends Account {


    //properties for the savings Account


    //constructor

    public Savings(String owner, String ssNumbers, int initialDeposit) {
        super(owner, ssNumbers, initialDeposit);
        System.out.println("Savings account created. The owner is: " + owner);
        AccountNumber = "2" +AccountNumber;
        System.out.println("Account number is " + AccountNumber);
    }



    //method for the Savings Account
}
