package com.company;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RoundZeroTest {
    @Test
    public void testcases () {

        RoundZero round = new RoundZero();
        float actual_result = round.RoundUp(RoundZeroTestData.roundtest1);
        assertEquals(RoundZeroTestData.expectedresult1, actual_result);
         actual_result = round.RoundUp(RoundZeroTestData.roundtest2);
        assertEquals(RoundZeroTestData.expectedresult2, actual_result);
         actual_result = round.RoundUp(RoundZeroTestData.roundtest3);
        assertEquals(RoundZeroTestData.expectedresult1, actual_result);
        actual_result = round.RoundUp(RoundZeroTestData.roundtest4);
        assertEquals(RoundZeroTestData.expectedresult3, actual_result);

        actual_result = round.RoundDown(RoundZeroTestData.roundtest1);
        assertEquals(RoundZeroTestData.expectedresult1, actual_result);
        actual_result = round.RoundDown(RoundZeroTestData.roundtest2);
        assertEquals(RoundZeroTestData.expectedresult2, actual_result);
        actual_result = round.RoundDown(RoundZeroTestData.roundtest4);
        assertEquals(RoundZeroTestData.expectedresult3, actual_result);
        actual_result = round.RoundDown(RoundZeroTestData.roundtest1);
        assertEquals(RoundZeroTestData.expectedresult1, actual_result);
        actual_result = round.RoundDown(RoundZeroTestData.roundtest3);
        assertEquals(RoundZeroTestData.expectedresult2, actual_result);

        actual_result = round.Round(RoundZeroTestData.roundtest3);
        assertEquals(RoundZeroTestData.expectedresult1, actual_result);
        actual_result = round.Round(RoundZeroTestData.roundtest5);
        assertEquals(RoundZeroTestData.expectedresult2, actual_result);
        actual_result = round.Round(RoundZeroTestData.roundtest4);
        assertEquals(RoundZeroTestData.expectedresult3, actual_result);




    }
}
