import javax.swing.JFrame;
import javax.swing.JLabel;

public class App{
    public static void main(String[] args) throws Exception {
        CreateWindow();
    }

    public static void CreateWindow(){
        JFrame window = new JFrame();

        window.setTitle("Currency Converter");
        window.setSize(350, 350);
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setLocationRelativeTo(null);

        window.setVisible(true);
    }
}
