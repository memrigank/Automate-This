package interfaceWithConstructorPaymentService;

public class doPayments_main {

    public static void main(String[] args) {

        paymentService_Constructor paymentServices;

        paymentServices = new paymentService_Constructor(new payPalPayments());
        paymentServices.doBankPaymentUsingPayPal(203.45);
        paymentServices = new paymentService_Constructor( new upiPayments(), "Electricity Bill");
        paymentServices.doElectricityBillPayment(324.80);
        paymentServices.doWaterBillPayment(304.45);
        paymentServices = new paymentService_Constructor( new upiPayments());
        paymentServices.doBankPaymentUsingUPI(300.00);
    }
}
