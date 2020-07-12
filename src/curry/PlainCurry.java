package curry;

import curry.enumlate.Flavor;

public class PlainCurry implements Curry {

    private String name = "カレー";
    private int price = 100;

    public String chooseHotFlavor() {
        return Flavor.REGULAR.getJaName();
    }

    public String getCurryName() {
        return name;
    }

    public int howMuch() {
        return price;
    }
}
