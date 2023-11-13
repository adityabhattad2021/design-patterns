package FactoryPatternPart;

public class VideoPostFactory implements IPostFactory {
    
    @Override
    public Post createPost(int userId,String postType, String postContent) {
        if (postType.equals("Video")) {
            return new VideoPost(userId,postContent);
        }
        return null;
    }

}
