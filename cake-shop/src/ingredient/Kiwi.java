package ingredient;

import cake.Cake;
import decorator.IngredientDecorator;

public class Kiwi extends IngredientDecorator {
    private final Cake cake;

    public Kiwi(Cake cake) {
        this.cake = cake;
    }

    @Override
    public String getDescription() {
        return "Added Kiwi" + " to " + cake.getDescription();
    }

    @Override
    public double cost() {
        return 5.0 + cake.cost();
    }
}
