package com.office.entity;

public class Post {
    private Integer postId;

    private String postName;

    private Integer postAuthority;

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName == null ? null : postName.trim();
    }

    public Integer getPostAuthority() {
        return postAuthority;
    }

    public void setPostAuthority(Integer postAuthority) {
        this.postAuthority = postAuthority;
    }
}