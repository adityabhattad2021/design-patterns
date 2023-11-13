package FactoryPatternPart;

public class TextPostFactory implements IPostFactory{
    
    @Override
    public Post createPost(int userId,String postType, String postContent) {
        if (postType.equals("Text")) {
            return new TextPost(userId,postContent);
        }
        return null;
    }

}
