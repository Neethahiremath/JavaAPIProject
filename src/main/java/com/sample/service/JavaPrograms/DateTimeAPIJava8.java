package com.sample.service.JavaPrograms;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;
import java.util.Set;

public class DateTimeAPIJava8 {

    public static void main(String[] args) {

        //Instance
        Instant instant = Instant.now();
        System.out.println(instant);
        Instant instant1 = Instant.now();

        System.out.println(instant1);

        //Duration amount of time between 2 instance
        Duration duration = Duration.between(instant,instant1);

        System.out.println(duration);

        //Methods used to get duration in millis,nanos, etc

        System.out.println(duration.toMillis());
        System.out.println(duration.toNanos());
        System.out.println(duration.toMinutes());
        System.out.println(duration.toDays());

        //LocalDate

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        LocalDate local = LocalDate.of(2018, Month.JUNE, 27);
        System.out.println(local);
        LocalDate date = LocalDate.of(2018, 7, 27);
        System.out.println(date);

        //Period is the amount of time between two local date

         Period period = Period.between(local,date);
        System.out.println(period.getMonths());
        System.out.println(period.get(ChronoUnit.DAYS));

        //TemporalAdjusters
        // adjuster for local Date or Instance using TemporalAdjusters
        System.out.println(localDate.with(TemporalAdjusters.firstDayOfMonth()));
        System.out.println(localDate.with(TemporalAdjusters.next(DayOfWeek.SUNDAY)));

        //Local Time
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime.plusHours(8));

        //ZonedTime
        Set<String> zoneId = ZoneId.getAvailableZoneIds();
        System.out.println(zoneId);

        System.out.println(ZoneId.of("Asia/Pontianak"));

        //ZonedDateTime
        ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDate.now(),LocalTime.now(),ZoneId.of("Asia/Pontianak"));
        System.out.println(zonedDateTime);

        //Format Date Time using DateTimeFormatter

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_DATE_TIME;
        System.out.println(localDate.format(DateTimeFormatter.BASIC_ISO_DATE));

        //Legacy API to New API

        Date convertInstanceToDate = Date.from(instant);
        System.out.println(convertInstanceToDate);

        Instant convertDateToInstance = convertInstanceToDate.toInstant();
        System.out.println(convertDateToInstance);

    }
}
