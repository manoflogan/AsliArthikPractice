// Copyright 2020 ManOf Logan. All Rights Reserved.
package com.virtu.coding;

/**
 * See {@link Hexscore markdown}
 */
public class Hexscore {

  public String solution(String numberAsString) {
    int number = Integer.parseInt(numberAsString, 10);
    if (number < 0) {
      return "ERROR";
    }
    int calc = number;
    if (calc == 0) {
      return "O";
    }
    StringBuilder sb = new StringBuilder();
    while (calc > 0) {
      int rem = calc % 16;
      if (rem > 1 && rem < 10) {
        return "ERROR";
      }
      switch (rem) {
        case 0:
          sb.insert(0, "O");
          break;
        case 1:
          sb.insert(0, "I");
          break;
        case 10:
          sb.insert(0, "A");
          break;
        case 11:
          sb.insert(0, "B");
          break;
        case 12:
          sb.insert(0, "C");
          break;
        case 13:
          sb.insert(0, "D");
          break;
        case 14:
          sb.insert(0, "E");
          break;
        case 15:
          sb.insert(0, "F");
          break;
      }
      calc = calc / 16;
    }
    return sb.toString();
  }
}
