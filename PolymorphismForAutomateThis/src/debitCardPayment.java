public class debitCardPayment extends basePayments{

    public debitCardPayment(long debitCard, long mobileNumber){
        super(debitCard, mobileNumber);
    }

    @Override
    public void billPayment(){
        System.out.println("bill Payment done using Debit Card");
    }

    @Override
    public void addCardsToFlipkart(){
        System.out.println("Debit Card has been added with number: " + getDebitCard() + " Registered Mobile Number is "+ getMobileNumber());
    }
}
