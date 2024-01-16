package button;



import javax.swing.*;

import java.awt.*;



public class SearchComboBox extends JComboBox {

    private String editorText;
    public SearchComboBox() {

        for (int i = 0; i < 5; i ++) {
            addItem("AAAA");


        }

        setBounds(50,30,300,30);
        getEditor().getEditorComponent().setBackground(new Color(61, 132, 189));

        setBackground(new Color(61, 132, 189));
        setBorder(BorderFactory.createLineBorder(new Color(22, 84, 126)));
        setToolTipText("DASDASD");

        setEditable(false);

        /*
        getEditor().getEditorComponent().addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                editorText = ((JTextField)editor.getEditorComponent()).getText().toLowerCase();

                suggestionSearch();

            }
        });

         */
    }



}
