package SingletonPatternPart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import FactoryPatternPart.Post;
import ObserverPatternPart.User;

public class Database {

    private HashMap<Integer,Post> allPosts;
    private HashMap<Integer,User> allUsers;

    // A feed of the perticular user comprises of all the posts of the users that the user is following.
    private HashMap<Integer,List<Integer>> userFollowing;
    private HashMap<Integer,List<Integer>> userFollowers;
    
    private static final Database instance = new Database();

    private Database() {
        this.allPosts = new HashMap<>();
        this.allUsers = new HashMap<>();
        this.userFollowing = new HashMap<>();
        this.userFollowers = new HashMap<>();
        System.out.println("Database instance created");
    }

    public static Database getInstance() {
        return instance;
    }

    public void addUser(User user){
        this.allUsers.put(user.userId,user);
    }

    public void addPost(Post post){
        this.allPosts.put(post.getPostId(),post);
    }

    public void addFollower(User user,User follower){
        if(!this.userFollowers.containsKey(user.userId)){
            this.userFollowers.put(user.userId,new ArrayList<>());
        }
        this.userFollowers.get(user.userId).add(follower.userId);
    }

    public void removeFollower(User user,User follower){
        this.userFollowers.get(user.userId).remove(follower.userId);
    }

    public void addFollowing(User user,User following){
        if(!this.userFollowing.containsKey(user.userId)){
            this.userFollowing.put(user.userId,new ArrayList<>());
        }
        this.userFollowing.get(user.userId).add(following.userId);
    }

    public void removeFollowing(User user,User following){
        this.userFollowing.get(user.userId).remove(following.userId);
    }

    public List<User> getAllFollowersByUser(User user){
        List<User> followers = new ArrayList<>();
        if(this.userFollowers.get(user.userId).isEmpty()){
            return followers;
        }
        for (Integer userId : this.userFollowers.get(user.userId)) {
            followers.add(this.allUsers.get(userId));
        }
        return followers;
    }


    public List<Post> getPostsByUser(User user){
        List<Post> posts = new ArrayList<>();
        if(this.allPosts.isEmpty()){
            return posts;
        }
        for(Post post:this.allPosts.values()){
            if(post.getUserId()==user.userId){
                posts.add(post);
            }
        }
        return posts;
    }

    public List<Post> getAllPosts(){ 
        if(allPosts.isEmpty()){
            return new ArrayList<>();
        }
        return allPosts.values().stream().toList();
    }

    public List<User> getAllUsers(){
        if(allUsers.isEmpty()){
            return new ArrayList<>();
        }
        return allUsers.values().stream().toList();
    }

}
