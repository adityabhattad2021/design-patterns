import StrategyPatternPart.DesginPatternApp;
import StrategyPatternPart.FeedSorter.FeedSorterbyTime;
import StrategyPatternPart.FeedSorter.FeedSorterbyUpvotes;

public class App {
    public static void main(String[] args) throws Exception {
        DesginPatternApp app = new DesginPatternApp();
        app.signUpUser("aditya");
        app.signUpUser("vivek");
        app.signUpUser("sahil");
        app.signUpUser("arpita");

        app.loginUser("vivek");
        app.followUser("aditya");
        app.logoutUser();
        app.loginUser("sahil");
        app.followUser("aditya");
        app.logoutUser();
        app.loginUser("arpita");
        app.followUser("aditya");
        app.logoutUser();

        app.loginUser("aditya");
        app.createPost("Image", "This is an image post by aditya");
        // This post will have id 2.
        app.createPost("Video", "This is a video post by aditya (this post has more upvotes)");
        app.createPost("Text", "This is a text post by aditya");
        app.logoutUser();

        app.loginUser("vivek");
        app.createPost("Image", "This is an image post by vivek");
        app.createPost("Video", "This is a video post by vivek");
        app.logoutUser();

        app.loginUser("sahil");
        
        System.out.println("######################################################");
        System.out.println("Sahil's feed");
        app.viewFeed(new FeedSorterbyTime());
        System.out.println("######################################################");
        
        app.followUser("vivek");
        app.upvote(2);
        System.out.println("######################################################");
        System.out.println("Sahil's feed (after following vivek)");
        app.viewFeed(new FeedSorterbyUpvotes());
        System.out.println("######################################################");
        app.logoutUser();
    }
}
