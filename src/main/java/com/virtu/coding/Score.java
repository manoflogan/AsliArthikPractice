// Copyright 2020 ManOf Logan. All Rights Reserved.
package com.virtu.coding;

/**
 *
 */
public class Score {

  public int[] solution(int[] A) {
    if (A == null || A.length < 3) {
      return A;
    }

    int[] output = new int[A.length];
    System.arraycopy(A, 0, output, 0, A.length);
    while(true) {
      boolean increaseChanges = false;
      boolean decreaseChanges = false;
      for (int i = 1; i < (A.length - 1); i++) {
        if (A[i] < A[i - 1] && A[i] < A[i + 1]) {
          output[i] = A[i] + 1;
          increaseChanges = true;
        } else if (A[i] > A[i - 1] && A[i] > A[i + 1]) {
          output[i] = A[i] - 1;
          decreaseChanges = true;
        }
      }
      if (!increaseChanges && !decreaseChanges) {
        break;
      }
      A = output;
    }
    return output;
  }
}
