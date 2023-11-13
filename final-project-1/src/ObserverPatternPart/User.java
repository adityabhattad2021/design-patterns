package ObserverPatternPart;

import java.util.List;
import FactoryPatternPart.*;
import SingletonPatternPart.*;


public class User {

    private static int idCounter = 1;

    public int userId;
    public String username;

    public User(String username) {
        this.userId = idCounter++;
        this.username = username;
    }

    public void showAllUserPosts(){
        System.out.println("Showing all posts for user: " + this.username);
        Database database = Database.getInstance();
        List<Post> userPosts=database.getPostsByUser(this);
        for (Post post : userPosts) {
            post.viewPost();
        }
    }

    public void followUser(User user){
        Database database = Database.getInstance();
        database.addFollower(user,this);
        database.addFollowing(this,user);
    }

    public void unfollowUser(User user){
        Database database = Database.getInstance();
        database.removeFollower(user,this);
        database.removeFollowing(this,user);
    }

    public void handleNewPostNotification(int userId,Post post){
        System.out.println("New post from user: " + userId);
        System.out.println("Post type: " + post.getPostType());
        post.viewPost();
    }

    public void notifyFollowers(Post post){
        Database database = Database.getInstance();
        List<User> followers = database.getAllFollowersByUser(this);
        if(followers.isEmpty()){
            return;
        }
        for (User follower : followers) {
            System.out.println("Notifying follower: " + follower);
            follower.handleNewPostNotification(this.userId,post);
        }
    }

    public void feed(){
        System.out.println("Showing feed for user: " + this.username);
        // TODO: Implement this
    }
    
}
