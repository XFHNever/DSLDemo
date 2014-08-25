package com.stubhub.never.fastjson;

import com.alibaba.fastjson.JSON;

/**
 * Created by fuxie on 2014/8/11  11:44.
 */
public class FastJsonTest {
    public static void main(String arg[]) {
        User guestUser = new User(2L, "guest");
        User rootUser = new User(3L, "root");

        Group group = new Group();
        group.setId(0L);
        group.setName("admin");
        group.getUsers().add(guestUser);
        group.getUsers().add(rootUser);

        String jsonString  = JSON.toJSONString(group);

        System.out.println("=====Encode=====");
        System.out.println(jsonString);

        System.out.println("Decode");
        String str = "{\"id\":0,\"name\":\"admin\",\"users\":[{\"id\":2,\"name\":\"guest\"},{\"id\":3,\"name\":\"root\"}]}";
        Group group_decode = JSON.parseObject(str, Group.class);

        System.out.println("id: " + group_decode.getId() + " name: " + group_decode.getName());

    }

}
