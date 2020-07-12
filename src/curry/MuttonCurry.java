package curry;

import curry.enumlate.CurryType;

public class MuttonCurry implements Curry {

    private Curry curry;

    public MuttonCurry(Curry curry) {
        this.curry = curry;
    }

    public String chooseHotFlavor() {
        return curry.chooseHotFlavor();
    }

    public String getCurryName() {
        return CurryType.Mutton.getJaName() + curry.getCurryName();
    }

    public int howMuch() {
        return curry.howMuch() + 200;
    }

    public Curry getCurry() {
        return this.curry;
    }

}
