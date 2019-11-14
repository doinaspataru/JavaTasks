package com.intership.task.date;

import java.time.*;
import java.time.format.DateTimeFormatter;
public class DateMain {

    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        LocalTime currentTimeInChisinau = LocalTime.now(ZoneId
                .of("Europe/Chisinau"));
        System.out.println(String.format("Now in CHISINAU is %s",
                currentTimeInChisinau));

        ZoneId leavingZone = ZoneId.of("Australia/Sydney");
        ZoneId arrivingZone = ZoneId.of("America/Los_Angeles");

        LocalDateTime leaving = LocalDateTime.of(2019, Month.NOVEMBER, 11, 11, 15);
        ZonedDateTime departure = ZonedDateTime.of(leaving, leavingZone);

        ZonedDateTime arrival = departure.withZoneSameInstant(arrivingZone)
                .plusHours(11).plusMinutes(51);

        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-d  HH:mm");
        System.out
                .println(String.format("Departure from Sydney: %s", departure.format(format)));
        System.out.println(String.format("Arrival to LA: %s", arrival.format(format)));
        System.out.println("Duration of the flight between Sydney: 11:15AM and Los Angeles: 06.00AM ");
        LocalDateTime leavingfromSDNY = LocalDateTime.of(2019, Month.NOVEMBER, 11, 11, 15);
        LocalDateTime departuretoLA = LocalDateTime.of(2019,Month.NOVEMBER,11, 6, 0,00);
        System.out.println("Duration of the flight is : "+ Duration.between(leavingfromSDNY, departuretoLA).toString().substring(3));


    }
}