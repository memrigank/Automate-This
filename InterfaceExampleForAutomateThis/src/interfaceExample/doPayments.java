package interfaceExample;

public class doPayments {

    public static void main(String[] args) {

        debitCardPayments debitCardPayments = new debitCardPayments();
        upiPayments upiPayments = new upiPayments();
        payPalPayments payPalPayments = new payPalPayments();

        debitCardPayments.processPayment(1023.80);
        debitCardPayments.checkStatus();
        upiPayments.processPayment(1800.30);
        upiPayments.checkStatus();
        payPalPayments.processPayment(183.25);
        payPalPayments.checkStatus();


    }
}
