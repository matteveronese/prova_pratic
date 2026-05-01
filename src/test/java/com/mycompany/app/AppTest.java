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

    static int[] values = {1000, 500, 100, 50, 10, 5, 1};
    static char[] symbols = {'M', 'D', 'C', 'L', 'X', 'V', 'I'};
    static char[] subractives = {'C', 'X', 'I'};
    static int[] subractivesValues = {100, 10, 1};

    private void check(String str, int num) {
        int r = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int j = 0;
            for (; j < symbols.length; j++)
                if (symbols[j] == c) {
                    for (int k = 0; k < subractives.length; k++)
                        if (i > 0 && str.charAt(i - 1) == subractives[k] && values[j] - subractivesValues[k] > 0) {
                            r -= subractivesValues[k] * 2; // prima lo ho aggiunto senza guardare dopo...
                            break;
                        }

                    r += values[j];
                    break;
                }
            if (j == symbols.length)
                assertTrue("Invalid symbol: " + c, false);
        }
        assertTrue(r == num);
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
        check("III", 3);
        assertTrue("CCLIX".compareTo(IntegerToRoman.convert(259)) == 0);
        check("CCLIX", 259);
        assertTrue("XCII".compareTo(IntegerToRoman.convert(92)) == 0);
        assertTrue("LVIII".compareTo(IntegerToRoman.convert(58)) == 0);
        assertTrue("CMXCIV".compareTo(IntegerToRoman.convert(994)) == 0);
        assertTrue("MDCLXVI".compareTo(IntegerToRoman.convert(1666)) == 0);

        for (int i = 1; i < 1000; i++)
            check(IntegerToRoman.convert(i), i);
    }

    @Test
    public void printAsciiArt()
    {
        String str = "  __  __    _____      _____    _        __    __ __      __  ______  \n" + //
                        " |  \\/  |  |  __ \\    / ____|  | |       \\ \\  / / \\ \\    / / |_    _| \n" + //
                        " | \\  / |  | |  | |  | |       | |        \\ \\/ /   \\ \\  / /    |  |   \n" + //
                        " | |\\/| |  | |  | |  | |       | |         >  <     \\ \\/ /     |  |   \n" + //
                        " | |  | |  | |__| |  | |____   | |____    / /\\ \\     \\  /     _|  |_  \n" + //
                        " |_|  |_|  |_____/    \\_____|  |______|  /_/  \\_\\     \\/     |______| \n";
        assertTrue(str.compareTo(RomanPrinter.print(1666)) == 0);
        // 1666 fuori da 1000 ma comunque rappresentabile con M D C L X V I
    }
}
