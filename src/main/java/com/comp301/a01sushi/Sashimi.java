package com.comp301.a01sushi;

public class Sashimi implements Sushi{

    public enum SashimiType {TUNA, YELLOWTAIL, EEL, CRAB, SHRIMP;}

    private IngredientPortion amount;
    private Ingredient type;

    public Sashimi(SashimiType type) {
        if (type.name() == "TUNA") {
            this.type = new Tuna();
            this.amount = new TunaPortion(0.75);
            }
        if (type.name() == "YELLOWTAIL") {
            this.type = new Yellowtail();
            this.amount = new YellowtailPortion(0.75);
        }
        if (type.name() == "EEL") {
            this.type = new Eel();
            this.amount = new EelPortion(0.75);
        }
        if (type.name() == "CRAB") {
            this.type = new Crab();
            this.amount = new CrabPortion(0.75);
        }
        if (type.name() == "SHRIMP") {
            this.type = new Shrimp();
            this.amount = new ShrimpPortion(0.75);
        }
        }
    @Override
    public String getName() {
        return this.type.getName() + " sashimi";
    }

    @Override
    public IngredientPortion[] getIngredients() {
        IngredientPortion[] a = new IngredientPortion[50];
        a[0] = this.amount;
        return a;
    }

    @Override
    public int getCalories() {
        return (int) this.amount.getCalories();
    }

    @Override
    public double getCost() {
        return this.amount.getCost();
    }

    @Override
    public boolean getHasRice() {
        return this.type.getIsRice();
    }

    @Override
    public boolean getHasShellfish() {
        return this.type.getIsShellfish();
    }

    @Override
    public boolean getIsVegetarian() {
        return this.type.getIsVegetarian();
    }
}
