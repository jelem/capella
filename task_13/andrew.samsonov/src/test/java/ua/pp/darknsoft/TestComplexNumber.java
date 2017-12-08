package ua.pp.darknsoft;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Andrew on 08.12.2017.
 */
public class TestComplexNumber {
    private static final ComplexNumber COMPLEX_NUMBER_ADDITION = new ComplexNumber(2, -4);
    private static final ComplexNumber COMPLEX_NUMBER_SUBTRACTION = new ComplexNumber(8, -8);
    private static final ComplexNumber COMPLEX_NUMBER_MULTIPLICATION = new ComplexNumber(-5, -1);
    private static final ComplexNumber COMPLEX_NUMBER_DIVISION = new ComplexNumber(-3.0 / 2.0, -1.0 / 2.0);
    private static final ComplexNumber[] COMPLEX_NUMBERS_SQRT_04 = {
            new ComplexNumber(Math.sqrt(2) / 2, Math.sqrt(2) / 2),
            new ComplexNumber(-Math.sqrt(2) / 2, Math.sqrt(2) / 2),
            new ComplexNumber(-Math.sqrt(2) / 2, -Math.sqrt(2) / 2),
            new ComplexNumber(Math.sqrt(2) / 2, -Math.sqrt(2) / 2)
    };

    @Test
    public void additionTest01() {
        ComplexNumber aComplex = new ComplexNumber(5, -6);
        ComplexNumber bComplex = new ComplexNumber(-3, 2);
        ComplexNumber actual = aComplex.addition(bComplex);
        assertThat(actual, is(COMPLEX_NUMBER_ADDITION));

    }

    @Test
    public void subtractionTest01() {
        ComplexNumber aComplex = new ComplexNumber(5, -6);
        ComplexNumber bComplex = new ComplexNumber(-3, 2);
        ComplexNumber actual = aComplex.subtraction(bComplex);
        assertThat(actual, is(COMPLEX_NUMBER_SUBTRACTION));


    }

    @Test
    public void multiplicationTest01() {
        ComplexNumber aComplex = new ComplexNumber(2, 3);
        ComplexNumber bComplex = new ComplexNumber(-1, 1);
        ComplexNumber actual = aComplex.multiplication(bComplex);
        assertThat(actual, is(COMPLEX_NUMBER_MULTIPLICATION));


    }

    @Test
    public void divisionTest01() {
        ComplexNumber aComplex = new ComplexNumber(-2, 1);
        ComplexNumber bComplex = new ComplexNumber(1, -1);
        ComplexNumber actual = aComplex.division(bComplex);
        assertThat(actual, is(COMPLEX_NUMBER_DIVISION));


    }

    @Test
    public void extractionOfARootTest01() {
        ComplexNumber aComplex = new ComplexNumber(-1, 0);
        ComplexNumber[] actual = aComplex.extractionOfARoot(4);
        assertThat(actual, is(COMPLEX_NUMBERS_SQRT_04));
    }
}
