import java.util.Random;

public class Savings extends Account {


    //properties for the savings Account
    int SafetyDepositBoxNumber;
    int SafetyDepositBoxCode;

    //constructor

    public Savings(String owner, String ssNumbers, int initialDeposit) {

        super(owner, ssNumbers, initialDeposit);
        AccountNumber = "2" + AccountNumber;
        setDepositBox();

    }

    //method for the Savings Account

    @Override
    public void setRate() {
        rate = getRate() - 0.25;
    }


    private void setDepositBox() {
        Random random = new Random();

        //setting the number
        SafetyDepositBoxNumber = (random.nextInt(1099) - 100);


        //setting the code
        SafetyDepositBoxCode = random.nextInt(10099) - 100;

    }


    public void showInfo() {
        System.out.println("Savings Account has been created");
        super.showInfo();
        System.out.println("The Safety Deposit Box number is: " + SafetyDepositBoxNumber
                + "\n The Safety Deposit Box Code is: " + SafetyDepositBoxCode);
    }

    ;

}
