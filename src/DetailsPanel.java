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


        Voice voice;// instantiate a Voice object named voice

        // creating a VoiceManager object and use it to link voice with a particular voice
        VoiceManager voiceManager = VoiceManager.getInstance();
        voice = voiceManager.getVoice("kevin16");

        // load the selected voice
        voice.allocate();

        // Creating four JButtons with pictures overlaid
        ImageIcon imageOne = new ImageIcon("Hulk.jpg");
        JButton buttonOne = new JButton(imageOne);
        buttonOne.setPreferredSize(new Dimension(480, 360));
        buttonOne.addActionListener(new ActionListener() {// adding Actions listeners to detect button click
            @Override
            public void actionPerformed(ActionEvent e) {//this is the class for the button after it is clicked
                // set up a variable for the text to be read

            String text = "That’s my secret, Captain: I’m always angry.";//text to speak

            // begin speaking the text
            voice.speak(text);// voice.speak will speak the String variable passed in within this method
        }
        });

        ImageIcon imageTwo = new ImageIcon("Groot.jpg");
        JButton buttonTwo = new JButton(imageTwo);
        buttonTwo.setPreferredSize(new Dimension(473,709));
        buttonTwo.addActionListener(new ActionListener() {// adding Actions listeners to detect button click
            @Override
            public void actionPerformed(ActionEvent e) {//this is the class for the button after it is clicked

            String text = "I am Groot";//text to speak

            voice.speak(text);// voice.speak will speak the String variable passed in within this method
            }
        });

        ImageIcon imageThree = new ImageIcon("Gandalf.jpg");
        JButton buttonThree = new JButton(imageThree);
        buttonThree.setPreferredSize(new Dimension(340, 270));
        buttonThree.addActionListener(new ActionListener() {// adding Actions listeners to detect button click
            @Override
            public void actionPerformed(ActionEvent e) {//this is the class for the button after it is clicked

                String text = "So do all who live to see such times, but that + " +
                        "is not for them to decide. All you have to decide is what to + " +
                        "do with the time that is given to you";//text to speak
                voice.speak(text);// voice.speak will speak the String variable passed in within this method

            }
        });

        ImageIcon imageFour = new ImageIcon("300.jpg");
        JButton buttonFour = new JButton(imageFour);
        buttonFour.setPreferredSize(new Dimension(512, 288));
        buttonFour.addActionListener(new ActionListener() {// adding Actions listeners to detect button click
            @Override
            public void actionPerformed(ActionEvent e) {//this is the class for the button after it is clicked

                String text = "This … is … SPARTA!";//text to speak
                voice.speak(text);// voice.speak will speak the String variable passed in within this method
            }
        });


        setLayout(new GridBagLayout());// this will act as my layout manager
        GridBagConstraints gridConstraints = new GridBagConstraints();// creating a gridBagConstraints Object


        gridConstraints.gridx = 1;// this allows me to position my picture buttons along the x axis
        gridConstraints.gridy = 0;// this allows me to position my picture buttons along the y axis
        add(buttonOne, gridConstraints);// this adds the button to the panel an tie it to the gridConstraints


        gridConstraints.gridx = 0;// this allows me to position my picture buttons along the x axis
        gridConstraints.gridy = 1;// this allows me to position my picture buttons along the y axis
        add(buttonTwo, gridConstraints);// this adds the button to the panel an tie it to the gridConstraints


        gridConstraints.gridx = 0;// this allows me to position my picture buttons along the x axis
        gridConstraints.gridy = 0;// this allows me to position my picture buttons along the y axis
        add(buttonThree, gridConstraints);// this adds the button to the panel an tie it to the gridConstraints

        gridConstraints.gridx = 1;// this allows me to position my picture buttons along the x axis
        gridConstraints.gridy = 1;// this allows me to position my picture buttons along the y axis
        add(buttonFour,gridConstraints);// this adds the button to the panel an tie it to the gridConstraints

    }// end DetailsPanel method

}// end DetailsPanel class
