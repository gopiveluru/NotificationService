package com.thinkConstructive.postservice;

public class Posts {
    private String postId;
    private String postDescription;

    public Posts(String postId, String postDescription) {
        this.postId = postId;
        this.postDescription = postDescription;
    }

    public Posts() {
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getPostDescription() {
        return postDescription;
    }

    public void setPostDescription(String postDescription) {
        this.postDescription = postDescription;
    }
}
