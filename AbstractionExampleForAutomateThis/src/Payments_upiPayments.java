public class Payments_upiPayments extends Payments_paymentProcessor {

    @Override
    void processPayments(double amount) throws InterruptedException { // "throws Exception" had to add due to Thread.sleep
        paymentStatus();
        System.out.println("The transaction of amount "+amount+ " is done using UPI Payments!");
    }
}