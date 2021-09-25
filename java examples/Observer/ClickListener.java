package Observer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton bc = (JButton) e.getSource();
        if (bc.getText().equals("Cliccato")) {
            bc.setText("Decliccato");
        } else {
            bc.setText("Cliccato");
        }
    }
}
