import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.awt.*;

public class Main {// this will act as the main starting point or driver


    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run() {
                JFrame frame = new MainFrame("Choose actor to hear quote");
                frame.setSize(3000,3000);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
                //frame.getContentPane().setBackground(Color.BLACK);

            }//end run
        });//end SwingUtilities

    }// end main
}///end main class