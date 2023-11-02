import javax.swing.JTextField;
import javax.swing.JFrame;

public class NewClientInvoice {
    public static void main(String[] args) {
        JFrame f = new JFrame("The New Client form");
        JTextField t1, t2;
        t1 = new JTextField("Client Name*");
        t1.setBounds(10, 50, 200, 10);
        f.add(t1);
        f.setSize(1000, 1000);
        f.setLayout(null);
        f.setVisible(true);
    }

}

