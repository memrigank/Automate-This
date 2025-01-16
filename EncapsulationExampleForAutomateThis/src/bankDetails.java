public class bankDetails {

    private String accountNumber;

    public bankDetails(String accountNumber){
        setAccountNumber(accountNumber);
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber=accountNumber;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public String getMaskedAccountNumber(){
        return "*****" + accountNumber.substring(accountNumber.length()-4);
    }
}
