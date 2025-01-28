public class payUsingCreditCard extends paymentProcessor{

    userProfile userProfile;

    public payUsingCreditCard(userProfile userProfile){
        this.userProfile=userProfile;
    }

    @Override
    void processPayment(double amount) {
        System.out.println("Processing payment...");
        System.out.println("Securely Verifying the "+ userProfile.getName());
        System.out.println("Please check your email "+ userProfile.getEmailID()+ " for payment details");
        System.out.println("The transaction of amount: "+amount+ " is done using Credit Card");
    }
}
