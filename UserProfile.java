import java.util.ArrayList;
import java.util.Date;

/**
 * Write a description of class UserProfile here.
 *
 *DESCRIPTION 
 *
 *  Create User Profiles:
Create a class called UserProfile to represent users on the platform.
Include attributes such as userId, username, email, dateJoined, and an ArrayList to store the user's posts.
Implement methods for setting and getting these attributes.
 *
 * @author (Kareem Maamoun)
 * @version (16/10/2023)
 */

 
 
public class UserProfile
{

    //create a private id variable of type short in order to hold the amount of people which could possibly use this social media platform in its testing.
    private short shrUserId;

    //create a private string variable in order to hold the username of the user
    private String strUsername;

    //create a private string variable in order to store the email of the aprticular user
    private String strEmail;

    //create a private string variable in order to hold the date joined by the user
    private String strDateJoined;

    //create an array list of type Post in order to hold the posts whuch the user creats
    ArrayList<Post> userPosts;

    //create an array list of type Comment in order to hold the comments which the user creats
    ArrayList<Comment> userComments;

    //creates an initial variable which is used in order to start the output
    String strOutput;

    //creta an array list if the user inputs nothing, and thus has an unkown unsername, make a gues account
    public UserProfile() 
    {
        //initialize the instance variables/array lists
        this.shrUserId = 0;
        this.strUsername = "Guest-User";
        this.strEmail = "Unknown";
        userPosts = new ArrayList<Post>();

        //create a date object for the current date
        Date currentDate = new Date();

        //initialize the date and convert the currentDate to a string using the toStringMethod assosiated with the class
        this.strDateJoined = currentDate.toString();

    }
    
    //create a constructor to populate the instance variables, not uncluding date joined as we are using a class for the date joined
    public UserProfile(short id, String username, String email) 
    {
        //initialize the instance variables/array lists
        this.shrUserId = id;
        this.strUsername = username;
        this.strEmail = email;
        userPosts = new ArrayList<Post>();

        //create a date object for the current date
        Date currentDate = new Date();

        //initialize the date and convert the currentDate to a string using the toStringMethod assosiated with the class
        this.strDateJoined = currentDate.toString();

    }

    //create a getter for the user ID and return the user ID, a setter is not needed as the user id will not change
    public short getUserId()
    {
        return this.shrUserId;
    }

    //create a getter for the usernam, and return the username when clalled, having the ability to display names
    public String getUsername()
    {
        return this.strUsername;
    }

    //create a setter for the username, set the username value of this instance equal to the parameter being sent in, have th ability to change usernames later in wanted
    public void setUsername(String username)
    {
        this.strUsername = this.strUsername;
    }

    //create a getter in order to get the email of the user, and return the email
    public String getEmail()
    {
        return this.strEmail;
    }

    //create a setter for the email, when called the email will be switched to whatever email value will be passed into as a parameter, the email of the user could be changed later
    public void setEmail(String email)
    {
        this.strEmail = this.strEmail;
    }

    //create a getter for the date joined, return the date joined once this method is called, a setter is not needed as the date joined will not be changed/manipulated
    public String getDateJoined()
    {
        return this.strDateJoined;
    }

    //create a to string in order to connect all of the classes and create our input
    public String toString()
    {
        //stores the name of the user and formates the output
        this.strOutput = "Posts by: " + this.strUsername + ":\n\n" ;

        //create a for each loop which takes the different user posts and adds the to string method from that class in order to get their information
        for (Post post : userPosts)
        {
            this.strOutput += post.toString();
        }

        //return the output variable which has been populated by the two string methods in the posts and comment class
        return strOutput + "\n";
    }

    //create a static method which is used to clear the terminal
    public static void clear()
    {
        System.out.print('\u000C');
    }

}
