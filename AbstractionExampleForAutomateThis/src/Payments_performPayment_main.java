public class Payments_performPayment_main {

    public static void main(String[] args) throws InterruptedException {
        Payments_paymentService service;
        service = new Payments_paymentService(new Payments_creditCardPayment());
        service.makePayments(100.5);
        service = new Payments_paymentService(new Payments_upiPayments());
        service.makePayments(200.4);
    }

}