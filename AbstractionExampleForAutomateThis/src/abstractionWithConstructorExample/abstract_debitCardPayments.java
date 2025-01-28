package abstractionWithConstructorExample;

public class abstract_debitCardPayments extends abstractPaymentsBaseClass{
    @Override
    void processPayments(double amount, String registeredName) {
        System.out.println("Hello! "+ registeredName);
        System.out.println("Transaction processing...");
        System.out.println("Verifying Secure Transaction...");
        System.out.println("Money is sent using UPI payments, amount: "+ amount);
    }
}
