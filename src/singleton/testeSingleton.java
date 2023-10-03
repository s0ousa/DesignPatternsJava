package singleton;

public class testeSingleton {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        var singleton2 = Singleton.getInstance();

        System.out.println(singleton);
        System.out.println(singleton2);
    }
}
