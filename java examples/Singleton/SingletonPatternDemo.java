package Singleton;

public class SingletonPatternDemo {
    public static void main(String[] args) {
        SingleObject so = SingleObject.getInstance();

        so.showMessage("puppe");
    }
}
