package principal;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author chris
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrameInicio v = new JFrameInicio();
        v.setVisible(true);
        int sleepingTime = Integer.parseInt(v.getParams().get(4));
        try {
            Thread.sleep(sleepingTime);
        } catch (InterruptedException ex) {
            Logger.getLogger(JFrameInicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.exit(0);
    }
    
}
