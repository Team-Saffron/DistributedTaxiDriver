package distributedtaxidriver;
 
import java.awt.Color;
import java.io.IOException;
import java.io.OutputStream;
 
import javax.swing.JTextArea;
 
/**
 * This class extends from OutputStream to redirect output to a JTextArrea
 * @author www.codejava.net
 *
 */
public class CustomErrorStream extends OutputStream {
    private JTextArea textArea;
     
    public CustomErrorStream(JTextArea textArea) {
        this.textArea = textArea;
    }
     
    @Override
    public void write(int b) throws IOException {
        // redirects data to the text area
        textArea.setForeground(Color.red);
        textArea.append(String.valueOf((char)b));
        
        // scrolls the text area to the end of data
        textArea.setCaretPosition(textArea.getDocument().getLength());
    }
}