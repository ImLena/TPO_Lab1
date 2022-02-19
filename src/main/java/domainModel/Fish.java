package domainModel;

public class Fish {

    public boolean getFishDescription() {
        System.out.print("маленькая желтая рыбка.\n");
        return true;
    }

    public void fishActions(){
        swim();
        shimmer();
    }

    private void swim() {
        System.out.print("плавала, ");
    }

    private void shimmer() {
        System.out.print("переливаясь, ");
    }
}
