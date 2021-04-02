package main;

import java.util.Date;

public class Comment {
    private Long commentId;
    private Long newsFeedId;
    private String commentText;
    private User commentedBy;
    private Date createdOn;

    public Comment(String comment){
        this.commentText = comment;
        this.createdOn = new Date();
    }

    @Override
    public String toString() {
        return "main.Comment{" +
                "commentId=" + commentId +
                ", newsFeedId=" + newsFeedId +
                ", commentText='" + commentText + '\'' +
                ", commentedBy=" + commentedBy +
                ", createdOn=" + createdOn +
                '}';
    }
}
