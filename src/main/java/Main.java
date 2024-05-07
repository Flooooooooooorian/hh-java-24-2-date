import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {

        Instant instant = Instant.now();
        ZonedDateTime zonedDateTime =  ZonedDateTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();


        System.out.println(instant);
        System.out.println(zonedDateTime);
        System.out.println(localDateTime);

        ZonedDateTime zonedDateTime1 = instant.atZone(ZoneId.systemDefault());
        LocalDateTime localDateTime1 = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());

        System.out.println(zonedDateTime1);
        System.out.println(localDateTime1);

        System.out.println(localDateTime1.plusDays(1));
        System.out.println(localDateTime1.withYear(2025));

        System.out.println(ChronoUnit.MINUTES.between(localDateTime1, localDateTime.plusDays(58)));

//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
//
//        System.out.println(localDateTime1.format(formatter));
    }
}
