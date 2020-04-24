package com.virtu.coding;// Copyright 2020 ManOf Logan. All Rights Reserved.


/**
 * See image titled com.virtu.coding.Fibonacci
 */
// 0, 1, 1, 2, 3, 5, 8, 13, 21
public class Fibonacci {

  public int solution(int number) {
    if (number < 0) {
      return 0;
    }
    if (number == 1 || number == 2) {
      return 0;
    }
    int first = 0;
    int second = 1;
    while (true) {
      int sum = first + second;
      if (sum >= number) {
        return Math.min(Math.abs(sum - number), Math.abs(number - second));
      }
      first = second;
      second = sum;
    }
  }
}
