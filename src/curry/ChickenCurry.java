package curry;

import curry.enumlate.CurryType;

public class ChickenCurry implements Curry {

    private Curry curry;

    public ChickenCurry(Curry curry) {
        this.curry = curry;
    }

    public String chooseHotFlavor() {
        return curry.chooseHotFlavor();
    }

    public String getCurryName() {
        return CurryType.Chicken.getJaName() + curry.getCurryName();
    }

    public int howMuch() {
        return curry.howMuch() + 100;
    }

    public Curry getCurry() {
        return this.curry;
    }

}
