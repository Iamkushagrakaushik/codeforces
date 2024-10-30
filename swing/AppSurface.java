package swing;

import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.ImageIcon;

public class AppSurface extends JPanel {
    ImageIcon gifIcon;
    Timer timer;
    int yaxis = 0;

    AppSurface() {
        setSize(5000, 5000);
        showBgImage();
        bGRepaint();
    }

    void showBgImage() {
        // Load the GIF as an ImageIcon (ImageIcon handles animated GIFs)
        gifIcon = new ImageIcon(AppSurface.class.getResource("batman.gif"));
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Draw the GIF image at the yaxis position
        gifIcon.paintIcon(this, g, 50, yaxis);
    }

    void bGRepaint() {
        timer = new Timer(50, (a) -> {
             
            repaint();
        });
        timer.start();
    }
}
