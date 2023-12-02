package Singleton;

public class SingletonV2 {
    private static SingletonV2 singleton;

    private SingletonV2() {

    }

    public static synchronized SingletonV2 getSingleton() {
        if (singleton == null) {
            singleton = new SingletonV2();
        }
        return singleton;
    }
}
