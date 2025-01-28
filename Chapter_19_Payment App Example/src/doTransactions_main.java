public class doTransactions_main {

    public static void main(String[] args){
        paymentProcessor doPayments;
        doPayments = new payUsingCreditCard(new userProfile("Ashu", "iamashu@intellij.com"));
        doPayments.processPayment(304.50);
        doPayments.checkStatus();
    }
}
