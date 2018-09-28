import java.util.Random;

public class Checking extends Account {


    //properties for the Checking Account

    int DebitCardNumber;
    int DebitCardPin;


    //constructor
    public Checking(String owner, String ssNumbers, int initialDeposit) {
        super(owner, ssNumbers, initialDeposit);
        AccountNumber = "1" + AccountNumber;
        setDepositCard();

    }

    //methods for the Checking Account


    private void setDepositCard() {

        Random random = new Random();

        DebitCardNumber = (int) (Math.random() * Math.pow(10, 9));
        DebitCardPin = (int) (Math.random() * Math.pow(10, 3));
    }

    public void showInfo() {
        System.out.println("Checking Account has been created");
        super.showInfo();
        System.out.println("The Debit Card Number is: " + DebitCardNumber
                + "\n The Debit Card PIN is: " + DebitCardPin);
    }


}
