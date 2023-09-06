package com.comp301.a01sushi;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/** Unit test for simple App. */
public class AppTest {
  /** Rigorous Test :-) */

  @Test
  public void shouldAnswerWithTrue() {
    assertTrue(true);
  }
  @Test
  public void typename() {
    IngredientPortion a = new AvocadoPortion(0.5);
    System.out.println(a.getCalories());
  }

}
