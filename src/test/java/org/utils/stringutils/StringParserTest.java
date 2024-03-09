package org.utils.stringutils;

import org.junit.jupiter.api.Test;
import org.utils.exceptions.InvalidStringInputException;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

// rightClick StringParser -> Generate Test -> Select Method
class StringParserTest {

    // 3 part format
    // methodBeingTested_conditionToTest_expectedOutcome
    @Test
    void splitString_oneSeparator_expectTwoParts() throws InvalidStringInputException {
        // setup lines
        StringParser sp = new StringParser();
        String inputString = "Hell|NO";
        String separator = "\\|"; // "\\" escapes the meaning of |
        ArrayList<String> stringParts = sp.splitString(inputString, separator);

        // actual test
        assertEquals(2, stringParts.size());
    }

    @Test
    void splitString_nullString_expectException() {
        // setup lines
        StringParser sp = new StringParser();
        String inputString = null;
        String separator = "\\|"; // "\\" escapes the meaning of |
        // ArrayList<String> stringParts = sp.splitString(inputString, separator);

        // actual test
        // assertEquals(2, 0); // doesn't work

        assertThrows(InvalidStringInputException.class, // expect Expectation
                () -> sp.splitString(inputString, separator));
    }
}
