package interfaceExample;

public class debitCardPayments implements baseInterface_ToBank, baseInterface_toBillers {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing, please wait...");
        System.out.println("Payment of amount "+ amount+" is done using debit card!");
    }

    @Override
    public void checkStatus() {
        System.out.println("amount successfully sent!");
        System.out.println("===============================================================");

    }

    @Override
    public void payElectricity(double amount) {
        System.out.println("Processing Please wait...");
        System.out.println("Electricity bill for amount "+amount+" is paid!");
    }

    @Override
    public void payWaterBill(double amount) {
        System.out.println("Processing Please wait...");
        System.out.println("Water bill for amount "+amount+" is paid!");
    }
}
