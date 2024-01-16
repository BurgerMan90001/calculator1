package button;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class PlayButton extends JButton {
    private boolean over;
    private final Color colorOver = new Color(0, 112, 159);
    private final Color colorClick = new Color(1, 79, 108);
    private final int radius = 200;
    private final Color idleColor = new Color(61, 132, 189);

    private boolean iconPlay = true;

    private final ImageIcon playIcon;
    private final ImageIcon pauseIcon;


    public PlayButton() {

        setBounds(178, 396, 50,50);
        setBorder(null);
        setContentAreaFilled(false);
        setBackground(idleColor);
        setFocusable(false);


        playIcon = new ImageIcon("ButtonIcons/playIcon.png");
        pauseIcon = new ImageIcon("ButtonIcons/pauseIcon.png");
        setIcon(playIcon);
       // currentIcon = getIcon();





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
            public void mousePressed(MouseEvent me) {
                setBackground(colorClick);
                if (iconPlay){
                    setIcon(pauseIcon);
                    iconPlay = false;
                }
                else{
                    setIcon(playIcon);
                    iconPlay = true;
                }
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                if (over) {
                    setBackground(colorOver);
                } else {
                    setBackground(idleColor);
                }
            }
        });
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);
        g2.setColor(getBackground());
        g2.fillRoundRect(2, 2, getWidth() - 4, getHeight() - 4, radius, radius);
        super.paintComponent(grphcs);
    }


    public void seticonPlay(boolean bool){
        iconPlay = bool;


        if (iconPlay){
            setIcon(pauseIcon);
            iconPlay = false;
        }
        else{
            setIcon(playIcon);
            iconPlay = true;
        }
    }



    public Image getPlayIcon() {
        return playIcon.getImage();
    }
    public Image getPauseIcon() {
        return pauseIcon.getImage();
    }

}
