package BinarySystemTests;

import System_dwojkowy.BinarySystem;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySystemTest {

    private BinarySystem binarySystem;

    @Before
    public void setUp(){
        binarySystem = new BinarySystem();
    }

    @Test
    public void shouldAllowToMakeBinaryToDecimalSmallNumber(){
        binarySystem.binaryToDecimal("10101");

        long expected = 21;

        assertEquals(expected, binarySystem.getDecimal());
    }

    @Test
    public void shouldAllowToBinaryToDecimalBigNumber(){
        binarySystem.binaryToDecimal("1111011");

        long expected = 123;

        assertEquals(expected, binarySystem.getDecimal());
    }

    @Test
    public void shouldAllowToMakeBinaryToDecimalZero(){
        binarySystem.binaryToDecimal("0");

        long expected = 0;

        assertEquals(expected, binarySystem.getDecimal());
    }

    @Test
    public void shouldAllowToMakeBinaryToDecimalOne(){
        binarySystem.binaryToDecimal("1");

        long expected = 1;

        assertEquals(expected, binarySystem.getDecimal());
    }

    @Test
    public void shouldAllowToMakeBinaryToDecimalTwo(){
        binarySystem.binaryToDecimal("10");

        long expected = 2;

        assertEquals(expected, binarySystem.getDecimal());
    }

    @Test (expected = IllegalArgumentException.class)
    public void shouldNotAllowToMakeBinaryToDecimalMinusLowNumb(){
        binarySystem.binaryToDecimal("-1");
    }

    @Test (expected = IllegalArgumentException.class)
    public void shouldNotAllowToMakeBinaryToDecimalMinusHighNumber(){
        binarySystem.binaryToDecimal("-345");
    }

    @Test
    public void shouldAllowToMakeDecimalToBinarySmallNumber(){
        binarySystem.decimalToBinary(21);

        long expected = 10101;

        assertEquals(expected, binarySystem.getBinary());
    }

    @Test
    public void shouldAllowToDecimalToBinaryBigNumber(){
        binarySystem.decimalToBinary(123);

        long expected = 1111011;

        assertEquals(expected, binarySystem.getBinary());
    }

    @Test
    public void shouldAllowToMakeDecimalToBinaryZero(){
        binarySystem.decimalToBinary(0);

        long expected = 0;

        assertEquals(expected, binarySystem.getBinary());
    }

    @Test
    public void shouldAllowToMakeDecimalToBinaryOne(){
        binarySystem.decimalToBinary(1);

        long expected = 1;

        assertEquals(expected, binarySystem.getBinary());
    }

    @Test
    public void shouldAllowToMakeDecimalToBinaryTwo(){
        binarySystem.decimalToBinary(2);

        long expected = 10;

        assertEquals(expected, binarySystem.getBinary());
    }

    @Test (expected = IllegalArgumentException.class)
    public void shouldNotAllowToMakeDecimalToBinaryMinusLow(){
        binarySystem.decimalToBinary(-1);
    }

    @Test (expected = IllegalArgumentException.class)
    public void shouldNotAllowToMakeDecimalToBinaryMinusHigh(){
        binarySystem.decimalToBinary(-123);
    }
}