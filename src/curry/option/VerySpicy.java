package curry.option;

import curry.Curry;
import curry.enumlate.Flavor;

public class VerySpicy implements Curry {

    private Curry curry;

    public VerySpicy(Curry curry) {
        this.curry = curry;
    }

    public String chooseHotFlavor() {
        return Flavor.VERYSPICY.getJaName();
    }

    public String getCurryName() {
        return chooseHotFlavor() + "の" + curry.getCurryName();
    }

    public int howMuch() {
        return curry.howMuch() + 100;
    }

    public Curry getCurry() {
        return this.curry;
    }

}
