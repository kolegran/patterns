package cake;

public class StrawberryCake extends Cake {
    public StrawberryCake() {
        this.description = "Strawberry Cake";
    }

    @Override
    public double cost() {
        return 200.5;
    }
}
