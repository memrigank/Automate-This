public class creditCardPayment extends paymentProcessor {

    @Override
    void processPayments(double amount) throws InterruptedException { // "throws Exception" had to add due to Thread.sleep
        System.out.println("The transaction of amount "+amount+" is done using your credit Card");
    }
}