package curry.enumlate;


public enum CurryType {

    Mutton("羊"),
    Keema("キーマ"),
    Chicken("チキン");

    private final String jaName;

    CurryType(String jaName) {
        this.jaName = jaName;
    }

    public String getJaName() {
        return jaName;
    }
}
