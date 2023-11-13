package FactoryPatternPart;

import java.time.LocalDateTime;

public class ImagePost extends Post {
    
    public String postType = "Image";

    private String image;

    public ImagePost(int userId,String image) {
        super(userId);
        this.image = image;
    }

    @Override
    public void viewPost() {
        System.out.println("Image: " + this.image);
        System.out.println("Upvotes: " + this.upvotes);
        System.out.println("Upload Timestamp: " + this.uploadTimestamp);
    }

    @Override
    public int getUpvotes() {
        return this.upvotes;
    }

    @Override
    public LocalDateTime getUploadTimestamp() {
        return this.uploadTimestamp;
    }

    @Override
    public void upvote(){
        this.upvotes++;
    }

    @Override
    public String getPostType(){
        return this.postType;
    }

}
