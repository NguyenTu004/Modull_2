import java.time.LocalDate;
import java.time.Period;

public class test {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        Period period = Period.between(date, LocalDate.of(2022, 10, 10));
        System.out.println(period.getDays());
    }
}
