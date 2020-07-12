package procedure;

import curry.ChickenCurry;
import curry.Curry;
import curry.PlainCurry;

public final class ChickenCurryCooking extends CurryCooking {

    private Curry curry = new ChickenCurry(new PlainCurry());

    public Curry getCurry() {
        return this.curry;
    }

    public void setCurry(Curry curry) {
        this.curry = curry;
    }

    protected void arrangementCurry(Curry curry) {
        System.out.println("ひよこが書いてある皿に盛り付けます");
    }
}
