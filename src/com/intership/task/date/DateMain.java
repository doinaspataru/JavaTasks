package com.intership.task.date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.GregorianCalendar;
import java.util.Locale;

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
        System.out.println(String.format("Departure from Sydney: %s", departure.format(format)));
        System.out.println(String.format("Arrival to LA: %s", arrival.format(format)));

        //TASK1
        System.out.println("Duration of the flight between Sydney: 11:15AM and Los Angeles: 06.00AM ");
        LocalDateTime leavingfromSDNY = LocalDateTime.of(2019, Month.NOVEMBER, 11, 11, 15);
        LocalDateTime departuretoLA = LocalDateTime.of(2019,Month.NOVEMBER,11, 6, 0,00);
        System.out.println("Duration of the flight is : "+ Duration.between(leavingfromSDNY, departuretoLA).toString().substring(3));

        //TASK2

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
        Calendar calendar = new GregorianCalendar(1977,4,25);
        int dayOfWeek  = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println(sdf.format(calendar.getTime()));
        System.out.println("dayOfWeek \t: " + dayOfWeek + " " + calendar.getDisplayName( Calendar.DAY_OF_WEEK ,Calendar.LONG, Locale.getDefault()));

        Calendar calendar1 = new GregorianCalendar(1977,4,26);
        Calendar calendar2 = new GregorianCalendar(1978,4,25);
        int countdays=1;
        while(calendar1.before(calendar2)){
            if((calendar1.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY) || (calendar1.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)){
                countdays++;
            }
            calendar1.add(Calendar.DATE,1);
        }
        System.out.println("number of sundays and saturdays between 2 dates"+countdays);
        System.out.println("In the first year the film was played: ");
        System.out.println("minutes " + countdays*120);
        System.out.println("hours " + countdays*120/60);
        System.out.println("days " + countdays*120/60/24) ;
    }
}


//TASK#1
//Frodo Baggins takes the plane from Sydney to Los Angeles. The flight starts at 11:15 AM local Sydney time
//and ends at 6:00 AM local LA time.class
//----> What is the duration of the flight?

//TASK#2
//Star Wars Episode IV was released on May 25, 1977 and has a running time of 120 minutes.
//Assume that it was played in cinemas on premiere (May 25, 1977) and then once a day on every Saturday and Sunday.
//----> What day of the week was it released?
//----> How many Total minutes/hours/days of playtime it summed up in the 1st year?

//BONUS
//Assume that it was also played on every February 29th and never on January 1st. Recalculate the above questions.