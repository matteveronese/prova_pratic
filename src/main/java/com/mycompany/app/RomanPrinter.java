// prova pratica

package com.mycompany.app;

public class RomanPrinter {
  public static String print(int num){
    return printAsciiArt(IntegerToRoman.convert(num));
  }

  static char[] symbols = {'M', 'D', 'C', 'L', 'X', 'V', 'I'};
  static String[] asciiArt = {
            "  __  __  ",            " |  \\/  | ",            " | \\  / | ",            " | |\\/| | ",            " | |  | | ",            " |_|  |_| ",            "  _____   ",            " |  __ \\  ",            " | |  | | ",            " | |  | | ",            " | |__| | ",            " |_____/  ",            "   _____  ",            "  / ____| ",            " | |      ",            " | |      ",            " | |____  ",            "  \\_____| ",            "  _       ",            " | |      ",            " | |      ",            " | |      ",            " | |____  ",            " |______| ",            " __    __ ",            " \\ \\  / / ",            "  \\ \\/ /  ",            "   >  <   ",            "  / /\\ \\  ",            " /_/  \\_\\ ",            "__      __",            "\\ \\    / /",            " \\ \\  / / ",            "  \\ \\/ /  ",            "   \\  /   ",            "    \\/    ",            "  ______  ",            " |_    _| ",            "   |  |   ",            "   |  |   ",            "  _|  |_  ",            " |______| "
    
  };
  static int line_high = 6;

  private static String printAsciiArt(String romanNumber){
    String result = "";
    for (int i = 0; i < line_high; i++) {
      for (char c : romanNumber.toCharArray()) {
        int index = -1;
        for (int j = 0; j < symbols.length; j++)
          if (symbols[j] == c) {
            index = j;
            break;
          }
        if (index != -1)
          result += asciiArt[index * line_high + i];
      }
      result += "\n";
    }
    return result;
  }
}

