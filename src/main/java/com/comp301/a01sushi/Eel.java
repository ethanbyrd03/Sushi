package com.comp301.a01sushi;

public class Eel implements Ingredient {
  private String name;
  private double PricePerOunce;
  private int CaloriesPerOunce;
  private boolean IsVegetarian;
  private boolean HasRice;
  private boolean HasShellfish;

  public Eel() {
    this.name = "eel";
    this.PricePerOunce = 2.15;
    this.CaloriesPerOunce = 82;
    this.IsVegetarian = false;
    this.HasRice = false;
    this.HasShellfish = false;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public double getCaloriesPerDollar() {
    return (1 / this.PricePerOunce) * this.CaloriesPerOunce;
  }

  @Override
  public int getCaloriesPerOunce() {
    return this.CaloriesPerOunce;
  }

  @Override
  public double getPricePerOunce() {
    return this.PricePerOunce;
  }

  @Override
  public boolean getIsVegetarian() {
    return this.IsVegetarian;
  }

  @Override
  public boolean getIsRice() {
    return this.HasRice;
  }

  @Override
  public boolean getIsShellfish() {
    return this.HasShellfish;
  }

  @Override
  public boolean equals(Ingredient other) {
    if (other == null) {
      return false;
    }
    if (this.name == other.getName()) {
      if (this.PricePerOunce == other.getPricePerOunce()) {
        if (this.CaloriesPerOunce == other.getCaloriesPerOunce()) {
          if (this.IsVegetarian == other.getIsVegetarian()) {
            if (this.HasRice == other.getIsRice()) {
              if (this.HasShellfish == other.getIsShellfish()) {
                return true;
              }
            }
          }
        }
      }
    }
    return false;
  }
}
