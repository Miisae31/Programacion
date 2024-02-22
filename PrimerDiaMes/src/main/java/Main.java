import java.time.LocalDate;
//import java.time.Period;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;


public class Main {
        public static void main(String[] args) {
            LocalDateTime now = LocalDateTime.now();
            LocalDateTime endOfYear = LocalDateTime.of(now.getYear(), 12, 31, 23, 59, 59);

            long monthsLeft = ChronoUnit.MONTHS.between(now, endOfYear);
            now = now.plusMonths(monthsLeft);

            long daysLeft = ChronoUnit.DAYS.between(now, endOfYear);
            now = now.plusDays(daysLeft);

            long hoursLeft = ChronoUnit.HOURS.between(now, endOfYear);
            now = now.plusHours(hoursLeft);

            long minutesLeft = ChronoUnit.MINUTES.between(now, endOfYear);
            now = now.plusMinutes(minutesLeft);

            long secondsLeft = ChronoUnit.SECONDS.between(now, endOfYear);

            System.out.println(monthsLeft + " months left, " + daysLeft + " days left, " + hoursLeft + " hours left, " + minutesLeft + " minutes left, " + secondsLeft + " seconds left");
        }
    }

