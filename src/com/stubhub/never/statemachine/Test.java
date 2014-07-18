package com.stubhub.never.statemachine;

import com.stubhub.never.statemachine.core.Controller;

/**
 * Created by fuxie on 2014/7/18  15:52.
 */
public class Test {
    public static void main(String args[]) {
        GrantSample sample = new GrantSample();
        Controller controller = sample.getController();

        controller.handle("D1CL");
        //controller.handle("D1OP");
        controller.handle("D2OP");
        controller.handle("L1ON");
        controller.handle("PNCL");
    }
}
