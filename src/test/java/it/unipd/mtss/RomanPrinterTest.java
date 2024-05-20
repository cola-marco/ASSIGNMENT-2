////////////////////////////////////////////////////////////////////
// [Marco] [Cola] [2079237]
// [Davide] [Martinelli] [2077679]
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RomanPrinterTest {

    //test ASCII I
    @Test
    public void TestI() {
        String one = RomanPrinter.print(1);
        assertEquals(" _____ \n"+
                "|_   _|\n"+
                "  | |  \n"+
                "  | |  \n"+
                " _| |_ \n"+
                "|_____|\n" , one);
    }
}