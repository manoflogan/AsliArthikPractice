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
public class HexscoreTest {

  private Hexscore hexscore;

  @BeforeMethod
  public void setUp() {
    hexscore = new Hexscore();
  }

  @AfterMethod
  public void tearDown() {
    hexscore = null;
  }

  @Test
  public void testSolution1() {
    MatcherAssert.assertThat(hexscore.solution("257"), Matchers.is("IOI"));
  }

  @Test
  public void testSolution2() {
    MatcherAssert.assertThat(hexscore.solution("3"), Matchers.is("ERROR"));
  }

  @Test
  public void testSolution3() {
    MatcherAssert.assertThat(hexscore.solution("0"), Matchers.is("O"));
  }

  @Test
  public void testSolution4() {
    MatcherAssert.assertThat(hexscore.solution("1"), Matchers.is("I"));
  }
}
