import java.time.LocalDate;

public class DateUtils {
    public static boolean isNowBetween(LocalDate currentDate,LocalDate startingDate, LocalDate endingDate) {
        return isDateBetween(currentDate, startingDate, endingDate, false);
    }

    private static boolean isDateBetween(LocalDate currentDate, LocalDate startingDate, LocalDate endingDate, boolean inclusive) {
        return (currentDate.isAfter(startingDate)
                &&
                currentDate.isBefore(endingDate)
        );
    }

    public static boolean isDateOutside(LocalDate date, LocalDate startingDate, LocalDate endingDate){
        return !isNowBetween(date, startingDate, endingDate);
    }
}