package edu.bsu.cs.model;

import java.time.Instant;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;


public final class TimeReport{
    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMdd");
    private Instant timestamp;


    /*
    public Revision timestamp(Instant timestamp) {
        return timestamp.format(dateTimeFormatter);
    }
     */

}
