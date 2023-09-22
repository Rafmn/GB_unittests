package seminars.third.hw;

import org.junit.jupiter.api.Test;

import seminars.third.hw.MainHW;

import static org.junit.jupiter.api.Assertions.*;
import static seminars.third.hw.MainHW.evenOddNumber;
import static seminars.third.hw.MainHW.numberInInterval;

public class SeveralTests {
    @Test
    public void testEven() {
        int m = 5;
        assertEquals(evenOddNumber(m), false);
    }

    @Test
    public void testInterval() {
        int m = 55;
        assertEquals(numberInInterval(m), true);
    }
}
