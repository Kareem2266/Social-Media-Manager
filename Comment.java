//import the day
import java.util.Date;

/**
 * Write a description of class Comment here.
 *
 *create a class which will hold the information about the comments, includingthe comment id, user profile, content and timestamp
 *
 * @author (Kareem Maamoun)
 * @version (19/10/2023)
 */
public class Comment
{
    //create a private short variable to hold the comment id
    private short shrCommentId;
    
    //create a private user profile variable to hold the commenter
    private UserProfile commenter; //user
    
    //create a private string variable in order to hold the content
    private String strContent; 
    
    //create a private string variable in order to hold the timestamp
    private String strTimestamp;
    
    //create a constrcutor in order to initialise the instance variables
    public Comment (short commentId, UserProfile newCommenter, String content)
    {
        //initialize the instance variables including the date
        this.shrCommentId = commentId;
        this.commenter = newCommenter;
        this.strContent = content;
        
        ///initialize the date
        Date currentDate = new Date();
        this.strTimestamp = currentDate.toString();
    }
    
    //create a getter for the content in order to output to the user
    public String getContent()
    {
        return this.strContent;
    }
    
    //create a getter for the time stamp (scalability(most social medias include the date in posts and comments))
    public String getTime()
    {
        return this.strTimestamp;
    }
    
    //create a getter for the comment id in order to return the id, dont need setter because it will never be changes
    public short getCommentId()
    {
        return this.shrCommentId;
    }
    
    //create a getter in order to retturn the commenter
    public UserProfile getCommemter()
    {
        return this.commenter;
    }
    
}
