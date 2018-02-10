package Pattern;

public class Test {
    public static void main(String[] args) {
        Singleton ref = Singleton.instance;
        Singleton1 ref1 = Singleton1.getInstance();
        System.out.println(ref1);
        System.out.println(ref);
    }
}
