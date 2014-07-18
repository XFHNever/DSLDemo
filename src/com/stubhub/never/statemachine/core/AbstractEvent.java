package com.stubhub.never.statemachine.core;

/**
 * Created by fuxie on 2014/7/18  13:17.
 */
public abstract class AbstractEvent {
    private String name;
    private String code;

    protected AbstractEvent(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }
}
