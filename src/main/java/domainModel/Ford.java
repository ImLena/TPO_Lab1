package domainModel;

public class Ford {
    private Flacon flacon;

    private boolean hasFlacon = false;

    public boolean tryTakeFlacon() {
        if (!hasFlacon) {
            takeFlacon();
            return true;
        } else {
            return false;
        }
    }

    private void takeFlacon() {
        flacon = new Flacon("стеклянный");
        System.out.print("У Форда в руке был ");
        flacon.getFlaconDescription();
        hasFlacon = true;
    }

    public void fordsDescription() {
        System.out.print(" и человеком с Бетельгейзе,\n" );
    }
    public boolean tryOffer(){
        if (hasFlacon) {
            System.out.print("держащим маленькую рыбку");
            getOffer();
            return true;
        } else {
            return false;
        }
    }

    private void getOffer(){
        System.out.print(" и предлагающим засунуть ее в ухо,");
    }

}
