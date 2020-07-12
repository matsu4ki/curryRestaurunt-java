package curry.option;

import curry.Curry;
import curry.enumlate.Flavor;

public class Spicy implements Curry {

    private Curry curry;

    public Spicy(Curry curry) {
        this.curry = curry;
    }

    public String chooseHotFlavor() {
        return Flavor.SPICY.getJaName();
    }

    public String getCurryName() {
        return chooseHotFlavor() + "の" + curry.getCurryName();
    }

    public int howMuch() {
        return curry.howMuch() + 20;
    }

    public Curry getCurry() {
        return this.curry;
    }

}
