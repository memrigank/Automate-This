public class createProfile extends bankDetails{

    private String Name;
    private int age;
    private String accountNumber;
    public createProfile(String Name, int age, String accountNumber){
        super(accountNumber);
        this.Name=Name;
        setAge(age);
    }

    public void setAge(int age){
        if(age<1){
            System.out.println("Not Allowed to set a negative or zero number to age");
        } else{
            this.age=age;
        }
    }

    public int getAge(){
        return age;
    }
}
