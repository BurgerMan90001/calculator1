package gui;

import java.awt.*;
import javax.swing.*;

public class BackgroundGradient extends JComponent {
    private final Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
    public void paint(Graphics g){

        Graphics2D g2d = (Graphics2D)g;
        Color color1 = new Color(0,105,137);
        Color color2 = new Color(1,167,194);
        GradientPaint gradient1 = new GradientPaint(0,0,color1,dimension.width,dimension.height,color2,true);
        g2d.setPaint(gradient1);
        g2d.fillRect(0,0,1920,1080);
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
    }
}