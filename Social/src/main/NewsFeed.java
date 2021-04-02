package main;

import java.util.List;
import java.util.Scanner;

public class NewsFeed {
    public static void main(String[] args) {
        NewsFeedManager newsFeedManager = new NewsFeedManager();
        List<Feed> feedList;
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Enter Query or Enter exit to close");
            String query = scanner.nextLine();
            String[] queryList = query.split("~");
            String queryType = queryList[0];
            if(queryType==null || queryType.length()==0)
                System.out.println("query is empty");
            switch (queryType){
                case "signup":
                    User user = new User(queryList[1]);
                    newsFeedManager.userMap.put(queryList[1], user);
                    break;
                case "login":
                    newsFeedManager.loggedInUser = newsFeedManager.userMap.get(queryList[1]);
                    feedList = newsFeedManager.getNewsFeed();
                    for(Feed feed: feedList)
                        System.out.println(feed.toString());
                    break;
                case "post":
                    Feed newsFeed = new Feed(queryList[1], newsFeedManager.loggedInUser);
                    newsFeedManager.newsFeedMap.put(newsFeed.getNewsFeedId(), newsFeed);
                    break;
                case "upvote":
                    newsFeedManager.addVoteToFeed(queryList[1], VoteType.UPVOTE);
                    break;
                case "downvote":
                    newsFeedManager.addVoteToFeed(queryList[1], VoteType.DOWNVOTE);
                    break;
                case "reply":
                    newsFeedManager.addCommentToFeed(queryList[1], queryList[2]);
                    break;
                case "shownewsfeed":
                    feedList = newsFeedManager.getNewsFeed();
                    for(Feed feed: feedList)
                        System.out.println(feed.toString());
                    break;
                case "exit":
                    break;
            }
        }
    }
}
