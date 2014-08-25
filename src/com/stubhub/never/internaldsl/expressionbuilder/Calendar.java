package com.stubhub.never.internaldsl.expressionbuilder;

import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fuxie on 2014/8/25  13:29.
 */
public class Calendar {
    private List<Event> events = new ArrayList<Event>();

    public Event add(String name) {
        Event newEvent = new Event(name);
        events.add(newEvent);
        return  newEvent;
    }
}

class Event {
    private String name, location;
    private LocalDate date;
    private LocalTime startTime, endTime;

    public Event(String name) {
        this.name = name;
    }

    public Event on(int year, int month, int day) {
        this.date = new LocalDate(year, month, day);
        return this;
    }

    public Event from (String startTime) {
        this.startTime =parseTime(startTime);
        return this;
    }
    public Event to (String endTime) {
        this.endTime = parseTime(endTime);
        return this;
    }
    private LocalTime parseTime(String time) {
        final DateTimeFormatter fmt = ISODateTimeFormat.hourMinute();
        return new LocalTime(fmt.parseDateTime(time));
    }
    public Event at(String location) {
        this.location = location;
        return this;
    }
}
