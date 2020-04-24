// Copyright 2020 ManOf Logan. All Rights Reserved.
package com.virtu.coding;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 */
public class ScoreTest {
  private Score score;

  @BeforeMethod
  public void setUp() {
    score = new Score();
  }

  @AfterMethod
  public void tearDown() {
    score = null;
  }

  @Test
  public void testSolution1() {
    MatcherAssert.assertThat(score.solution(new int[] {1, 6, 3, 4, 3, 5}),
        Matchers.is(new int[] {1, 4, 4, 4, 4, 5}));
  }

  @Test
  public void testSolution2() {
    MatcherAssert.assertThat(score.solution(new int[] {100, 50, 40, 30}),
        Matchers.is(new int[]  {100, 50, 40, 30}));
  }
}
