package homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DateOperationTest {

    @Test
    void getAge() {
        assertEquals(36, DateOperation.getAge("25/05/1987"));
        assertEquals(36, DateOperation.getAge("1987-05-25"));
    }

    @Test
    void sortStringDates() {
        String[] dates = {"2000-12-01", "10/12/2000", "1970-08-12", "2010-10-05"};
        String[] expected = {"1970-08-12", " 2000-12-01", "10/12/2000", "2010-10-05"};
        String[] actual = DateOperation.sortStringDates(dates);
        assertArrayEquals(expected, actual);
    }
}