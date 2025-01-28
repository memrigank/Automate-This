package abstractionWithConstructorExample;

public class abstract_doPayments {

    public static void main(String[] args) {

        abstractPaymentsBaseClass payments;
        payments = new abstract_upiPayments();
        abstract_PaymentService paymentService = new abstract_PaymentService(payments);
        paymentService.makePayments(405.50, "Bhanu");
        paymentService.statusCheck();
        payments = new abstract_debitCardPayments();
        paymentService = new abstract_PaymentService(payments);
        paymentService.makePayments(5004.80, "Bhanu");
        paymentService.statusCheck();

    }
}
