package domainModel;

public class Arthur {

    private boolean isConfident = true;

    public void setConfident(boolean confident) {
        isConfident = confident;
    }

    public void watch(){
        System.out.print("Артур смотрел на него, ");
        blink();
    }

    public void blink(){
        System.out.print("моргая глазами.");
    }

    private String getWish(){
        return " простое и знакомое, за что можно было бы мысленно зацепиться.\n";
    }

    public void printWish(){
        if (!isConfident) {
            System.out.print(" Ему хотелось, чтобы здесь было что-нибудь");
            System.out.print(getWish());
            System.out.print("Он чувствовал бы себя увереннее, если бы ");
        }
    }

    public void wantToSee(Staff staff){
        System.out.println(" он увидел, к примеру, " + staff.getName() + staff.getManufacturer() + ".");
    }

}
