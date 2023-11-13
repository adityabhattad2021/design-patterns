package StrategyPatternPart.FeedSorter;

import java.util.List;

import FactoryPatternPart.Post;

public interface IFeedSorter {
    
    public Post[] sortFeeds(List<Post> feeds);

}
