import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.*;

public class MainFrame extends JFrame {

    private DetailsPanel detailsPanel;

    public MainFrame(String title){

        super(title);

        // layout manager
        setLayout(new BorderLayout());


        // Create Components
        final JTextArea textArea = new JTextArea();
        final JButton imageArea = new JButton();



        detailsPanel = new DetailsPanel();

        // Add Components
        Container component = getContentPane();

        component.add(textArea, BorderLayout.CENTER);
        component.add(detailsPanel, BorderLayout.WEST);
        component.add(imageArea, BorderLayout.SOUTH);


//       // JButton imageOne = new JButton();
//        imageOne.setIcon(new ImageIcon("kitten.jpg"));
//        imageOne.add(imageOne);
//        add(imageOne);
//        validate();




    }//end MainFrameMethod
}//end MainFrameClass