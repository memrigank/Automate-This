public class paymentService {

    paymentProcessor paymentProcessor;
    userProfile userProfile;

    public paymentService(paymentProcessor paymentProcessor, userProfile userProfile){
        this.paymentProcessor= paymentProcessor;
        this.userProfile= userProfile;
    }

    public void doPayment(paymentProcessor paymentProcessor, double amount) {
        paymentProcessor.processPayment(amount);
        paymentProcessor.checkStatus();
    }

}
