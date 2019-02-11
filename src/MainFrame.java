import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.*;

public class MainFrame extends JFrame {

    public MainFrame(String title){

        super(title);

        // layout manager
        setLayout(new BorderLayout());


        // Create Components
        final JTextArea textArea = new JTextArea();
        JButton button = new JButton("Click me!");

        // Add Components
        Container component = getContentPane();

        component.add(textArea, BorderLayout.CENTER);
        component.add(button, BorderLayout.SOUTH);


        // Create Component Behaviour
        button.addActionListener(new AbstractAction() {

            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("Hello\n");
            }
        });




    }//end MainFrameMethod
}//end MainFrameClass