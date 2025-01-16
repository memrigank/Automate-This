public class runBankDetails {

    public static void main(String[] args){

        createProfile cp = new createProfile("Vikram",43,39324938);
        cp.setAge(0);
        System.out.println(cp.getAccountNumber());
        System.out.println(cp.getAge());
    }
}
