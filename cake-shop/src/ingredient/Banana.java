package ingredient;

import cake.Cake;
import decorator.IngredientDecorator;

public class Banana extends IngredientDecorator {
    private final Cake cake;

    public Banana(Cake cake) {
        this.cake = cake;
    }

    @Override
    public String getDescription() {
        return "Added Cream" + " to " + cake.getDescription();
    }

    @Override
    public double cost() {
        return 10.5 + cake.cost();
    }
}
