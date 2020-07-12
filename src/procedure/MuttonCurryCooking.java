package procedure;

import curry.Curry;
import curry.MuttonCurry;
import curry.PlainCurry;

public final class MuttonCurryCooking extends CurryCooking {

    private Curry curry = new MuttonCurry(new PlainCurry());

    public Curry getCurry() {
        return this.curry;
    }

    public void setCurry(Curry curry) {
        this.curry = curry;
    }

    protected void arrangementCurry(Curry curry) {
        System.out.println("羊の絵が書いてある皿に盛り付けます");
    }
}
