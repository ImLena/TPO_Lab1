package domainModel;

import java.util.ArrayList;

public class Location {

    private Ford ford;
    private Arthur arthur;
    private final ArrayList<Staff> staff = new ArrayList<>();
    private boolean hasPeople = false;
    private boolean hasStaff = false;

    public Location() {
        initLocation();
    }

    public void initLocation() {
        if (!hasStaff) {
            addStaff();
            hasStaff = true;
        }
        if (!hasPeople) {
            ford = new Ford();
            arthur = new Arthur();
            hasPeople = true;
        }
    }

    public void makeStory(){
        if (ford.tryTakeFlacon()) {
            arthur.watch();
            if (!staff.isEmpty()) {
                arthur.setConfident(false);
                arthur.printWish();
                getStaff();
                ford.fordsDescription();
                arthurTryToSee();
            }
        }
    }

    private void arthurTryToSee(){
        if (ford.tryOffer() && !staff.isEmpty()) {
            arthur.wantToSee(new Staff("пакет кукурузных хлопьев", ""));
        }
    }

    private void addStaff() {
        staff.add(new Staff("нижним бельем ", "дентрасси"));
        staff.add(new Staff("матрацами", " скворншельскими "));
    }

    public void getStaff(){
        System.out.print("рядом с ");
        System.out.print(staff.get(0).getName() + staff.get(0).getManufacturer());
        System.out.print(",");
        System.out.print(staff.get(1).getManufacturer() + staff.get(1).getName());
    }

}
