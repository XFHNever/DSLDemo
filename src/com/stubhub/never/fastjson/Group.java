package com.stubhub.never.fastjson;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fuxie on 2014/8/11  11:45.
 */
public class Group {
    private String name;
    private Long id;
    private List<User> users = new ArrayList<User>();

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

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
