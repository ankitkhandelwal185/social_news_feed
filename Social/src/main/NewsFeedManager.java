package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NewsFeedManager {
    // userMap: name, main.User
    Map<String, User> userMap;
    // newsFeedMap: feedId, main.Feed
    Map<String, Feed> newsFeedMap;
    User loggedInUser;

    public NewsFeedManager() {
        this.userMap = new HashMap<String, User>();
        this.newsFeedMap = new HashMap<String, Feed>();
    }

    public List<Feed> getNewsFeed(){
        List<Feed> newsFeedList = new ArrayList<Feed>();
        this.newsFeedMap.forEach((k,v) ->  newsFeedList.add(v));
        return newsFeedList;
    }

    public void addVoteToFeed(String feedId, VoteType voteType){
        Feed feed = this.newsFeedMap.get(feedId);
        feed.addVote(voteType);
    }

    public void addCommentToFeed(String feedId, String comment){
        Feed feed = this.newsFeedMap.get(feedId);
        feed.addComment(comment);
    }
}
