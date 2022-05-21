import java.time.LocalDate;
import java.time.LocalTime;

public class Today_Date_10699 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalTime present = LocalTime.now();
        if (present.getHour() < 15)
            System.out.println(today);
        else
            System.out.println(today.plusDays(1));
    }
}
