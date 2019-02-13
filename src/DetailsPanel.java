import javax.swing.*;
import java.awt.*;

public class DetailsPanel extends JPanel {
    public DetailsPanel(){

        Dimension size = getPreferredSize();
        size.width = (3000);
        setPreferredSize(size);

        // first button with an image
        ImageIcon imageOne = new ImageIcon("Apollo 13.jpg");
        JButton buttonOne = new JButton(imageOne);
        buttonOne.setPreferredSize(new Dimension(800, 1000));

        ImageIcon imageTwo = new ImageIcon("kitten.jpg");
        JButton buttonTwo = new JButton(imageTwo);
        buttonTwo.setPreferredSize(new Dimension(500,400));


        setLayout(new GridBagLayout());
        GridBagConstraints gridConstraints = new GridBagConstraints();

//        gridConstraints.weightx = 0;
//        gridConstraints.weighty = 0;

        gridConstraints.gridx = 0;
        gridConstraints.gridy = 1;
        add(buttonOne, gridConstraints);


        gridConstraints.gridx = 0;
        gridConstraints.gridy = 3;
        add(buttonTwo, gridConstraints);




    }// end DetailsPanel method

}// end DetailsPanel class
