package saifedine.week11_weekend2_calendar.marcel;

import java.time.Clock;

public class Calendar_time {

    public static void main(String[] args) {

        // Eine Uhr, die mir immer die aktuelle Zeit angibt
        Clock c = Clock.systemDefaultZone();
        System.out.println(c.instant());
        System.out.println(c.instant());
        System.out.println(c.instant());
        System.out.println(c.instant());
        System.out.println(c.instant());
        System.out.println(c.instant());


        //Instant i = Instant.parse("15.10.2022");






    }
}
