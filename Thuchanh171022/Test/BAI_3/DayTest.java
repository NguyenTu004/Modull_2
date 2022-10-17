package BAI_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayTest {

    @Test
    void day() {
        int day = 28;
        int month = 2;
        int expected = 1;
         int result = Day.day(day, month);
         assertEquals(expected, result);
    }
}