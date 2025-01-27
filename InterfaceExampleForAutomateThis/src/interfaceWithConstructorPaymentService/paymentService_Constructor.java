package interfaceWithConstructorPaymentService;

public class paymentService_Constructor {

    baseInterface_ToBank baseInterface_ToBank;
    baseInterface_toBillers baseInterface_toBillers;
    public String billerType;

    public paymentService_Constructor(baseInterface_ToBank baseInterface_ToBank){
        this.baseInterface_ToBank=baseInterface_ToBank;
    }

    public paymentService_Constructor(baseInterface_toBillers baseInterface_toBillers, String billerType){
        this.baseInterface_toBillers=baseInterface_toBillers;
        this.billerType=billerType;
    }

    public void doElectricityBillPayment(double amount){
        baseInterface_toBillers.payElectricity(amount);
        System.out.println("This is a Biller Type "+ billerType);
    }

    public void doWaterBillPayment(double amount){
        baseInterface_toBillers.payWaterBill(amount);
        System.out.println("This is a Biller Type "+ billerType);
    }

    public void doBankPaymentUsingUPI(double amount){
        baseInterface_ToBank.processPayment(amount);
    }

    public void doBankPaymentUsingPayPal(double amount){
        baseInterface_ToBank.processPayment(amount);
        baseInterface_ToBank.checkStatus();
    }

}
