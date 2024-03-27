import javax.swing.JFrame;

public class MainWindow {

    private JFrame window = new JFrame();
    
    public MainWindow(){
        initialize();   
    }

    private void initialize(){
        window.setTitle("Currency Converter");
        window.setSize(350, 350);
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.setLayout(null);
        window.setResizable(false);
        
        window.setVisible(true);
    }
}
