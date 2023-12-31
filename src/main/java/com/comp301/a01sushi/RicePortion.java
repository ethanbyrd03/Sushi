package com.comp301.a01sushi;

public class RicePortion implements IngredientPortion {
  private double amount;

  public RicePortion(double amt) {
    if (amt < 0) {
      throw new IllegalArgumentException("amount given is invalid");
    }
    this.amount = amt;
  }

  public void setAmount(double amt) {
    this.amount = amt;
  }

  @Override
  public Ingredient getIngredient() {
    return new Rice();
  }

  @Override
  public double getAmount() {
    return this.amount;
  }

  @Override
  public String getName() {
    return this.getIngredient().getName();
  }

  @Override
  public boolean getIsVegetarian() {
    return this.getIngredient().getIsVegetarian();
  }

  @Override
  public boolean getIsRice() {
    return this.getIngredient().getIsRice();
  }

  @Override
  public boolean getIsShellfish() {
    return this.getIngredient().getIsShellfish();
  }

  @Override
  public double getCalories() {
    return this.amount * this.getIngredient().getCaloriesPerOunce();
  }

  @Override
  public double getCost() {
    return this.amount * this.getIngredient().getPricePerOunce();
  }

  @Override
  public IngredientPortion combine(IngredientPortion other) {
    if (other == null) {
      return this;
    }
    if (other.getIngredient().getName() != this.getIngredient().getName()) {
      throw new IllegalArgumentException();
    }
    this.amount += other.getAmount();
    return this;
  }
}
