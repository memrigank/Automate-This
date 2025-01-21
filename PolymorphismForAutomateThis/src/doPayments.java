public class doPayments {

    public static void main(String[] args){
        basePayments bP = new basePayments(4689292, 638323232, 68999888, 886);
        creditCardPayment ccP = new creditCardPayment(638323232, 886);
        debitCardPayment dcP = new debitCardPayment(4689292, 68999888);
        ccP.addCardsToFlipkart();
        dcP.addCardsToFlipkart();
        ccP.billPayment();
        dcP.billPayment();
        bP.addCardsToFlipkart();
        bP.billPayment();
    }
}