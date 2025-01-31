public class customerProfile {

    private String name;
    private String number;
    private String emailID;

    public customerProfile(String name, String number, String emailID){
        this.name=name;
        this.number=number;
        this.emailID=emailID;
    }

    public String getName(){
        return name;
    }

    public String getNumber() {
        return number;
    }

    public String getEmailID() {
        return emailID;
    }
}
