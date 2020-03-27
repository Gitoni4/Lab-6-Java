import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

public class MainFrame extends JFrame
{
    private DrawingPanel drawingPanel;
    private ConfigurationPanel configurationPanel;
    private ControlPanel controlPanel;

    public ConfigurationPanel getConfigurationPanel()
    {
        return configurationPanel;
    }

    public MainFrame()
    {
        super("Hello World");

        setLayout(new BorderLayout());

        //drawingPanel = new DrawingPanel();
        configurationPanel = new ConfigurationPanel();
        controlPanel = new ControlPanel();

        ///////////    Tratam fiecare tip de actiune pe care l-am putea avea ////////////

        controlPanel.setButtonListener(new ButtonListener()
        {
            @Override
            public void undoAction()
            {
                System.out.println("Undo");
            }

            @Override
            public void resetAction()
            {
                System.out.println("Reset");
            }

            @Override
            public void saveAction()
            {
                try
                {
                    ImageIO.write(drawingPanel.image, "PNG", new File("D:/test.png"));
                } catch (IOException ex) { System.err.println(ex); }
            }

            @Override
            public void loadAction()
            {
                System.out.println("Load");
            }

            @Override
            public void exitAction()
            {
                System.exit(0);
            }
        });

        ////////  Adaugam componentele in aplicatie ////////////

        add(configurationPanel, BorderLayout.NORTH);
       // add(drawingPanel, BorderLayout.CENTER);
        add(controlPanel, BorderLayout.SOUTH);


        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
