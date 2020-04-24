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
public class FibonacciTest {
  private Fibonacci fibonacci;

  @BeforeMethod
  public void setUp() {
    this.fibonacci = new Fibonacci();
  }

  @AfterMethod
  public void tearDown() {
    this.fibonacci = null;
  }

  @Test
  public void testSolution() {
    MatcherAssert.assertThat(fibonacci.solution(13), Matchers.is(0));
  }

  @Test
  public void testSolution1() {
    MatcherAssert.assertThat(fibonacci.solution(15), Matchers.is(2));
  }

  @Test
  public void testSolution2() {
    MatcherAssert.assertThat(fibonacci.solution(18), Matchers.is(3));
  }
}
