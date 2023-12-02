package Singleton;

public class SingletonV3 {
    private static volatile SingletonV3 singleton;

    private SingletonV3(){

    }

    public static SingletonV3 getSingleton() {
        if (singleton == null) {
            synchronized (SingletonV3.class){
                if (singleton == null){
                    singleton = new SingletonV3();
                }
            }
        }

        return singleton;
    }
}
