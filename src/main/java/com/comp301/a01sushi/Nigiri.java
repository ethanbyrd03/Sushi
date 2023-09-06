package com.comp301.a01sushi;

import java.util.Map;

public class Nigiri implements Sushi{

    public enum NigiriType {TUNA, YELLOWTAIL, EEL, CRAB, SHRIMP}

    private IngredientPortion riceamt;
    private IngredientPortion amount;
    private Ingredient type;

    public Nigiri(NigiriType type) {
        this.riceamt = new RicePortion(0.5);
        if (type.name().equals("TUNA")) {
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
        return this.type.getName() + " nigiri";
    }

    @Override
    public IngredientPortion[] getIngredients() {
        IngredientPortion[] a = new IngredientPortion[2];
        a[0] = this.amount;
        a[1] = this.riceamt;
        return a;
    }

    @Override
    public int getCalories() {
        return (int) (Math.round(this.amount.getCalories()) + Math.round(this.riceamt.getCalories()));
    }

    @Override
    public double getCost() {
        return this.amount.getCost() + this.riceamt.getCost();
    }

    @Override
    public boolean getHasRice() {
        return (this.riceamt.getIsRice() || this.amount.getIsRice());
    }

    @Override
    public boolean getHasShellfish() {
        return (this.riceamt.getIsShellfish() || this.amount.getIsShellfish());
    }

    @Override
    public boolean getIsVegetarian() {
        return (this.riceamt.getIsVegetarian() || this.amount.getIsVegetarian());
    }
}
