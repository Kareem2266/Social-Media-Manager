import java.util.Date;

/**
 * Write a description of class Content here.
 *
 *Create a content class which will be used to represent all of the content on the platform
 *Including many attributes of the content such as the id, the content and the timestamp
 *
 * @author (Kareem Maamoun)
 * @version (19/10/2023)
 */
public class Content
{
    //create a private short variable to hold the content id
    private short shrContentId;
    
    //create a private string content variable in order to hold the content
    private String strContent;
    
    //create a private string value in order to hold the timestamp
    private String strTimestamp;
    
    //create a contructor in order to initialize the different instance variables
    public Content(short Id, String content)
    {
        //initialize the instance variables, including the date
        this.shrContentId = Id;
        this.strContent = content;
        
        //initialize the date
        Date currentDate = new Date();
        this.strTimestamp = currentDate.toString();
    }
    
    //create a getter method in order to return the content id
    public short getContentid()
    {
        return this.shrContentId;
    }
    
    //create a getter method to get the date
    public String getTimestamp()
    {
        return this.strTimestamp;
    }
    
    //create a setter variable in order to ste the cintent id to whatever is being sent in as a parameter
    public void setContentId(short id)
    {
        this.shrContentId = id;
    }
    
    //create a getter in order to return the content variable     
    //and it will be called in order to return the text of the content
    public String getContent()
    {
        return this.strContent;
    }
    
    //create a setter variable variable in order to set the value of content to what the user is sending in
    public void setContent(String content)
    {
        this.strContent = content;
    }
    
}
