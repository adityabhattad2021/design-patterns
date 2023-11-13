package FactoryPatternPart;

public class ImagePostFactory implements IPostFactory{
    
    @Override
    public Post createPost(int userId,String postType, String postContent) {
        if (postType.equals("Image")) {
            return new ImagePost(userId,postContent);
        }
        return null;
    }

}
