package cake;

public class PeachCake extends Cake {
    public PeachCake() {
        this.description = "Peach Cake";
    }

    @Override
    public double cost() {
        return 100.0;
    }
}
