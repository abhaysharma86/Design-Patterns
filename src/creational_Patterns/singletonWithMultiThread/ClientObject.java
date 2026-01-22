package creational_Patterns.singletonWithMultiThread;

public class ClientObject {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            MultiThreaded obj1 = MultiThreaded.getInstance();
            System.out.println("Object HashCode Value Obj1 : " + obj1.hashCode());
        });

        Thread t2 = new Thread(()->{
            MultiThreaded obj2 = MultiThreaded.getInstance();
            System.out.println("Object HashCode Value Obj2 : " + obj2.hashCode());
        });
        t1.start();
        t2.start();
    }
}
