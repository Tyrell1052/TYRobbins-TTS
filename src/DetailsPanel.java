import javax.swing.*;
import java.awt.*;

public class DetailsPanel extends JPanel {
    public DetailsPanel(){

        Dimension size = getPreferredSize();
        size.width = (3000);
        setPreferredSize(size);

        // first button with an image
        ImageIcon imageOne = new ImageIcon("Hulk.jpg");
        JButton buttonOne = new JButton(imageOne);
        buttonOne.setPreferredSize(new Dimension(480, 360));

        ImageIcon imageTwo = new ImageIcon("Groot.jpg");
        JButton buttonTwo = new JButton(imageTwo);
        buttonTwo.setPreferredSize(new Dimension(473,709));

        ImageIcon imageThree = new ImageIcon("Gandalf.jpg");
        JButton buttonThree = new JButton(imageThree);
        buttonThree.setPreferredSize(new Dimension(340, 270));

        ImageIcon imageFour = new ImageIcon("300.jpg");
        JButton buttonFour = new JButton(imageFour);
        buttonFour.setPreferredSize(new Dimension(512, 288));




        setLayout(new GridBagLayout());
        GridBagConstraints gridConstraints = new GridBagConstraints();



        gridConstraints.gridx = 1;
        gridConstraints.gridy = 0;
        add(buttonOne, gridConstraints);


        gridConstraints.gridx = 0;
        gridConstraints.gridy = 1;
        add(buttonTwo, gridConstraints);


        gridConstraints.gridx = 0;
        gridConstraints.gridy = 0;
        add(buttonThree, gridConstraints);

        gridConstraints.gridx = 1;
        gridConstraints.gridy = 1;
        add(buttonFour,gridConstraints);



    }// end DetailsPanel method

}// end DetailsPanel class
