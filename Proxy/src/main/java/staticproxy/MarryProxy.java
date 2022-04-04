package staticproxy;

public class MarryProxy implements Marry{
    private Marry target;

    public MarryProxy(Marry target) {
        this.target = target;
    }

    @Override
    public void HappyMarry() {
        befor();
        target.HappyMarry();
        after();
    }

    private void after() {
        System.out.println("after");
    }

    private void befor() {
        System.out.println("before");
    }
}
