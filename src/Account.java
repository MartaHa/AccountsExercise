import java.util.Random;

public abstract class Account implements BaseInterestRate {

    //properties the same for both accounts

    String Owner;
    String SSNumbers;
    double Balance;
    static int uniqueNumber = 1000;
    String AccountNumber;
    double rate;

    public Account(String owner, String sSNumbers, int initialDeposit) {
        Owner = owner;
        SSNumbers = sSNumbers;
        Balance = initialDeposit;
        this.AccountNumber = setAccountNumber();

        //setting the Account number
        System.out.println("Account created. The owner is : " + Owner + " The SS Numbers : " + sSNumbers + " The balance: " + Balance);
        uniqueNumber++;
        setAccountNumber();


    }

//methods for both Accounts

    public abstract void setRate();

    private String setAccountNumber() {

        //last SSNumbers
        String lastSSDigits = SSNumbers.substring(SSNumbers.length() - 2, SSNumbers.length());
        Random random = new Random();

        //unique number
        int accountUniqueNumber = uniqueNumber;

        //random number
        int randomNumber = random.nextInt(1099) - 100;
        return lastSSDigits + accountUniqueNumber + randomNumber;
    }


    private void calculateRate(double rate){
        double moneyFromRate = Balance * rate;
        Balance = Balance + moneyFromRate;
    }


    private void transferMoney(double amount, String toWho){
        Balance = Balance - amount;

    }

    private void withdrawMoney(double amount){
        Balance = Balance - amount;
    }

    
    public void showInfo() {
        System.out.println("Account owner: " + Owner
                + "\n SSnumber: " + SSNumbers
                + "\n Account Number is: " + AccountNumber
                + "\n Balance: " + Balance);
    }
}
