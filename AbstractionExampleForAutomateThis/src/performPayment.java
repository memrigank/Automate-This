public class performPayment{

    public static void main(String[] args) throws InterruptedException {
        paymentService service;
        service = new paymentService(new creditCardPayment());
        service.makePayments(100.5);
        service = new paymentService(new upiPayments());
        service.makePayments(200.4);
    }

}