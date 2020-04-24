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
public class BoxWeightTest {

  private BoxWeight boxWeight;

  @BeforeMethod
  public void setUp() {
    boxWeight = new BoxWeight();
  }

  @AfterMethod
  public void tearDown() {
    boxWeight = null;
  }

  @Test
  public void testSolution1() {
    MatcherAssert.assertThat(boxWeight.solution(new int[] {4650, 150, 150}), Matchers.is(2));
  }

  @Test
  public void testSolution2() {
    MatcherAssert.assertThat(boxWeight.solution(new int[] {4850, 100, 30, 30, 100, 50, 100}),
        Matchers.is(3));
  }
}
