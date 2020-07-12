package curry.option;

import curry.Curry;
import curry.enumlate.Flavor;

public class Sweet implements Curry {

    private Curry curry;

    public Sweet(Curry curry) {
        this.curry = curry;
    }

    public String chooseHotFlavor() {
        return Flavor.SWEET.getJaName();
    }

    public String getCurryName() {
        return chooseHotFlavor() + "の" + curry.getCurryName();
    }

    public int howMuch() {
        return curry.howMuch() + 50;
    }

    public Curry getCurry() {
        return this.curry;
    }

}
