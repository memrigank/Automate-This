package abstractionWithConstructorExample;

abstract class abstractPaymentsBaseClass {

    abstract void processPayments(double amount, String registeredName);

    public void checkStatus(){
        System.out.println("Transaction Success");
    }

}
