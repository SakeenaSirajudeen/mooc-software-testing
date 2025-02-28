package tudelft.roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RomanNumeralTestWithBeforeEach {

private RomanNumeral roman;

    @BeforeEach
    void initialize () {
        this.roman = new RomanNumeral();
    }
    @Test
    void singleNumber () {
        int result = roman.convert("I");
        Assertions.assertEquals(1, result);
    }

    @Test
    void numberWithManyDigits () {
        int result = roman.convert("VIII");
        Assertions.assertEquals(8, result);
    }

    @Test
    void numberWithSubtractiveNotation () {
        int result = roman.convert("IV");
        Assertions.assertEquals(4, result);
    }

    @Test
    void numberWithAndWithoutSubtractiveNotation () {
        int result = roman.convert("KLIV");
        Assertions.assertEquals(44, result);
    }
}
