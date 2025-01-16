public class runBankDetails {

    public static void main(String[] args){

        createProfile cp = new createProfile("Amit",43,"7932844847328");
        System.out.println(cp.getAge());
        System.out.println(cp.getName());
        cp.setAge(42);
        cp.setName("Vikram");
        System.out.println(cp.getAccountNumber());
        System.out.println(cp.getAge());
        System.out.println(cp.getName());
        System.out.println(cp.getMaskedAccountNumber());

    }
}
