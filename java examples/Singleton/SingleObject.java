package Singleton;

public class SingleObject {
    private static SingleObject instance = new SingleObject();

    private SingleObject (){

    }

    public static SingleObject getInstance() {
         return instance;
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}
