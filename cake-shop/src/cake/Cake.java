package cake;

public abstract class Cake {
    protected String description;

    public Cake() {
        this.description = "Abstract cake";
    }

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
