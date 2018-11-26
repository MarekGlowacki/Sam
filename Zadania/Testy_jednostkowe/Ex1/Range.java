package Testy_jednostkowe.Ex1;

import org.junit.Assert;
import org.junit.Test;

public class Range {

    public static void main(String[] args) {



    }


    private final long lowerBound;
    private final long upperBound;

    public Range(long lowerBound, long upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    public boolean isInRange(long number) {
        return number >= lowerBound && number <= upperBound;
    }



}

