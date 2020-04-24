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
public class IdenticalSubstringsTest {

  private IdenticalSubstrings identicalSubstrings;

  @BeforeMethod
  public void setUp() {
    identicalSubstrings = new IdenticalSubstrings();
  }

  @AfterMethod
  public void tearDown() {
    identicalSubstrings = null;
  }

  @Test
  public void testSolution1() {
    MatcherAssert.assertThat(identicalSubstrings.solution("zzzyz"), Matchers.is(8));
  }

  @Test
  public void testSolution2() {
    MatcherAssert.assertThat(identicalSubstrings.solution("k"), Matchers.is(1));
  }
}
