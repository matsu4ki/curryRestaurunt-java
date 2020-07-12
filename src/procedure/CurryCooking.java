package procedure;

import curry.Curry;
import curry.PlainCurry;

public abstract class CurryCooking {

    private Curry curry = new PlainCurry();

    private void preparetion() {
        System.out.println("野菜を炒めます");
    }

    private void useCurryRoux(Curry curry) {
        System.out.println(curry.chooseHotFlavor() + "のルーを入れます");
    }

    protected void arrangementCurry(Curry curry) {
        System.out.println("普通の皿に盛り付けます");
    }

    private Curry chooseCurry() {
        return this.getCurry();
    }

    public final void makeCurry() {
        Curry curry = this.chooseCurry();
        System.out.println(curry.getCurryName() + "を作ります");
        this.preparetion();
        this.useCurryRoux(curry);
        this.arrangementCurry(curry);
    }

    public Curry getCurry() {
        return this.curry;
    }

    public void setCurry(Curry curry) {
        this.curry = curry;
    }
}
