package lesson32;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

@Test
    public void givenRadius1_WhenFindArea_ThenReturnArea3_14() {
        double actualArea = Circle.findArea(1d);
       // double expectedArea = 3.14;
        double expectedArea=Math.PI;

        assertEquals(expectedArea,actualArea);
    }


}