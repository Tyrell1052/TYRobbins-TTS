import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main {


    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run() {
                JFrame frame = new MainFrame("Choose actor to hear quote");
                frame.setSize(800,800);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });

//        // set up a variable for the text to be read
//
//        String text = "This is your computer talking."
//                + ".  ." + "Let me recite some lines made famous by Thomas Edison"
//                + ".  ." + "Mary had a little lamb, its fleece was white as snow,"
//                + ".  ." + "and everywhere that Mary went, the lamb was sure to go.";
//
//
//        // instantiate a Voice object named voice
//        Voice voice;
//
//        // set up a Voicemanager object and use it to link voice with a particular voice
//        VoiceManager voiceManager = VoiceManager.getInstance();
//        voice = voiceManager.getVoice("kevin16");
//
//        // load the selected voice
//        voice.allocate();
//
//        // begin speaking the text
//        voice.speak(text);


        
    }// end main

}///end main class


