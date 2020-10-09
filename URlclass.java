//https://www.facebook.com/naman.patidar.104/posts/1218126358573435
// subscribed code House youtube channel
import java.net.*;
import javax.swing.JOptionPane;

public class URL1 {
    public static void main(String args[]) {
        try {
            URL u = new URL("https://google.com");
            
            System.out.println("Protocol : " + u.getProtocol());
            System.out.println("Host : " + u.getHost());
            System.out.println("Port : " + u.getPort());
            System.out.println("File : " + u.getFile());
            
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null , e);
        }
    }
}
