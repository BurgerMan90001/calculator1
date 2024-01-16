package button;



import javax.swing.*;
import java.awt.*;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class SearchTextBox extends JTextField implements KeyListener {
    public SearchTextBox() {

        setBounds(45,100,300,40);
        setBackground(new Color(61, 132, 189));
        setBorder(BorderFactory.createLineBorder(new Color(22, 84, 126)));
        addKeyListener(this);

        setVisible(false);


    }

    @Override
    public void keyTyped(KeyEvent e) {
    }
    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println(e.getKeyChar());
    }

    // seticon *skull* *skull* *skull*
}
