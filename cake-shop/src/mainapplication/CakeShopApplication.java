package mainapplication;

import cake.Cake;
import cake.PeachCake;
import cake.StrawberryCake;
import ingredient.Banana;
import ingredient.Cream;
import ingredient.Kiwi;

public class CakeShopApplication {

    public static void main(String[] args) {
        Cake strawberryCake = new StrawberryCake();
        strawberryCake = new Banana(strawberryCake);
        strawberryCake = new Kiwi(strawberryCake);
        System.out.println(strawberryCake.cost());

        Cake peachCake = new PeachCake();
        peachCake = new Cream(peachCake);
        System.out.println(peachCake.cost());
    }
}
