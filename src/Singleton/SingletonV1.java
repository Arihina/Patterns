package Singleton;

public class SingletonV1 {
    private static SingletonV1 singleton;

    private SingletonV1() {

    }

    public static SingletonV1 getSingleton() {
        if (singleton == null) {
            singleton = new SingletonV1();
        }
        return singleton;
    }
}
