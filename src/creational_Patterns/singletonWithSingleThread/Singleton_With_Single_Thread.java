package creational_Patterns.singletonWithSingleThread;

public class Singleton_With_Single_Thread {
    private static Singleton_With_Single_Thread object = null;

    private Singleton_With_Single_Thread() {

    }

    public static Singleton_With_Single_Thread getInstance() {
        if (object == null) {
            object = new Singleton_With_Single_Thread();
            return object;
        }
        return object;
    }
}
