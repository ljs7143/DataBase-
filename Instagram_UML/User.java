import javax.sound.sampled.SourceDataLine;

public class User{
    private String UID;
    public String User_ID;
    private String password;
    public String Email_Address;

    //what users can do? 
    //need to specify arguments later


    //maybe it should be abstract class 
    //then implements on  Posting table

    public User(String UID, String User_ID, String password, String Email_Address){
        this.UID = UID;
        this.User_ID = User_ID;
        this.password = password;
        this.Email_Address = Email_Address;
    }
    
    private boolean Login(){
        return true;
    }

    private boolean SignUp(){
        return true;
    }


   

    // public WritePosts(){
    //     //write codes later what should I implement.
    //     //maybe contents, photos...
    //     //using views?  
    //     return null;
    // }

    // public WriteComments(){



    // }

}
