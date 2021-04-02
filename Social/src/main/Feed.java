package main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Feed {
    private String newsFeedId;
    private String content;
    private User postedBy;
    private Date createdOn;
    private List<Comment> comments;
    private List<Vote> votes;

    Random random = new Random();
    public Feed(String content, User user){
        this.newsFeedId = String.valueOf(random.nextInt(1000));
        this.content = content;
        this.postedBy = user;
        this.createdOn = new Date();
        this.comments = new ArrayList<>();
        this.votes = new ArrayList<>();
    }


    public void addVote(VoteType voteType){
        this.votes.add(new Vote(voteType));
    }

    public void addComment(String comment){
        this.comments.add(new Comment(comment));
    }


    public String getNewsFeedId() {
        return newsFeedId;
    }

    public void setNewsFeedId(String newsFeedId) {
        this.newsFeedId = newsFeedId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getPostedBy() {
        return postedBy;
    }

    public void setPostedBy(User postedBy) {
        this.postedBy = postedBy;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public List<Vote> getVotes() {
        return votes;
    }

    public void setVotes(List<Vote> votes) {
        this.votes = votes;
    }

    @Override
    public String toString() {
        return "main.Feed{" +
                "newsFeedId='" + newsFeedId + '\'' +
                ", content='" + content + '\'' +
                ", postedBy=" + postedBy +
                ", createdOn=" + createdOn +
                ", comments=" + comments +
                ", votes=" + votes.toString() +
                ", random=" + random +
                '}';
    }
}
