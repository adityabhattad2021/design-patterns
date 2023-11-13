package FactoryPatternPart;

public interface IPostFactory {

    public Post createPost(int userId,String postType, String postContent);

} 
