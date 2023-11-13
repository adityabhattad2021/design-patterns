package StrategyPatternPart.FeedSorter;

import java.util.List;

import FactoryPatternPart.Post;

public class FeedSorterbyUpvotes implements IFeedSorter {
    
    @Override
    public Post[] sortFeeds(List<Post> feeds) {
        Post[] sortedFeeds = new Post[feeds.size()];
        for (int i = 0; i < feeds.size(); i++) {
            sortedFeeds[i] = feeds.get(i);
        }
        for (int i = 0; i < sortedFeeds.length; i++) {
            for (int j = 0; j < sortedFeeds.length-i-1; j++) {
                if (sortedFeeds[j].getUpvotes() < sortedFeeds[j+1].getUpvotes()) {
                    Post temp = sortedFeeds[i];
                    sortedFeeds[i] = sortedFeeds[j];
                    sortedFeeds[j] = temp;
                }
            }
        }
        return sortedFeeds;
    }

}
