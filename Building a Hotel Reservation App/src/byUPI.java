public class byUPI extends PaymentProcessor{
    @Override
    public void paymentProcessor(double amount) {
        System.out.println("Processing..." + amount+ " Paid!, Using UPI");
        System.out.println("Booking Done");
    }

}
