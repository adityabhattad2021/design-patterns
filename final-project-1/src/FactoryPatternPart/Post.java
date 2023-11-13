package FactoryPatternPart;

import java.time.LocalDateTime;

public abstract class Post {

    private static int idCounter = 0;
    private int postId;
    private int userId;
    protected int upvotes;
    protected LocalDateTime uploadTimestamp;

    public Post(int userId){
        idCounter++;
        this.postId = idCounter;
        this.userId = userId;
        this.upvotes = 0;
        this.uploadTimestamp = LocalDateTime.now();
    }

    public int getPostId(){
        return this.postId;
    }

    public int getUserId(){
        return this.userId;
    }

    public int getUpvotes(){
        return this.upvotes;
    }

    public LocalDateTime getUploadTimestamp(){
        return this.uploadTimestamp;
    }
 
    public abstract String getPostType();

    public abstract void viewPost();

    public abstract void upvote();
    
}