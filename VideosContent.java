
/**
 * Write a description of class Video here.
 *
 *create a videos content class in order to hold the specifics for video content such as the video url. 
 *This class will also inherit from content in order ot have its qulaities such as the id and content information
 *
 * @author (Kareem Maamoun)
 * @version (19/10/2023)
 */
public class VideosContent extends Content //exten d videos content in order to use inheritance
{
    //create a private string variable in order to hold the video url
    private String strVideoURL;

    //create a contructor in order to initialize the variables
    public VideosContent(short Id, String content, String videoUrl)
    {
        //use the super function in order to initalize the two instance variables which are usually sent in
        super(Id,content);

        //initialize the video url
        this.strVideoURL = videoUrl;
    }
    
    //create a getter method in order to return the video url
    public String getVideoUrl()
    {
        return this.strVideoURL;
    }

    //create a setter variable in order to set the video url to what the user wants, if the user wanst to change it later on  (Scalebility)
    public void setVideoUrl(String url)
    {
        this.strVideoURL = url;
    }
    
}
