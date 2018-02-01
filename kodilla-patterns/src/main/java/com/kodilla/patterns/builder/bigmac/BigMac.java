package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class BigMac {

    private boolean rollWithSesame;
    private int burgers;
    private String sauce;
    private List<String> ingredients;

    public static class BigMacBuilder{
        private boolean rollWithSesame;
        private int burgers;
        private String sauce = "no sauce";
        private List<String> ingredients = new ArrayList<>();

        public static final String SAUCE_STANDARD = "SAUCE_STANDARD";
        public static final String SAUCE_1000_ISLANDS = "SAUCE_1000_ISLANDS";
        public static final String SAUCE_BARBECUE = "SAUCE_BARBECUE";
        public static final String INGREDIENT_SALAD = "SALAD";
        public static final String INGREDIENT_ONION = "ONION";
        public static final String INGREDIENT_BACON = "BACON";
        public static final String INGREDIENT_CUCUMBER = "CUCUMBER";
        public static final String INGREDIENT_CHILI = "CHILI";
        public static final String INGREDIENT_MUSHROOMS = "MUSHROOMS";
        public static final String INGREDIENT_SCHRIMPS = "SCHRIMPS";
        public static final String INGREDIENT_CHEESEE = "CHEESEE";

        public BigMacBuilder rollWithSesame(boolean rollWithSesame){
            this.rollWithSesame = rollWithSesame;
            return this;
        }
        public BigMacBuilder burgers(int quantity){
            this.burgers = quantity;
            return this;
        }
        public BigMacBuilder sauce(String sauce){
            switch (sauce){
                case SAUCE_1000_ISLANDS:
                    this.sauce = "1000 Islands sauce";
                    return this;
                case SAUCE_BARBECUE:
                    this.sauce = "Barbeque sauce";
                    return this;
                case SAUCE_STANDARD:
                    this.sauce = "Standard sauce";
                    return this;
                default:
                    this.sauce = "no sauce";
                    return this;
            }
        }
        public BigMacBuilder ingredient(String ingredient) {
            switch(ingredient){
                case INGREDIENT_BACON:
                    ingredients.add(INGREDIENT_BACON);
                    return this;
                case INGREDIENT_CHEESEE:
                    ingredients.add(INGREDIENT_CHEESEE);
                    return this;
                case INGREDIENT_CHILI:
                    ingredients.add(INGREDIENT_CHILI);
                    return this;
                case INGREDIENT_CUCUMBER:
                    ingredients.add(INGREDIENT_CUCUMBER);
                    return this;
                case INGREDIENT_MUSHROOMS:
                    ingredients.add(INGREDIENT_MUSHROOMS);
                    return this;
                case INGREDIENT_ONION:
                    ingredients.add(INGREDIENT_ONION);
                    return this;
                case INGREDIENT_SALAD:
                    ingredients.add(INGREDIENT_SALAD);
                    return this;
                case INGREDIENT_SCHRIMPS:
                    ingredients.add(INGREDIENT_SCHRIMPS);
                    return this;
                default:
                    ingredients.add("default stuff");
                    return this;
            }



        }
        public BigMac prepare(){
            return new BigMac(rollWithSesame, burgers, sauce, ingredients);
        }
    }
    private BigMac(boolean rollWithSesame, int burgers, String sauce, List<String> ingredients){
        this.rollWithSesame = rollWithSesame;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
        this.ingredients.add("default stuff");
    }

    @Override
    public String toString() {
        return "BigMac{" +
                "rollWithSesame=" + rollWithSesame +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
