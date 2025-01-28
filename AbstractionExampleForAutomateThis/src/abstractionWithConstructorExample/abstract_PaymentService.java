package abstractionWithConstructorExample;

public class abstract_PaymentService {

    private abstractPaymentsBaseClass abstractPaymentsBaseClass;

    public abstract_PaymentService(abstractPaymentsBaseClass abstractPaymentsBaseClass){
        this.abstractPaymentsBaseClass=abstractPaymentsBaseClass;
    }

    public void statusCheck(){
        abstractPaymentsBaseClass.checkStatus();
    }

    public void makePayments(double amount, String registeredName){
        abstractPaymentsBaseClass.processPayments(amount, registeredName);
    }
}
