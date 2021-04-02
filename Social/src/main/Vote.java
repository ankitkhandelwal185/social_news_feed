package main;

import java.util.Date;


public class Vote {
    private Long voteId;
    private Long newsFeedId;
    private VoteType voteType;
    private User votedBy;
    private Date createdOn;

    public Vote(VoteType voteType){
        this.voteType = voteType;
        this.createdOn = new Date();
    }

    @Override
    public String toString() {
        return "main.Vote{" +
                "voteId=" + voteId +
                ", newsFeedId=" + newsFeedId +
                ", voteType=" + voteType +
                ", votedBy=" + votedBy +
                ", createdOn=" + createdOn +
                '}';
    }
}
