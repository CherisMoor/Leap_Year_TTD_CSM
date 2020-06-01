import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LeapYearTest {

    @Test
    public void whenYearIsDivisibleBy4() {
        LeapYear leapyear = new LeapYear();
        assertEquals(true, leapyear.leapYearCheck(1996));
        assertEquals(false, leapyear.leapYearCheck(2001));
        assertEquals(true, leapyear.leapYearCheck(2000));
        assertEquals(false, leapyear.leapYearCheck(1900));
        assertEquals(true, leapyear.leapYearCheck(2020));
    }

    @Test
    public void whenYearIsDivisibleBy400() {
        LeapYear leapyear = new LeapYear();
        assertEquals(true, leapyear.leapYearCheck(1996));
        assertEquals(false, leapyear.leapYearCheck(2001));
        assertEquals(true, leapyear.leapYearCheck(2000));
        assertEquals(false, leapyear.leapYearCheck(1900));
        assertEquals(true, leapyear.leapYearCheck(2020));
    }

    @Test
    public void whenYearCannotBeDivisibleBy100() {
        LeapYear leapyear = new LeapYear();
        assertEquals(true, leapyear.leapYearCheck(1996));
        assertEquals(false, leapyear.leapYearCheck(2001));
        assertEquals(true, leapyear.leapYearCheck(2000));
        assertEquals(false, leapyear.leapYearCheck(1900));
        assertEquals(true, leapyear.leapYearCheck(2020));
    }
}