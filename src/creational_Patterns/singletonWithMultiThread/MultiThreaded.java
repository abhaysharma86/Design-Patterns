package creational_Patterns.singletonWithMultiThread;

public class MultiThreaded {
    // Private Static Variable: because of only hold single object
    private static volatile MultiThreaded object = null;

    // Private Constructor: because of no any one create object aut side of class.
    private MultiThreaded() {

    }

    // Public Static Method: Global Access point return or provided the class of object
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
