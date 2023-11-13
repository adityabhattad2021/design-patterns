package FactoryPatternPart;

import java.time.LocalDateTime;


// In real life scenario this would have more text specific proporties than just posttype==text.
public class TextPost extends Post{

    public String postType = "Text";
    
    private String text;

    public TextPost(int userId,String text) {
        super(userId);
        this.text = text;
    }

    @Override
    public void viewPost() {
        System.out.println("Text: " + this.text);
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
