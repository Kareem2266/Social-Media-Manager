import java.util.Scanner;
import java.util.ArrayList;

/**
 * Write a description of class KareemMaamounSocialMediaTestClass here.
 * This class is the main class which ties in all the other classes by having the ability to send in to create posts, comments and more
 * The addition to this class is that the user is allowed to create posts and comment under posts :)
 *
 * @author (Kareem Maamoun)
 * @version (18/10/202)
 */
public class KareemMaamounSocialMediaTestClass
{
    public static void main(String[] args)
    {

        SocialMediaManager socialMediaManager = new SocialMediaManager();

        UserProfile user1 = new UserProfile((short)1, "Jack Skellington", "JackS@example.com");
        UserProfile user2 = new UserProfile((short)2, "Sally", "Sally@example.com");
        UserProfile user3 = new UserProfile((short)3, "Oogie Boogie", "OogieB@example.com");

        Content textContent = new TextContent((short)1, "The Nightmare before Christmas is the best movie!.");
        Content textContent2 = new TextContent((short)2, "Best Halloween movie to watch?.");
        Content imageContent = new ImagesContent((short)3, "The Nightmare before Christmas poster", "jpg");
        Content videoContent = new VideosContent((short)4, "Click to watch The Nightmare before Christmas Movie", "video_url.mp4");
        Content videoContent2 = new VideosContent((short)5, "Click to watch Saunders Fright Fest videos", "frightfest.mp4");

        socialMediaManager.createUserProfile(user1);
        socialMediaManager.createUserProfile(user2);
        socialMediaManager.createUserProfile(user3);

        socialMediaManager.createPost(user1, textContent);
        socialMediaManager.createPost(user3, textContent2);
        socialMediaManager.createPost(user2, imageContent);
        socialMediaManager.createPost(user1, videoContent);
        socialMediaManager.createPost(user3, videoContent2);

        socialMediaManager.addComment(user2, socialMediaManager.listPostsByUser(user1).get(0), "Love that Poster!");
        socialMediaManager.addComment(user3, socialMediaManager.listPostsByUser(user1).get(0), "Best Movie to watch. Thanks!");
        socialMediaManager.addComment(user1, socialMediaManager.listPostsByUser(user2).get(0), "Great image! Love that movie");
        socialMediaManager.addComment(user2, socialMediaManager.listPostsByUser(user3).get(0), "Friday the 13th is the best one to watch!");
        socialMediaManager.addComment(user2, socialMediaManager.listPostsByUser(user3).get(0), "The best halloween movie is definitely \"Halloween\"");


        //create boolean values which will be used within nested do whiles/loops and regular loops wihtin the program
        //create a variable of type boolean in order to loop the initial do while loops within the program
        boolean bolDoWhile = true;
        
        //create a do while which will be used in order to start the big do while loop which contains all of the user actions
        boolean bolBeginWhile = true;
        
        //create boolean variable which will work toghether with bolDoWhile within nestes do whiles and loops
        boolean bolDoWhile2 = true;
        
        //create a boolean clear value in order to know when a clear screen is needed
        boolean bolClear = false;
        
        //create a variable of type boolean in order to catch errors
        boolean bolTryCatch = true;
        
        //create a boolean value in order to check if the user is a registered user
        boolean bolIsUser = true;

        //create a short which is holding the amount of users on the application
        short shrExistingUser = 3;
        
        //create an id number for the new user on the platform, by adding one to the running count
        short shrUserIdNumber = shrExistingUser++;
        
        //create a variable of type short in order to contain user input for the comment
        short shrUserInput = 0;
        
        //create a variable which will hold the amount of content
        short shrAmount = 5; 
        
        //create a string variable in order to hold the name of the user and initialze it as it is getting populated within a loop
        String strName = "";
        
        //create a string variable in order to hold the email of the user and initialze it as it is getting populated within a loop
        String strEmail = "";
        
        //create a variabel of type string in order to hold the user reponses to questions, input!
        String strResponse;
        
        //create a variable to hold the title of the post for the user
        String strTitle;
        
        //create a variable to hold the image type
        String strImageType;
        
        //create a variable of type string in order to hold the image title
        String strImgageTitle;
        
        //create a variable of type string in order to hold the video url
        String strVideoUrl;
        
        //create a variable of type string in order to hold the video title
        String strVideoTitle;

        //create a variable of type short which is used in order to find the amount of posts made by the user (helps to choose which post to comment under)
        short shrPostAmount;
        
        //create a short variable which helps through incrementation to difrentiate between a user with no posts, and that user not being a user on the platform
        short shrFinder = 0;

        //create an array list of type user in order to have the ability to create more users during this program and for "other users/people"
        ArrayList<UserProfile> users = new ArrayList<UserProfile>();
        
        //add the different users to the array list
        users.add(user1);
        users.add(user2);
        users.add(user3);

        //create a for each loop which foes through each of the users and outputs all of their information, form the to string methods
        for (UserProfile x: users)
        {
            //output all of the information
            System.out.println(x);
        }

        //create a do while loop in order to be able to get the users response, and if they input anything differet (an error), have the ability to restart
        do
        {

            //output to the user if they would like the ability to interact with the differnet users on the application
            System.out.println("Interact with these users? Yes or No?");
            
            //get the users respnose by using a scanner
            strResponse = new Scanner(System.in).nextLine();

            //creat an if statement which creates different scenarios depending on the user's choices
            if(strResponse.toLowerCase().equals("yes")) //create a scenario which which happen if the user enters yes (add to lower for case sensitivetly)
            {
                //output to the user to enter their full name
                System.out.println("Enter your full name");
                
                //set the reply of the user to the strName variable
                strName = new Scanner(System.in).nextLine();

                //output to the user to enter their email
                System.out.println("Enter your email");
                
                //set the users response to email variable
                strEmail = new Scanner(System.in).nextLine();

                //set the boolean do while variable to false as we did not encounter an error
                bolDoWhile = false;
                
                //set the begin while boolean to true as we are ready to interact with the other users on the platform
                bolBeginWhile = true;

            }
            //create another if statement which runs when the user enters no
            else if (strResponse.toLowerCase().equals("no"))//no
            {
                //output to the user that theu have decided to only spectate the other users activity
                System.out.println("You have decided to roam as a guest");

                //set the do while variable to false as we did not encounter a variable and we do not need to re-loop
                bolDoWhile = false;
                
                //set the begin while variable to false as we are not going to allow the user to interact with the other users
                bolBeginWhile = false;
            }
            //create an else statement in order to catch any "errors", mainly other inputs which are not yes or no
            else
            {
                //output to the user that an error has occured, and that they need to try again
                System.out.println("You have encountered an error, please try-again");
                
                //set the do whole boolean variable to true so that we can loop our input
                bolDoWhile = true;
            }
            //set the looping condition
        }while(bolDoWhile == true);

        //create a user 4 by creating a new userprofile and sening in the parameters from the user
        UserProfile user4 = new UserProfile(shrUserIdNumber, strName, strEmail);
        
        //aftet the user if created, we then want to create a user profile in social media manager for the new user
        socialMediaManager.createUserProfile(user4);

        //add out user to the array list of current users
        users.add(user4);

        //create an if statement with the beginwhile boolean variable in order to begin gviing the user different options
        if (bolBeginWhile)
        {

            //set tehdo while variable to true to reset its value
            bolDoWhile = true;
            
            //call the user profile clear method which clears the terminal
            UserProfile.clear();

            //create a while loop with bolDoWHile wihch surround the overall user abilities
            while(bolDoWhile == true)
            {

                //create an if statement, where if the boolean variable for clear is false, then the clear funtion will be called
                //this is used as in som cases where errors are present and we re-loop, if the terminal is cleared then the user will not recieve the user message
                if (bolClear = false)
                {
                    //call the clear method
                    UserProfile.clear();
                }

                //set the clear method to false
                bolClear = false;

                //output to the user that they are signed in to their account that they made
                System.out.println("Signed in as:" + user4.getUsername() + "\n");
               

                //by using a for each loop, loop through the different users and post all of the post and commets
                for (UserProfile x: users)
                {
                    //output the different objects
                    System.out.println(x);
                }

                //ask the user if they would like to either post, comment or exit the program
                System.out.println("Do you want to post or comment under any of the posts?\nWrite post if you want to post, comment if you want to comment, and exit if you would like to quit");
                
                //set the users response to strReponse
                strResponse = new Scanner(System.in).nextLine();

                //create an if statement where the different possibilities can occur, such as posting, commenting or quitting the program
                if(strResponse.equalsIgnoreCase("post"))
                {
                    //create a do while loop to re-loop the portion of the code in case an error occurs
                    do
                    {
                        //ask the user what tyoe of post they would like to create
                        System.out.println("What kind of post would you like?\nText,Image or Video content?\nType in the type of content");
                        
                        //set the user response variable to what the user responds
                        strResponse = new Scanner(System.in).nextLine();
                        
                        //set the reponse to lower case as we are going to use a case statement
                        strResponse.toLowerCase();

                        //create a case statement around the response variable
                        switch(strResponse)
                        {
                            //create case text
                            case "text":
                                {
                                    //set the boolean do while 2 variable to true as there are no errors to re-loop
                                    bolDoWhile2 = true;

                                    //output to the user what title they would like to enter
                                    System.out.println("What is the title that you want to enter?");
                                    
                                    //populate the strTitle varible to user input
                                    strTitle = new Scanner(System.in).nextLine();

                                    //create a textContent3 object of type content and pass in the id of the post and the title
                                    Content textContent3 = new TextContent(shrAmount,strTitle);

                                    //call the social media manager class and create a post by using the information of user 4 and the content which they created
                                    socialMediaManager.createPost(user4, textContent3);

                                    //increment the content id
                                    shrAmount++;

                                }
                                //break
                                break;
                                //create the case for image
                            case "image":
                                {
                                    //set the boolean bolDoWhile2 to true as there is no enconuter of errors and the code will not need to re-run
                                    bolDoWhile2 = true;

                                    //output to the user asking for what image type is their image
                                    System.out.println("What is the image type of the image?");
                                    
                                    //popullate the image type variable to the users input
                                    strImageType = new Scanner(System.in).nextLine();

                                    
                                    //output to the user aksing for the image title
                                    System.out.println("What is the image title of the image?");
                                    
                                    //populate the image title by using a scanner
                                    strImgageTitle = new Scanner(System.in).nextLine();

                                    //create a imageCont of type content by sending int the content id, image title, and image tpye
                                    Content ImagesContent3 = new ImagesContent(shrAmount,strImgageTitle,strImageType);

                                    //using the cosial mediamanager class, we will create a post by sending in the information about the user and the information on their post
                                    socialMediaManager.createPost(user4, ImagesContent3);

                                    //increment the id
                                    shrAmount++;

                                }
                                //break
                                break;
                                //cerate a case for the video
                            case "video":
                                {
                                    //set the booldean do while variable to true as there has been no errors encountered
                                    bolDoWhile2 = true;

                                    //output to the user asking them for the video url
                                    System.out.println("What is the video url?");
                                    
                                    //set eth video url to the users input by using a scaner
                                    strVideoUrl = new Scanner(System.in).nextLine();

                                    //output to the user asking them for the video title
                                    System.out.println("What is the video title?");
                                    
                                    //populate the video title by using a scanner
                                    strVideoTitle = new Scanner(System.in).nextLine();

                                    //create a new video content of type cintent by sending in the content id and the video url
                                    Content VideosContent3 = new VideosContent(shrAmount,strVideoTitle,strVideoUrl);

                                    //call the social media manager and use the create post method, sending in user and post information
                                    socialMediaManager.createPost(user4, VideosContent3);

                                    //increment the content id
                                    shrAmount++;

                                }
                                //break
                                break;
                            //default to catch all the other values
                            default:
                                {

                                    //in this case, any other input would be seen as invalid therefore we output to the user that they inputted a wrong value and need to re-try
                                    System.out.println("You have inputted neither of the options! Please re-try");
                                    
                                    //set the boolean do while 2 variable to false which results in relooping the code and getting correct input from user
                                    bolDoWhile2 = false;

                                }
                        }
                    //set the conditoin
                    } while(bolDoWhile2 == false);

                }
                //create an else if for if the user would like to comment, use ignore case due to case sensitivity
                else if(strResponse.equalsIgnoreCase("comment"))
                {

                    //set the boolean do while 2 variable to true as no error occured
                    bolDoWhile2 = true;
                    
                    //set the shrFinder value to 0, this value will be used to differentiate between a known and unknown user
                    shrFinder = 0;

                    //create a do while in order to loop the code if an error occurs
                    do
                    {
                        //output to the user asing them to choose a users post
                        System.out.println("Who's post do you want to comment on? Write the full name of a user on the platform");
                        
                        //set the strResponse variable to the users input using a scaner
                        strResponse = new Scanner(System.in).nextLine();

                        //create a for each loop in order to go through all the user and check if their name was inputted
                        for (UserProfile x: users)
                        {

                            //create an if statment which only runs when the correct username is found
                            if (strResponse.equalsIgnoreCase(x.getUsername()))
                            {

                                //increment the finder variable
                                shrFinder++;

                                //set the post amount to the specific userpost array list length by using .size()
                                shrPostAmount = (short)x.userPosts.size();

                                //set the boolean is user variable to false as we are not intending to loop
                                bolIsUser = false;

                                //create an if statement which looks at if the user in question has a post, or more than one post
                                if(shrPostAmount >= 1)
                                {

                                    //create a do while loop around questioning which post theu would like to comment
                                    do
                                    {
                                        //add a try and catch block as primative values through input can cause errors
                                        try
                                        {
                                            //aks the user which post theywould like to comment on the user in question
                                            System.out.println("Which post would you like to comment on?\nThis user has " + shrPostAmount + " of posts! Write the number you want!");
                                            
                                            //set the users input to a new scanner
                                            shrUserInput = new Scanner(System.in).nextShort();

                                            //set the bol try catch variable to true as we dont need to reloop if this code runs succesfully
                                            bolTryCatch = true;

                                            //create an if statment to detect if the user inputted a number above the users post amount of below or equal to 0
                                            if (shrUserInput <= 0 || shrUserInput > shrPostAmount)
                                            {
                                                //as the user to rety (error message)
                                                System.out.println("You have entered another number which is not possible, please re-try");
                                                
                                                //set the boltrycatch boolean variable to false in order to re-loop
                                                bolTryCatch = false;
                                            }
                                        //create the catch block    
                                        }
                                        catch(Exception e)
                                        {
                                            //output to the user tha tthere was an error, and they need to re-entee their value
                                            System.out.println("There was an error, please re-enter your value");
                                            
                                            //set the boolean try catch to false as we will need to re-loop
                                            bolTryCatch = false;
                                        }
                                        //set the condition
                                    }while(bolTryCatch == false);

                                    //output to the user asking what theu would like to comment
                                    System.out.println("What would you like to comment?"); 
                                    
                                    //set the reponse variable to a new scanner to get the users input
                                    strResponse = new Scanner(System.in).nextLine();

                                    //set the boolean do while variable2 to true as the full do while does not need to be repeated due to no errors
                                    bolDoWhile2 = true;

                                    //use the social media manager an dthe add comment method in order to add a comment, by using the information about user 4
                                    //, the post id of the specific comment on the specific user (x)'s post, and send in the comment title
                                    socialMediaManager.addComment(user4, socialMediaManager.listPostsByUser(x).get((shrUserInput-1)), strResponse); 
                                }
                                //create an else to check if the user has any posts
                                else 
                                {

                                    //output to the user that the user they are tring to comment under does not have any posts
                                    System.out.println("This user does not have any posts!");

                                    //set the boolean is user variable to true in order to re-loop and ask the user to re add someone
                                    bolIsUser = true;                    

                                }

                            }                   
                        }

                        //make an if statement, to which if no names were succesfully compared between the array list and the user reponse
                        //we will tell the user that there is no user in question and they will have to enter a correct username
                        if(shrFinder == 0)
                        {
                            //output to the user  that the use rthey enetred is not within the program
                            System.out.println("You have entered a user which is not in the progrmam");
                            
                            //set the boolean, bolIsUser to true in order to re-loop
                            bolIsUser = true;
                        }

                        //set the condition
                    } while(bolIsUser == true);

                }
                //create an else if the user wouldl like to quit the app
                else if(strResponse.equalsIgnoreCase("exit"))
                {
                    //set the dowhile 2 & 1 to false in order to exit all of the loops
                    bolDoWhile2 = false;
                    bolDoWhile = false;

                    //output to the user that they are exiting the prohtam
                    System.out.println("Exiting the program...");
                }
                //create a case where if the user enteres anything which is neither, they need to re-try
                else
                {
                    //set the boolean clear value to true in order to not clear the terminal once we re-run the code
                    bolClear = true;

                    //set the boolean do while 2 to false 
                    bolDoWhile2 = false;
                    
                    //set the boolean do while to true in order to repeat the code as the user 
                    bolDoWhile = true;

                    //clear the terminak right before we enter the error message
                    UserProfile.clear();
                    
                    //output the message to the user
                    System.out.println("You have entered neither, please re-try!");

                }

                //create an if statemet to where if everything went smoothly and there was no errors, that we are given the option to continue
                if(bolDoWhile != false && bolDoWhile2 != false)
                {
                    //create a do while loop in order to catch and re-run in case of errors
                    do
                    {

                        //create an if statement which clears the terminal if bolClear is false
                        if (bolClear != true)
                        {
                            UserProfile.clear();
                        }

                        //output using a for each loop all the comments and posts, aswell as the new ones
                        for (UserProfile x: users)
                        {
                            //print out the objects by calling the to string methods
                            System.out.println(x);
                        }

                        //outputto the user asking if they wouldl ike anything else
                        System.out.println("Would you like to enter anything else?\nYes or No");
                        
                        //set the user reponse variable to whatever the user enters
                        strResponse = new Scanner(System.in).nextLine();

                        //create an if statement to where the user enters yes
                        if(strResponse.toLowerCase().equals("yes"))
                        {
                            //set both the booleans to true in order to re-loop everything and allow for the user to continue adding
                            bolDoWhile2 = true;
                            bolDoWhile = true;
                        }
                        //create an else if for no
                        else if(strResponse.toLowerCase().equals("no"))
                        {
                            //set the do while 2 to true in order to escape the nested loop
                            bolDoWhile2 = true;
                            
                            //set the do while to false to escape the while loop
                            bolDoWhile = false;

                            //output to the user that they are logging out
                            System.out.println("Logging out....");

                        }
                        //create an else incase the user inputs neither of the options
                        else
                        {
                            //output to the user that they selected neither of the options
                            System.out.println("You have selected neither, please try again");
                            
                            //set the boolean 2 value to false in order to reloop the ocde
                            bolDoWhile2 = false;
                            
                            //set the boolean clear value to true in order to not clear and erase error message
                            bolClear = true;
                        }
                    }
                    //set the condition
                    while (bolDoWhile2 == false);
                }
            }
        }
    }
}