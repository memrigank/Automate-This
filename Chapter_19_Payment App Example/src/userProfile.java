public class userProfile {

    private String name;
    private String emailID;

    public userProfile(String name, String emailID){
        this.name=name;
        this.emailID=emailID;
    }

    public String getName(){
        return name;
    }

    public String getEmailID(){
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public void setName(String name) {
        this.name = name;
    }
}
