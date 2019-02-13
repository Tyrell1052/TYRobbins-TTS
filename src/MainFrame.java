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
        final JButton imageArea = new JButton();



        detailsPanel = new DetailsPanel();

        // Add Components
        Container component = getContentPane();

        //component.add(textArea, BorderLayout.CENTER);
        component.add(detailsPanel, BorderLayout.CENTER);
        //component.add(imageArea, BorderLayout.SOUTH);



    }//end MainFrameMethod
}//end MainFrameClass