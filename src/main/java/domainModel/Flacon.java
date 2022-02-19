package domainModel;

public class Flacon {

    private String material;

    public boolean isHasFish() {
        return hasFish;
    }

    public void setHasFish(boolean hasFish) {
        this.hasFish = hasFish;
    }

    private boolean hasFish = false;

    public Flacon(String material) {
        this.material = material;
    }
    private Fish fish;

    public void getFlaconDescription() {
        System.out.print(material);
        System.out.print(" флакончик, в котором ");
        fish = new Fish();
        fish.fishActions();
        setHasFish(fish.getFishDescription());
    }
}
