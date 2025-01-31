abstract class PaymentProcessor {

    protected customerProfile customerProfile;

    public void processPayment(customerProfile customerProfile){
        this.customerProfile=customerProfile;
    }

    public void checkStatus(){
        System.out.println("The Transaction is now successful!");
    }

    public abstract void paymentProcessor(double amount);

}
