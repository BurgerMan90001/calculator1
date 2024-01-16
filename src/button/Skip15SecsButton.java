package button;

import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Skip15SecsButton extends JButton {
    private boolean over;
    private final Color colorOver = new Color(0, 112, 159);
    private final Color colorClick = new Color(1, 79, 108);
    private final Color idleColor = new Color(61, 132, 189);

    public Skip15SecsButton(){
        setBounds(213, 470, 40,40);
        setBorder(null);
        setContentAreaFilled(false);
        setBackground(idleColor);
        setFocusable(false);

        ImageIcon Skip = new ImageIcon("ButtonIcons/skip15Seconds.png");
        setIcon(Skip);

        setContentAreaFilled(false);
        //  Add event mouse
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent me) {
                setBackground(colorOver);
                over = true;
            }

            @Override
            public void mouseExited(MouseEvent me) {
                setBackground(idleColor);
                over = false;

            }
            @Override
            public void mouseReleased(MouseEvent me) {
                if (over) {
                    setBackground(colorOver);
                } else {
                    setBackground(idleColor);
                }
            }
            @Override
            public void mousePressed(MouseEvent me) {
                setBackground(colorClick);
            }
        });
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        //.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);
        g2.setColor(getBackground());
        int radius = 200;
        g2.fillRoundRect(2, 2, getWidth() - 4, getHeight() - 4, radius, radius);
        super.paintComponent(grphcs);
    }
}


