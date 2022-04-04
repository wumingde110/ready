package threadvolatile;

public class DoubleCheck {
    private DoubleCheck() {
    }

    private static volatile DoubleCheck doubleCheck = null;

    public static DoubleCheck getInstance() {
        if (doubleCheck == null) {
            synchronized (DoubleCheck.class) {
                doubleCheck = new DoubleCheck();
            }
        }
        return doubleCheck;
    }
}
