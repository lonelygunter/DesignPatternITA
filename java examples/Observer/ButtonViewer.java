package Observer;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;

public class ButtonViewer {
    public static void main(String[] args) {
        /** 
         * Creazione del frame e del pulsante
         */  
        JFrame f = new JFrame();
        JButton b = new JButton("Decliccato");

        /** 
         * Si aggiunge al frame il pulsante
         */ 
        f.add(b);

        /** 
         * Creazione di un Ascoltatore di Azioni
         *  per andare a notificare i cambiamenti alla view
         */
        ActionListener al = new ClickListener();

        /**    !!! PARTE IMPORTANTE PER L'OBSERVER !!!
         * Si aggiunge al pulsante l'ActionListener
         *  in modo che i due siano collegati
         */
        b.addActionListener(al);

        /**
         * Setting del frame
         */
        f.setSize(300, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
