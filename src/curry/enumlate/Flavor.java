package curry.enumlate;

public enum Flavor {

    VERYSPICY("辛口"),
    SPICY("中辛"),
    REGULAR("普通"),
    SWEET("甘口");

    private final String jaName;

    Flavor(String jaName) {
        this.jaName = jaName;
    }

    public String getJaName() {
        return jaName;
    }
}
