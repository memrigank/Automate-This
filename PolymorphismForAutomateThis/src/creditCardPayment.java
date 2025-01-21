public class creditCardPayment extends basePayments{

    public creditCardPayment(long creditCard, int CVV){
        super(creditCard, CVV);
    }

    @Override
    public void billPayment(){
        System.out.println("bill Payment done using Credit Card");
    }

    @Override
    public void addCardsToFlipkart(){
        System.out.println("Credit Card has been added with number: " + getCreditCard());
    }
}
