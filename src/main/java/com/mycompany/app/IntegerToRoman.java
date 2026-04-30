// prova pratica

package com.mycompany.app;

public class IntegerToRoman {

  static int[] values = {1000, 500, 100, 50, 10, 5, 1};
  static char[] symbols = {'M', 'D', 'C', 'L', 'X', 'V', 'I'};
  static char[] subractives = {'C', 'X', 'I'};
  static int[] subractivesValues = {100, 10, 1};
  static int len = values.length;

  public static String convert(int number){
    String result = "";

    int i = 0;
    while (number != 0) {
      
      if (i >= len)
        break; // problema...
      
      while (number >= values[i]) {
        result += symbols[i];
        number -= values[i];
        continue;
      }
      

      for (int j = 0; j < subractives.length; j++) {
        if (values[i] - subractivesValues[j] > 0 && values[i] - subractivesValues[j] <= number) {
          result += subractives[j];
          result += symbols[i];
          number -= (values[i] - subractivesValues[j]);
          break;
        }
      }

      i++;
    }

    return result;
  }
}

