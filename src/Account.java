import java.util.Random;

public abstract class Account implements BaseInterestRate {

    //properties the same for both accounts

    String Owner;
    String SSNumbers;
    int Balance;
    static int uniqueNumber = 1000;
    String AccountNumber;

    public Account(String owner, String sSNumbers, int initialDeposit) {
        Owner = owner;
        SSNumbers = sSNumbers;
        Balance = initialDeposit;
        this.AccountNumber = setAccountNumber();

        //setting the Account number
        System.out.println("Account created. The owner is : " + Owner + " The SS Numbers : " + sSNumbers + " The balance: " + Balance );
        uniqueNumber++;
        setAccountNumber();


    }

//methods for both Accounts

    private String setAccountNumber() {

        //last SSNumbers
        String lastSSDigits = SSNumbers.substring(SSNumbers.length() - 2, SSNumbers.length());
        Random random = new Random();

        //unique number
        int accountUniqueNumber = uniqueNumber;

        //random number
        int randomNumber =  random.nextInt(1099)-100;
        return lastSSDigits + accountUniqueNumber + randomNumber;
    }
}
