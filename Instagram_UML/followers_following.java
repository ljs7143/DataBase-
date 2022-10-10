import java.util.ArrayList;

//완료

public class followers_following{
    public String user_ID;
    public String following_user_id;
    public String followers_user_id;

    ArrayList<User> followers = new ArrayList<User>();   
    ArrayList<User> following = new ArrayList<User>();
    
    public void follow(String user_ID, String following_user_id){
        following.add(following_user_id);
        
    }

    public void follower(String user_ID, String followers_user_id){
        followers.add(followers_user_id);
        
    }       

    
        
        
    
}
