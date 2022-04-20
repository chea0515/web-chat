package com.ccfond.webchat.core.entity;

import com.baomidou.mybatisplus.annotation.TableName;

/**
 * @author chea0515@163.com
 */
@TableName("tb_user")
public class User {

    /**
     * id
     */
    private String id;

    /**
     * username
     */
    private String username;

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
