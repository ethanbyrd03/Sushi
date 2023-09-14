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
    IngredientPortion[] a = new IngredientPortion[2];
    a[0] = new RicePortion(0.5);
    a[1] = new AvocadoPortion(0.3);
    Roll b = new Roll("dragon", a);
    System.out.println(b.getName());
    System.out.println(b.getCost());
    System.out.println(b.getIsVegetarian());
    System.out.println(b.getCalories());
    System.out.println(b.getIngredients().length);
  }

}
