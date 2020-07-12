package curry.option;

import curry.Curry;
import curry.enumlate.Flavor;

public class Regular implements Curry {

    private Curry curry;

    public Regular(Curry curry) {
        this.curry = curry;
    }

    public String chooseHotFlavor() {
        return Flavor.REGULAR.getJaName();
    }

    public String getCurryName() {
        return chooseHotFlavor() + "の" + curry.getCurryName();
    }

    public int howMuch() {
        return curry.howMuch();
    }

    public Curry getCurry() {
        return this.curry;
    }

}
