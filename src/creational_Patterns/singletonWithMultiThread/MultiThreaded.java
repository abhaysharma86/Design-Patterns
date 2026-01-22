package creational_Patterns.singletonWithMultiThread;

public class MultiThreaded {
    private static volatile MultiThreaded object = null;

    private MultiThreaded() {

    }

    public static MultiThreaded getInstance() {
        if (object == null) {
            synchronized (MultiThreaded.class) {
                if (object == null) {
                    object = new MultiThreaded();
                }
            }
        }
        return object;
    }

}
