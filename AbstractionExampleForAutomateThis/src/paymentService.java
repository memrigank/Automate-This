public class paymentService{

private paymentProcessor paymentProcessor;
paymentService (paymentProcessor paymentProcessor){
    this.paymentProcessor=paymentProcessor;
}

public void makePayments(double amount) throws InterruptedException {
    System.out.println("A Payment of amount "+ amount+ " is initiated! ");
    processPayment(amount);
}

public void processPayment(double amount) throws InterruptedException {
    paymentProcessor.processPayments(amount);
}

}