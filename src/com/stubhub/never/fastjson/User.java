package com.stubhub.never.fastjson;

/**
 * Created by fuxie on 2014/8/11  11:44.
 */
public class User {

    private String name;
    private Long id;

    public User(Long id, String name) {
        this.id = id;
        this.name = name;
    }
    public User() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
