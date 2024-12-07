package com.klef.jfsd.exam.model;

public class Comment {

    private int postId;
    private String name;
    private String body;

    public Comment(int postId, String name, String body) {
        this.postId = postId;
        this.name = name;
        this.body = body;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
