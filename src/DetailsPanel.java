import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class DetailsPanel extends JPanel {
    public DetailsPanel(){

        Dimension size = getPreferredSize();
        size.width = (3000);
        setPreferredSize(size);

        // instantiate a Voice object named voice
        Voice voice;

        // set up a Voicemanager object and use it to link voice with a particular voice
        VoiceManager voiceManager = VoiceManager.getInstance();
        voice = voiceManager.getVoice("kevin16");

        // load the selected voice
        voice.allocate();

        // button with an image
        ImageIcon imageOne = new ImageIcon("Hulk.jpg");
        JButton buttonOne = new JButton(imageOne);
        buttonOne.setPreferredSize(new Dimension(480, 360));
        buttonOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // set up a variable for the text to be read

            String text = "That’s my secret, Captain: I’m always angry.";

            // begin speaking the text
            voice.speak(text);
        }
        });

        ImageIcon imageTwo = new ImageIcon("Groot.jpg");
        JButton buttonTwo = new JButton(imageTwo);
        buttonTwo.setPreferredSize(new Dimension(473,709));
        buttonTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            String text = "I am Groot";

            voice.speak(text);
            }
        });

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
