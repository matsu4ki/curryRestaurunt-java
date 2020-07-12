package procedure;

import curry.Curry;
import curry.KeemaCurry;
import curry.PlainCurry;

public final class KeemaCurryCooking extends CurryCooking {

    private Curry curry = new KeemaCurry(new PlainCurry());

    public Curry getCurry() {
        return this.curry;
    }

    public void setCurry(Curry curry) {
        this.curry = curry;
    }
}
