package Basics_Built_In_Function;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
public class TimeZoneDisplay {
    public static void main(String[] args) {
        ZoneId gmtzone=ZoneId.of("GMT");
        ZoneId istZone=ZoneId.of("Asia/Kolkata");
        ZoneId pstZone=ZoneId.of("America/Los_Angeles");

        ZonedDateTime gmtTime=ZonedDateTime.now(gmtzone);
        ZonedDateTime pstTime=ZonedDateTime.now(pstZone);
        ZonedDateTime istTime=ZonedDateTime.now(istZone);

        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        System.out.println("GMT:"+gmtTime.format(formatter));
        System.out.println("PST:"+pstTime.format(formatter));
        System.out.println("IST:"+istTime.format(formatter));
    }
}
