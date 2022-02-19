package domainModel;

public class Staff {
    private String name;
    private String manufacturer;

    public Staff(String name, String manufacturer) {
        this.name = name;
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
