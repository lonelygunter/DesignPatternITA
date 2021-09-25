package Iterator;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListDemo {
    public static void main(String[] args) {
        LinkedList<String> persone = new LinkedList<>();

        persone.addLast("Luigi");
        persone.addLast("Mario");
        persone.addLast("Giulia");
        persone.addLast("Aurora");

        ListIterator<String> i = persone.listIterator();
        i.next();
        i.next();

        i.add("Marco");
        i.add("Elisa");

        i.next();
        i.remove();

        System.out.println(persone);
    }
}
