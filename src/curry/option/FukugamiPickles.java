package curry.option;

import curry.Curry;

public class FukugamiPickles implements Curry {

    private Curry curry;

    public FukugamiPickles(Curry curry) {
        this.curry = curry;
    }

    public String chooseHotFlavor() {
        return curry.chooseHotFlavor();
    }

    public String getCurryName() {
        return curry.getCurryName() + "で福神漬け付き";
    }

    public int howMuch() {
        return curry.howMuch() + 150;
    }

    public Curry getCurry() {
        return this.curry;
    }

}
