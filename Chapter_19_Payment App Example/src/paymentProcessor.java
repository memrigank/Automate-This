abstract class paymentProcessor {

    abstract void processPayment(double amount);

    public void checkStatus(){
        System.out.println("Your Transaction is Successful");
    }

}
