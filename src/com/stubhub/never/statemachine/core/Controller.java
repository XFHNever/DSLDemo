package com.stubhub.never.statemachine.core;

/**
 * Created by fuxie on 2014/7/18  13:46.
 */
public class Controller {
    private State currentState;
    private StateMachine machine;

    private CommandChannel commandChannel;

    public Controller(State currentState, StateMachine machine, CommandChannel commandChannel) {
        this.currentState = currentState;
        this.machine = machine;
        this.commandChannel = commandChannel;
    }

    public void handle(String eventCode) {
        if (currentState.hasTransition(eventCode)) {
            transitionTo(currentState.targetState(eventCode));
        } else if (machine.isResetEvent(eventCode)){
            transitionTo(machine.getStart());
        }
    }
    private void transitionTo(State state) {
        currentState = state;
        currentState.executeActions(commandChannel);
        System.out.println("CurrentState: " + currentState.getName());
    }
}
