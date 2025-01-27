abstract class Payments_paymentProcessor {

    abstract void processPayments(double amount) throws InterruptedException;

    public void paymentStatus() throws InterruptedException {
        System.out.println("Processing the payment securely...");
        Thread.sleep(2000);
        System.out.println("The Payment is successful!");
    }
}