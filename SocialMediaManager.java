//import array lists
import java.util.ArrayList;

/**
 * Write a description of class SocialMediaManager here.
 *
 *This class is the social media clsas which creates the differents user profiles, posts and comments
 *Within this class each of these posts can be assigned to the specific users, aswell as the comments which are under the posts
 *
 * @author (Kareem Maamoun)
 * @version (19/10/2023)
 */
public class SocialMediaManager
{
    //create an array list of user profile in order to hold the different user profules
    ArrayList<UserProfile> userProfile;

    //create a value to hold the id of the post
    static short shrPostIDCounter;

    //create a value to hold the comment counter
    static short shrCommentIDCounter;

    //create a constructor to initialize the array lists
    public SocialMediaManager()
    {
        //initialize the different array lists
        this.userProfile = new ArrayList<UserProfile>();
        
        //initialize the instance variables
        shrPostIDCounter++;
        shrCommentIDCounter++;
    }

    //create a method which creates the user profile which taking in the user information
    public void createUserProfile(UserProfile newUser)
    {
        //get the instance of user profile and add the new user which is being passed in
        this.userProfile.add(newUser);
    }

    //create a creat post method in order to create posts for our users
    public void createPost(UserProfile user, Content content)
    {
        //create a post by sending in the counter and the content
        Post post = new Post(shrPostIDCounter++, content);
        
        //add the posts to the specific user who is being brought in
        user.userPosts.add(post);
    }

    public void addComment(UserProfile user,Post post, String strComment)
    {
        Comment comment = new Comment (shrCommentIDCounter++,user,strComment);
        post.comments.add(comment); //is this needed
    }


    //create a method returning the posts for each user
    public ArrayList<Post> listPostsByUser(UserProfile user)
    {
        //return the user sposts
        return user.userPosts;
    }

    //create a method which would return the comments of the user
    public ArrayList<Comment> listCommentsByUser(UserProfile user)
    {
        //return the users comments
        return user.userComments;
    }

}
