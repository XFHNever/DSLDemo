package com.stubhub.never.statemachine.core;

import java.util.*;

/**
 * Created by fuxie on 2014/7/18  13:25.
 */
public class State {
    private String name;
    private List<Command> actions = new ArrayList<Command>();
    private Map<String, Transition> transitions = new HashMap<String, Transition>();

    public State(String name) {
        this.name = name;
    }

    public void addTransition(Event event, State targetState) {
        assert null != targetState;
        transitions.put(event.getCode(), new Transition(this,targetState,event));
    }

    public void addAction(Command command) {
        actions.add(command);
    }

    public Collection<State> getAllTargets() {
        List<State> result = new ArrayList<State>();
        for(Transition t : transitions.values()) {
            result.add(t.getTarget());
        }
        return result;
    }

    public boolean hasTransition(String eventCode) {
        return transitions.containsKey(eventCode);
    }

    public State targetState(String eventCode) {
        return transitions.get(eventCode).getTarget();
    }

    public void executeActions(CommandChannel commandChannel) {
        for (Command c : actions) {
            commandChannel.send(c.getCode());
        }
    }

    public String getName() {
        return name;
    }
}
