public class Payments_paymentService {

private Payments_paymentProcessor paymentProcessor;
Payments_paymentService(Payments_paymentProcessor paymentProcessor){
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