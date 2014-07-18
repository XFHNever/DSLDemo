package com.stubhub.never.statemachine.core;

/**
 * Created by fuxie on 2014/7/18  13:26.
 */
public class Transition {
    private State source;
    private State target;
    private Event trigger;

    public Transition(State source, State target, Event trigger) {
        this.source = source;
        this.target = target;
        this.trigger = trigger;
    }

    public State getSource() {
        return source;
    }

    public State getTarget() {
        return target;
    }

    public Event getTrigger() {
        return trigger;
    }

    public String getEventCode() {
        return trigger.getCode();
    }
}
