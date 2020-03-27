import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlPanel extends JPanel implements ActionListener
{
   private JButton buttonUndo;
   private JButton buttonReset;
   private JButton buttonSave;
   private JButton buttonLoad;
   private JButton buttonExit;

   private ButtonListener buttonAction;     ////////////   Variabila in care retinem ce actiune trebuie efectuata si cand

    public ControlPanel()    ////////////  Configuram zona pentru setarile aplicatiei
    {
        setLayout(new GridLayout(1, 5));

        buttonUndo = new JButton("Undo");
        buttonReset = new JButton("Reset");
        buttonSave = new JButton("Save");
        buttonLoad = new JButton("Load");
        buttonExit = new JButton("Exit");

        Border innerBorder = BorderFactory.createTitledBorder("Settings");
        Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        setBorder(BorderFactory.createCompoundBorder(innerBorder, outerBorder));

        buttonUndo.addActionListener(this);
        buttonReset.addActionListener(this);
        buttonSave.addActionListener(this);
        buttonLoad.addActionListener(this);
        buttonExit.addActionListener(this);

        add(buttonUndo);
        add(buttonReset);
        add(buttonSave);
        add(buttonLoad);
        add(buttonExit);
    }

    public void setButtonListener(ButtonListener b)         //////////Functia prin care asignam actiunea
    {
        this.buttonAction = b;
    }

    public void actionPerformed(ActionEvent e)             /////////    Se adauga actiunea de efectuat in MainFrame
    {
        JButton clicked = (JButton)e.getSource();

        if (clicked == buttonUndo)
        {
            if (buttonAction != null)
            {
                buttonAction.undoAction();
            }
        }

        if (clicked == buttonReset)
        {
            if (buttonAction != null)
            {
                buttonAction.resetAction();
            }
        }

        if (clicked == buttonSave)
        {
            if (buttonAction != null)
            {
                buttonAction.saveAction();
            }
        }

        if (clicked == buttonLoad)
        {
            if (buttonAction != null)
            {
                buttonAction.loadAction();
            }
        }
        if (clicked == buttonExit)
        {
            if (buttonAction != null)
            {
                buttonAction.exitAction();
            }
        }

    }
}
