package creational_Patterns.singletonWithSingleThread;

public class ClientObject {
    public static void main(String[] args) {
        Singleton_With_Single_Thread obj1 = Singleton_With_Single_Thread.getInstance();
        Singleton_With_Single_Thread obj2 = Singleton_With_Single_Thread.getInstance();
        Singleton_With_Single_Thread obj3 = Singleton_With_Single_Thread.getInstance();

        System.out.println("Object hashCode value obj1 : " + obj1.hashCode());
        System.out.println("Object hashCode value obj2 : " + obj2.hashCode());
        System.out.println("Object hashCode value obj3 : " + obj3.hashCode());

    }
}


/*
* This all object hashCode value are same:
  Object hashCode value obj1 : 1595428806
  Object hashCode value obj2 : 1595428806
  Object hashCode value obj3 : 1595428806
* */