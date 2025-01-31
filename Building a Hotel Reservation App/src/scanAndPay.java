public class scanAndPay extends PaymentProcessor{
    @Override
    public void paymentProcessor(double amount) {
        System.out.println("Processing..." + amount+ " Paid!, using scan and pay");
        System.out.println("Booking Done");
    }

}
