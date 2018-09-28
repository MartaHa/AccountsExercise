public interface BaseInterestRate {

    //the interface provides the banking rate

    default double getRate(){
        return 2.5;
    }
}
