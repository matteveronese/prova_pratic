package com.mycompany.app;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void convert()
    {
        // I V X L C D M
        assertTrue("I".compareTo(IntegerToRoman.convert(1)) == 0);
        assertTrue("V".compareTo(IntegerToRoman.convert(5)) == 0);
        assertTrue("X".compareTo(IntegerToRoman.convert(10)) == 0);
        assertTrue("L".compareTo(IntegerToRoman.convert(50)) == 0);
        assertTrue("C".compareTo(IntegerToRoman.convert(100)) == 0);
        assertTrue("D".compareTo(IntegerToRoman.convert(500)) == 0);
        assertTrue("M".compareTo(IntegerToRoman.convert(1000)) == 0);
        
        assertTrue("III".compareTo(IntegerToRoman.convert(3)) == 0);
        assertTrue("CCLIX".compareTo(IntegerToRoman.convert(259)) == 0);
        assertTrue("XCII".compareTo(IntegerToRoman.convert(92)) == 0);
        assertTrue("LVIII".compareTo(IntegerToRoman.convert(58)) == 0);
        assertTrue("CMXCIV".compareTo(IntegerToRoman.convert(994)) == 0);
        
    }

    @Test
    public void printAsciiArt()
    {
        String str = "  __  __    _____      _____    _        __    __ __      __  ______  \r\n" + //
                        " |  \\/  |  |  __ \\    / ____|  | |       \\ \\  / / \\ \\    / / |_    _| \r\n" + //
                        " | \\  / |  | |  | |  | |       | |        \\ \\/ /   \\ \\  / /    |  |   \r\n" + //
                        " | |\\/| |  | |  | |  | |       | |         >  <     \\ \\/ /     |  |   \r\n" + //
                        " | |  | |  | |__| |  | |____   | |____    / /\\ \\     \\  /     _|  |_  \r\n" + //
                        " |_|  |_|  |_____/    \\_____|  |______|  /_/  \\_\\     \\/     |______| \r\n";
        assertTrue(str.compareTo(RomanPrinter.print(1666)) == 0);
        // 1666 fuori da 1000 ma comunque rappresentabile con M D C L X V I
    }
}
