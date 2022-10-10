public class Posting{

    final String url;
    public String user_id;
    public String contents; 
    public String photos_url;
    public String videos_url;
    ArrayList<Posting> postLike = new ArrayList<Posting>();

    // public Posting(String url,  String user_id, String contents,String photos_url, String videos_url ){ 
	// 	this.url = url;
    //     this.user_id = user_id;
    //     this.contents = contents;
    //     this.photos_url = photos_url;
    //     this.videos_url = videos_url;
	// }

    //위 메소드를 사용할 때는 자식클래스 posts, stories의 객체를 생성해서 사용해야함
    public void UserViews(){
        // System.out.println("이 곳에 view를 볼 수 있는 규격에 맞게 출력하는 메소드설정");

    }
}
