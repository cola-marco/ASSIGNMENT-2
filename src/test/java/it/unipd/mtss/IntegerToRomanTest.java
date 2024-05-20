////////////////////////////////////////////////////////////////////
// [Marco] [Cola] [2079237]
// [Davide] [Martinelli] [2077679]
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IntegerToRomanTest {

    //test dei numeri fuori dal range, zero, sotto 1 oppure oltre 3
    @Test(expected = IllegalArgumentException.class)
    public void overRangeThrowsIllegalArgumentException() {
        IntegerToRoman.convert(501);
    }

    @Test(expected = IllegalArgumentException.class)
    public void convert_0_IllegalArgumentException() {
        IntegerToRoman.convert(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void under_0_ThrowsIllegalArgumentException() {
        IntegerToRoman.convert(-1);
    }

    //primi 3 numeri
    @Test
    public void First3NumbersConversion() {
        assertEquals(IntegerToRoman.convert(1), "I");
        assertEquals(IntegerToRoman.convert(2), "II");
        assertEquals(IntegerToRoman.convert(3), "III");
    }

    //primi 6 numeri
    @Test
    public void First6NumbersConversion() {
        assertEquals(IntegerToRoman.convert(6), "VI");
    }

    //primi 10 numeri
    @Test
    public void First10NumbersConversion() {
        assertEquals(IntegerToRoman.convert(10), "X");
    }

    //primi 20 numeri
    @Test
    public void First20NumbersConversion() {
        assertEquals(IntegerToRoman.convert(20), "XX");
    }

    //primi 50 numeri
    @Test
    public void First50NumbersConversion(){
        assertEquals(IntegerToRoman.convert(50), "L");
    }

    //primi 100 numeri
    @Test
    public void First100NumbersConversion(){
        assertEquals(IntegerToRoman.convert(100), "C");
    }

    //primi 500 numeri
    @Test
    public void First500NumbersConversion(){
        assertEquals(IntegerToRoman.convert(500), "D");
    }
}