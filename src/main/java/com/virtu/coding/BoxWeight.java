// Copyright 2020 ManOf Logan. All Rights Reserved.
package com.virtu.coding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * See {@link Boxweight.png}
 */
public class BoxWeight {
  public int solution(int[] A) {
    if (A == null || A.length == 0) {
      return 0;
    }
    List<Integer> weights = new ArrayList<>();
    for (int i = 1; i < A.length; i++) {
      weights.add(A[i]);
    }
    Collections.sort(weights);
    findCombinations(new Stack<>(),  weights, 0, 5000 - A[0]);
    return maxSolution;
  }

  int maxSolution = Integer.MIN_VALUE;

  void findCombinations(Stack<Integer> tempStack,
      List<Integer> weights, int index, int target) {
    if (target < 0 || weights.size() == index) {
      if (target < 0) {
        maxSolution = Math.max(maxSolution, tempStack.size() - 1);
      } else {
        maxSolution = Math.max(maxSolution, tempStack.size());
      }
      return;
    }
    for (int i = index; i < weights.size(); i++) {
      int weight = weights.get(i);
      tempStack.push(weight);
      findCombinations(tempStack, weights, index + 1, target - weight);
      tempStack.pop(); // Last one did not fit.
    }
  }

}
