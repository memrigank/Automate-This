package interfaceExample;

public class payPalPayments implements baseInterface_ToBank {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing, please wait...");
        System.out.println("Payment of amount "+ amount+" is done using payPal!");
    }

    @Override
    public void checkStatus() {
        System.out.println("amount successfully sent!");
    }
}
