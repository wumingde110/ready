package staticproxy;

public class Zhu {
    public static void main(String[] args){
        PersonOne personOne=new PersonOne();
        MarryProxy marryProxy=new MarryProxy(personOne);
        marryProxy.HappyMarry();
    }
}
