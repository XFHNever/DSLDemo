package com.stubhub.never.internaldsl.expressionbuilder;

/**
 * Created by fuxie on 2014/8/25  13:45.
 */
public class DSLTest {
    public static void main(String arg[]) {
        Calendar calendar = new Calendar();
        calendar.add("DSL tutorial")
                .on(2014, 8,25)
                .from("09:00")
                .to("14:00")
                .at("GC");
        calendar.add("Test Expression builder")
                .on(2014, 7,25)
                .from("09:00")
                .to("14:00")
                .at("NJU");

    }
}
