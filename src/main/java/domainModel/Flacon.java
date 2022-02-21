package domainModel;

public class Flacon {

    private final String material;
    private boolean hasFish = false;

    public boolean isHasFish() {
        return hasFish;
    }

    public void setHasFish(boolean hasFish) {
        this.hasFish = hasFish;
    }

    public Flacon(String material) {
        this.material = material;
    }

    public void getFlaconDescription() {
        System.out.print(material);
        System.out.print(" флакончик, в котором ");
        Fish fish = new Fish();
        fish.fishActions();
        setHasFish(fish.getFishDescription());
    }
}
