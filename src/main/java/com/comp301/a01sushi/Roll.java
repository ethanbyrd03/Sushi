package com.comp301.a01sushi;

public class Roll implements Sushi{

    private String name;
    private IngredientPortion[] ingredients;

    public Roll(String name, IngredientPortion[] roll_ingredients){
        this.name = name;
        if (roll_ingredients == null) {throw new IllegalArgumentException("list of ingredient portions is empty");}
        for (int num = 0; num < roll_ingredients.length; num++) {
            if (roll_ingredients[num] == null) {
                throw new IllegalArgumentException("some ingredient portions in the list are empty");
            }
        }
        IngredientPortion[] a = roll_ingredients.clone();
        int s = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i].getName().equals("seaweed")) {
                if (a[i].getAmount() != 0.1) {
                    double b = 0.1 - a[i].getAmount();
                    a[i].combine(new SeaweedPortion(b));
                    s++;
                }
            }

        }
        if (s == 0) {IngredientPortion[] b = new IngredientPortion[a.length + 1];
            for (int i = 0; i <a.length; i++) {b[i] = a[i];}
        b[b.length - 1] = new SeaweedPortion(0.1);
        a = b;}
        this.ingredients = a;
    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public IngredientPortion[] getIngredients() {
        return this.ingredients;
    }

    @Override
    public int getCalories() {
        int a = 0;
        for (int i = 0; i < this.ingredients.length; i++) {
            a += this.ingredients[i].getCalories();
        }
        return a;
    }

    @Override
    public double getCost() {
        double a = 0.00;
        for (int i = 0; i < this.ingredients.length; i++) {
            a += this.ingredients[i].getCost();
        }
        double aa = a * 100;
        double ab = Math.round(aa);
        return ab/100;
    }

    @Override
    public boolean getHasRice() {
        for (int i = 0; i < this.ingredients.length; i++) {
            if (this.ingredients[i].getIsRice() == true) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean getHasShellfish() {
        for (int i = 0; i < this.ingredients.length; i++) {
            if (this.ingredients[i].getIsShellfish() == true) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean getIsVegetarian() {
        for (int i = 0; i< this.ingredients.length; i++) {
            if (this.ingredients[i].getIsVegetarian() == false) {
                return false;
            }
        }
        return true;
    }
}
