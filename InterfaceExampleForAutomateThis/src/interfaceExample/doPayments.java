package interfaceExample;

public class doPayments {

    public static void main(String[] args) {

        debitCardPayments debitCardPayments = new debitCardPayments();
        upiPayments upiPayments = new upiPayments();
        payPalPayments payPalPayments = new payPalPayments();

        debitCardPayments.processPayment(1023.80);
        debitCardPayments.checkStatus();
        debitCardPayments.payElectricity(5000.60);
        debitCardPayments.checkStatus();
        debitCardPayments.payWaterBill(300.80);
        debitCardPayments.checkStatus();
        upiPayments.processPayment(1800.30);
        upiPayments.checkStatus();
        upiPayments.payElectricity(600.99);
        upiPayments.payWaterBill(230.55);
        payPalPayments.processPayment(183.25);
        payPalPayments.checkStatus();


    }
}
