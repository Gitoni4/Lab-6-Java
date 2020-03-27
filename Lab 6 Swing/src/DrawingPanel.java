import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.util.Objects;
import java.util.Random;

public class DrawingPanel extends JPanel// implements MouseListener
{
    final static int W = 800, H = 600, COLOR_ALPHA = 180;

    Random random;
    BufferedImage image;
    Graphics2D graphics;

    private MouseListener mouseClick;   ////////   variabila in care retinem click-ul dat de mouse pentru a desena o forma


    public DrawingPanel(MainFrame frame)
    {
        random = new Random();
        image = new BufferedImage(W, H, BufferedImage.TYPE_INT_ARGB);

        ///////////Setarea zonei de desenat////////////

        graphics = image.createGraphics();
        graphics.setColor(Color.WHITE);
        graphics.fillRect(0, 0, W, H);

        setPreferredSize(new Dimension(W, H));
    }

    private Color getColorFromInput(MainFrame frame)    /////////   Setarea culorii pentru forma de desenat
    {
        return Objects.equals(frame.getConfigurationPanel().getConfigColor().getSelectedItem(), "Black") ?
                Color.BLACK :
                new Color(random.nextInt(255), random.nextInt(255),
                        random.nextInt(255), COLOR_ALPHA);
    }

    /*
    public void mousePressed(MouseEvent e)
    {

    }*/
}
