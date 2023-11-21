package programowanie_rok2_lab2;

import javax.swing.*;
import java.awt.*;

public class CustomJPanel extends JPanel {
    public CustomJPanel() {
        setPreferredSize(new Dimension(800, 800));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D)g;

    }
}
