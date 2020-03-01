package ingredient;

import cake.Cake;
import decorator.IngredientDecorator;

public class Cream extends IngredientDecorator {
    private final Cake cake;

    public Cream(Cake cake) {
        this.cake = cake;
    }

    @Override
    public String getDescription() {
        return "Added Cream" + " to " + cake.getDescription();
    }

    @Override
    public double cost() {
        return 10.0 + cake.cost();
    }
}
