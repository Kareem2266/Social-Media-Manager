//import array lists and the date
import java.util.ArrayList;
import java.util.Date;

/**
 * Write a description of class Post here.
 *
 *Create a class which will represent the posts made by users, inluding postID, content, timestamp and an array list in order to store the comments on the posts
 *
 * @author (Kareem Maamoun)
 * @version (19/10/2023)
 */
public class Post
{

    //create a variable of time short to hold the id of the post
    private short shrPostId;
    
    //create an object of type content to hold the content for that post
    private Content content;
    
    //create a variable of type string in order to hold the date in a string
    private String strTimestamp;
    
    //create an array list of type comment to hold the comments
    ArrayList<Comment> comments;
    
    //create a variable of type string in order to output values to the user
    private String strOutput;
    
    //create a constructor in order to populate posts
    public Post (short postId, Content newContent)
    {
        //inituialize the instance vaariables
        this.shrPostId = postId;
        this.content = newContent;
        
        //use the date 
        Date currentDate = new Date();
        
        //set the string to the current date and send that as a string
        this.strTimestamp = currentDate.toString();
        
        //initialize the comment array lists
        comments = new ArrayList<Comment>();
    }
    
    //create a to string in order to ourtput to the user
    public String toString()
    {
        //use the output variable to store the different comments, and before that, getting the name of each of the posts by calling the content class
        this.strOutput = this.content.getContent() + "\n\nComments on this post:\n";  //toStrin?()
        
        //make a for each in order to add the comments in relation to the content, call the get content method from comment
        for(Comment c: comments)
        {
            this.strOutput += c.getContent() + "\n";
        }
        
        //return the output variable
        return this.strOutput + "\n";
    }
    
    //create a getter for the time stamp (scalability(most social medias include the date in posts and comments))
    public String getTime()
    {
        //return the time stamp
        return this.strTimestamp;
    }
    
    //create a getter for the post id in order to possibly user in the future
    public short getPostId()
    {
        //return the post id
        return this.shrPostId;
    }
    
    //create a getter in order to possibly fetch the content later (Scalebility)
    public Content getContent()
    {
        //return the content
        return this.content;
    }
}
