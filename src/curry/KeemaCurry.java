package curry;

import curry.enumlate.CurryType;

public class KeemaCurry implements Curry {

    private Curry curry;

    public KeemaCurry(Curry curry) {
        this.curry = curry;
    }

    public String chooseHotFlavor() {
        return curry.chooseHotFlavor();
    }

    public String getCurryName() {
        return CurryType.Keema.getJaName() + curry.getCurryName();
    }

    public int howMuch() {
        return curry.howMuch() + 50;
    }

    public Curry getCurry() {
        return this.curry;
    }

}
