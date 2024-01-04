/**
 * Write a description of class Text here.
 *
 *Create a class which hold the specific variable which belongs to text content
 *This class whill inherit(extend) from the content class in order to inherit from it, variables such as post id and content
 *
 * @author (Kareem Maamoun)
 * @version (19/10/2023)
 */
public class TextContent extends Content //extend from content in order to inherit the properties of the content class
{

    //create a private short to hold the lenght of the post which is create dbu the user
    private short shrTextPostLength;
    
    //create a constructor in orde to populate the variables
    public TextContent(short Id, String content)
    {
        //use the super function in order to initalize the two instance variables which are usually sent in
        super(Id,content);
        
        //cast to a short due to possible lossy conversion from the length function, and get the length of the content in order to get the length
        this.shrTextPostLength = (short)content.length();
        
    }
    
    //create a getter method in order to return the content post length
    public short getPostLength()
    {
        return this.shrTextPostLength;
    }
    
    //create a setter variable in order set the post length to what they want(example what happens if they edit the photo description (better than twitter))
    public void setPostLength(short length)
    {
        this.shrTextPostLength = length;
    }
}
