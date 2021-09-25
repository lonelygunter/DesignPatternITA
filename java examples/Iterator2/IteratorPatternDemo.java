package Iterator2;

public class IteratorPatternDemo {
    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        Iterator iterator = namesRepository.getIterator();
        while (iterator.hasNext()) {
            System.out.println("Nomi presenti nell'elenco: " + (String) iterator.next());
        }
        /**
         * quanto ti crei una repository puoi avrere un'interfaccia che mette a diposizione
         * iterator ed una tra hasnext e next. Nel repository deve avere gli attributti per
         * memeorizzare il repository e fare poi l'overide del get itarator e rendendo privata
         * name itartor e iplementando iterastor allora tiene pubbliche hasnext e next
         */ 
        
    }
}
