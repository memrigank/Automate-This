package interfaceExample;

public class upiPayments implements baseInterface_ToBank, baseInterface_toBillers {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing, please wait...");
        System.out.println("Payment of amount "+ amount+" is done using BHIM UPI!");
    }

    @Override
    public void checkStatus() {
        System.out.println("amount successfully sent!");
    }

    @Override
    public void payElectricity(double amount) {
        System.out.println("Processing Please wait...");
        System.out.println("Electricity bill for amount "+amount+" is paid! using UPI");
    }

    @Override
    public void payWaterBill(double amount) {
        System.out.println("Processing Please wait...");
        System.out.println("Water bill for amount "+amount+" is paid! using UPI");
    }
}
