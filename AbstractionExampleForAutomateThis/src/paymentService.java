public class paymentService{

private paymentProcessor paymentProcessor;
paymentService (paymentProcessor paymentProcessor){
    this.paymentProcessor=paymentProcessor;
}

public void makePayments(double amount) throws InterruptedException {
    makePayments(amount);
    paymentProcessor.processPayments(amount);
}

}