public class basePayments {

    private long debitCard;
    private long creditCard;
    private long mobileNumber;
    private int CVV;


    public basePayments (long debitCard, long creditCard, long mobileNumber, int CVV){
        this.debitCard=debitCard;
        this.creditCard=creditCard;
        this.mobileNumber=mobileNumber;
        this.CVV=CVV;
    }

    public basePayments(long debitCard, long mobileNumber){
        this.debitCard=debitCard;
        this.mobileNumber=mobileNumber;
    }

    public basePayments (long creditCard, int cvv){
        this.creditCard=creditCard;
        this.CVV=cvv;
    }

    public void billPayment(){
        System.out.println("bill Payment done using Wallet Balance");
    }

    public void addCardsToFlipkart(){
        System.out.println("Debit Card has been added " + debitCard + " Registered Mobile Number is "+ mobileNumber);
        System.out.println("Credit Card has been added " + creditCard );
    }

    public long getDebitCard() {
        return debitCard;
    }

    public long getCreditCard() {
        return creditCard;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public String processPayment(String cardNumber) {
        return "Processing payment for card: " + cardNumber;
    }



}
