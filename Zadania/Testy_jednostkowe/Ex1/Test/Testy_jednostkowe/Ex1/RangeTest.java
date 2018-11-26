package Testy_jednostkowe.Ex1;

import org.junit.*;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.*;


public class RangeTest {


    @Test
    public void test1() {
        Range range = new Range(3, 29);
        Assert.assertTrue(range.isInRange(10));

    }

    @Test
    public void test2() {
        Range range = new Range(3, 29);
        Assert.assertTrue(range.isInRange(3));
    }

    @Test
    public void test3() {
        Range rane = new Range(3, 29);
        Assert.assertTrue(rane.isInRange(29));
    }

    @Test
    public void test4(){
        Range range = new Range(3, 29);
        Assert.assertFalse(range.isInRange(-10));
    }

    @Test
    public void test5(){
        Range range = new Range(3, 29);
        Assert.assertFalse(range.isInRange(40));
    }
}