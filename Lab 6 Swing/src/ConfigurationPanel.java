import javax.swing.*;

public class ConfigurationPanel extends JPanel
{
    private JLabel labelShape;
    private JComboBox configShape;

    private JLabel labelColor;
    private JComboBox configColor;

    private JLabel labelSides;
    private JSpinner numberSides;

    private JLabel labelShapeSize;
    private JSpinner numberShapeSize;

    public JSpinner getNumberShapeSize()
    {
        return numberShapeSize;
    }

    public JSpinner getNumberSides()
    {
        return numberSides;
    }

    public JComboBox getConfigColor()
    {
        return configColor;
    }

    public JComboBox getConfigShape()
    {
        return configShape;
    }

    public ConfigurationPanel()   //////////////   Configuram Toolbar-ul aplicatiei pentru a putea modifica formele desenate
    {
        labelShape = new JLabel("Shape = ");
        configShape = new JComboBox<>(new String[] { "Regular Polygon", "Squares", "Snow Flakes", "Circle" });

        labelColor = new JLabel("Color = ");
        configColor = new JComboBox<>(new String[] { "Random color", "Black" });

        labelSides = new JLabel("Sides = ");
        numberSides = new JSpinner(new SpinnerNumberModel(0, 0, 6, 1));

        labelShapeSize = new JLabel("Shape size = ");
        numberShapeSize = new JSpinner(new SpinnerNumberModel(0, 0, 100, 5));

        add(labelShape);
        add(configShape);

        add(labelColor);
        add(configColor);

        add(labelSides);
        add(numberSides);

        add(labelShapeSize);
        add(numberShapeSize);
    }
}
