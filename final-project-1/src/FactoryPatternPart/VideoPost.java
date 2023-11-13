package FactoryPatternPart;

import java.time.LocalDateTime;

public class VideoPost extends Post{
    
    public String postType = "Video";

    private String video;
    

    public VideoPost(int userId,String video) {
        super(userId);
        this.video = video;
    }

    @Override
    public void viewPost() {
        System.out.println("Video: " + this.video);
        System.out.println("Upvotes: " + this.upvotes);
        System.out.println("Upload Timestamp: " + this.uploadTimestamp);
    }

    @Override
    public String getPostType(){
        return this.postType;
    }
    
}
