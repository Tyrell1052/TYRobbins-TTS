import javax.swing.*;
import java.awt.*;

public class DetailsPanel extends JPanel {
    public DetailsPanel(){

        Dimension size = getPreferredSize();
        size.width = (1000);
        setPreferredSize(size);

        JButton button = new JButton("Thomas Edison!");
        button.setPreferredSize(new Dimension(250, 100));

        ImageIcon imageOn = new ImageIcon("kitten.jpg");
        //imageOne.setIcon(new ImageIcon("kitten.jpg"));
        imageOne.add(imageOne);
        add(imageOne);
        validate();

        setLayout(new GridBagLayout());
        GridBagConstraints gridConstraints = new GridBagConstraints();

        gridConstraints.weightx = 0;
        gridConstraints.weighty = 0;

        gridConstraints.gridx = 0;
        add(button, gridConstraints);



    }// end DetailsPanel method

}// end DetailsPanel class
