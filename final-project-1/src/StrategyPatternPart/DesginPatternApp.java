package StrategyPatternPart;

import java.util.ArrayList;
import java.util.List;

import FactoryPatternPart.IPostFactory;
import FactoryPatternPart.ImagePostFactory;
import FactoryPatternPart.Post;
import FactoryPatternPart.TextPostFactory;
import FactoryPatternPart.VideoPostFactory;
import ObserverPatternPart.User;
import SingletonPatternPart.Database;
import StrategyPatternPart.FeedSorter.IFeedSorter;

public class DesginPatternApp {

    private User loggedInUser;
    
    public void signUpUser(String username) {
        Database database = Database.getInstance();
        List<User> users = database.getAllUsers();
        for (User user : users) {
            if(user.username.equals(username)){
                System.out.println("Username already exists");
                return;
            }
        }
        User newUser = new User(username);
        database.addUser(newUser);
        System.out.println("User created");
    }

    public void loginUser(String username) {
        List<User> users = Database.getInstance().getAllUsers();
        for (User user : users) {
            if(user.username.equals(username)){
                this.loggedInUser = user;
                System.out.println("User logged in");
                return;
            }
        }
        System.out.println("User not found");   
    }

    public void createPost(String type, String content) {
        if(this.loggedInUser==null){
            System.out.println("Please login first");
            return;
        }
        IPostFactory postFactory;
        switch (type) {
            case "Image":
                postFactory = new ImagePostFactory();
                break;
            case "Video":
                postFactory = new VideoPostFactory();
                break;
            case "Text":
                postFactory = new TextPostFactory();
                break;
            default:
                throw new IllegalArgumentException("Invalid post type: " + type);
        }
        Post post = postFactory.createPost(this.loggedInUser.userId,type, content);
        Database.getInstance().addPost(post);
        this.loggedInUser.notifyFollowers(post);
    }

    public void followUser(String username) {
        List<User> users = Database.getInstance().getAllUsers();
        for (User user : users) {
            if(user.username.equals(username)){
                this.loggedInUser.followUser(user);
                System.out.println("User followed");
                return;
            }
        }
        System.out.println("User not found");
    }

    public void unfollowUser(String username) {
        List<User> users = Database.getInstance().getAllUsers();
        for (User user : users) {
            if(user.username.equals(username)){
                this.loggedInUser.unfollowUser(user);
                System.out.println("User unfollowed");
                return;
            }
        }
        System.out.println("User not found");
    }

    public void upvote(int postId) {
        List<Post> posts = Database.getInstance().getAllPosts();
        for (Post post : posts) {
            if(post.getPostId()==postId){
                post.upvote();
                System.out.println("Post upvoted");
                return;
            }
        }
        System.out.println("Post not found");
    }

    public void viewFeed(IFeedSorter feedSorter) {
        List<User> creators = Database.getInstance().getAllFollowingByUser(loggedInUser);
        List<Post> feeds = new ArrayList<>();
        for (User creator : creators) {
            feeds.addAll(Database.getInstance().getPostsByUser(creator));
        }
        Post[] sortedFeeds = feedSorter.sortFeeds(feeds);
        for (Post post : sortedFeeds) {
            post.viewPost();
        }
    }

}
