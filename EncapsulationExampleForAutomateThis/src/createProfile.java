public class createProfile extends bankDetails{

    private String Name;
    private int age;
    public createProfile(String Name, int age, String accountNumber){
        super(accountNumber);
        setName(Name);
        setAge(age);
    }

    public void setAge(int age){
        if(age<1){
            throw new IllegalArgumentException("Age must be positive!");
        } else{
            this.age=age;
        }
    }

    public int getAge(){
        return age;
    }

    public void setName(String Name) {
        if (Name != null && !Name.isEmpty()) {
            this.Name = Name;
        } else {
            throw new IllegalArgumentException("Name field can't be Empty!");
        }
    }

        public String getName(){
            return Name;
        }

}