
/**
 * Write a description of class Image here.
 *
 *Create an image content class hiwch will hold the specific variables which relate to image content such as image type
 *
 * @author (Kareem Maamoun)
 * @version (19/10/2023)
 */
public class ImagesContent extends Content //extends content in order to have inheritance
{

    //create a private string image type in order to hold the image type
    private String strImageType;

    //create a contructor in order to initialize the intance variables
    public ImagesContent(short Id, String content, String imageType)
    {
        //use the super function in order to initalize the two instance variables which are usually sent in
        super(Id,content);

        //initialize the instance variable
        this.strImageType = imageType;
    }

    //create a getter method in order to return the content image type
    public String getImageType()
    {
        //return the image type
        return this.strImageType;
    }

    //create a setter variable in order to set the image type to what the user wants
    public void setImageType(String type)
    {
        //create a setter for the image type, so if the user wants to edit their image and put in a different one with a different type they can (SCALEBILITYY)
        this.strImageType = type;
    }

}
