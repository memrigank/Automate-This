public class payByNumber extends PaymentProcessor{
    @Override
    public void paymentProcessor(double amount) {
        System.out.println("Processing..." + amount+ " Paid!, using Number!");
        System.out.println("Booking Done");
    }

}
