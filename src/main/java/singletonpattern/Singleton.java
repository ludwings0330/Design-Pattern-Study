package singletonpattern;

public class Singleton {
    public static volatile Singleton uniqueInstance;
    //public static Singleton uniqueInstance = new Singleton();

    private Singleton() {
    }

//    public static synchronized Singleton getInstance() {
//        if (uniqueInstance == null) {
//            uniqueInstance = new Singleton();
//        }
//
//        return uniqueInstance;
//    }
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }

        return uniqueInstance;
    }
}
