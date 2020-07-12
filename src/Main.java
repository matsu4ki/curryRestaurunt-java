import curry.option.FukugamiPickles;
import curry.option.Sweet;
import curry.option.VerySpicy;
import procedure.ChickenCurryCooking;
import procedure.KeemaCurryCooking;
import procedure.MuttonCurryCooking;

public class Main {
    public static void main(String[] args) {
        System.out.println("注文をどうぞ");

        // 注文
        var muttonCurryCooking = new MuttonCurryCooking();
        muttonCurryCooking.setCurry(new VerySpicy(muttonCurryCooking.getCurry()));
        var chickenCurryCooking = new ChickenCurryCooking();
        chickenCurryCooking.setCurry(new FukugamiPickles(new Sweet(chickenCurryCooking.getCurry())));
        var keemaCurryCooking = new KeemaCurryCooking();

        muttonCurryCooking.makeCurry();
        chickenCurryCooking.makeCurry();
        keemaCurryCooking.makeCurry();

        System.out.println("お客に持っていきました");
        System.out.println("==================");
        System.out.println("お会計");
        System.out.println(muttonCurryCooking.getCurry().getCurryName() + "は" + muttonCurryCooking.getCurry().howMuch() + "円");
        System.out.println(chickenCurryCooking.getCurry().getCurryName() + "は" + chickenCurryCooking.getCurry().howMuch() + "円");
        System.out.println(keemaCurryCooking.getCurry().getCurryName() + "は" + keemaCurryCooking.getCurry().howMuch() + "円");
    }
}
