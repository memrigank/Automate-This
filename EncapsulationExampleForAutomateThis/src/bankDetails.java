public class bankDetails {

    private long accountNumber;

    public bankDetails(long accountNumber){
        setAccountNumber(accountNumber);
    }

    public void setAccountNumber(long accountNumber){
        this.accountNumber=accountNumber;
    }

    public long getAccountNumber(){
        return accountNumber;
    }

    public long getMaskedAccountNumber(){
        long maskedAccountNumber;
        maskedAccountNumber=getAccountNumber();
        maskedAccountNumber = maskedAccountNumber
        return maskedAccountNumber;
    }
}
