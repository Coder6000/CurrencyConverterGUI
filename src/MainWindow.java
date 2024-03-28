import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Font;

public class MainWindow {

    private JFrame window = new JFrame();
    
    private JLabel initialCurrencyText = new JLabel("Initial Currency: ");
    private JLabel amountText = new JLabel("Amount: ");
    private JLabel wantedCurrencyText = new JLabel("Wanted Currency: ");
    private JLabel outputText = new JLabel("Output: ");

    private JTextField amountField = new JTextField();
    private JTextField outputField = new JTextField();

    private String initialCurrencies[] = {"British Pounds", "Dollars", "Euros"};
    private JComboBox initialCurrencyOptions = new JComboBox<>(initialCurrencies);

    private String wantedCurrencies[] = {"British Pounds", "Dollars", "Euros"};
    private JComboBox wantedCurrencyOptions = new JComboBox<>(wantedCurrencies);
    
    public MainWindow(){
        initializeWindow();
        initializeLabels();

        window.setVisible(true);
    }

    private void initializeWindow(){
        window.setTitle("Currency Converter");
        window.setSize(350, 350);
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.setLayout(null);
        window.setResizable(false);
    }

    private void initializeLabels(){

        //Initial Currency Section
        initialCurrencyText.setBounds(3, 3, 120, 80);
        initialCurrencyText.setFont(new Font("Arial Black", Font.PLAIN, 13));
        window.add(initialCurrencyText);

        initialCurrencyOptions.setBounds(140, 35, 110, 18);
        window.add(initialCurrencyOptions);

        amountText.setBounds(3, 30, 120, 80);
        amountText.setFont(new Font("Arial Black", Font.PLAIN, 13));
        window.add(amountText);

        amountField.setBounds(70, 62, 120, 20);
        window.add(amountField);

        //Wanted Currency Section
        wantedCurrencyText.setBounds(3, 100, 140, 80);
        wantedCurrencyText.setFont(new Font("Arial Black", Font.PLAIN, 13));
        window.add(wantedCurrencyText);

        wantedCurrencyOptions.setBounds(140, 134, 110, 18);
        window.add(wantedCurrencyOptions);

        outputText.setBounds(3, 140, 70, 80);
        outputText.setFont(new Font("Arial Black", Font.PLAIN, 13));
        window.add(outputText);

        outputField.setBounds(70, 171, 120, 20);
        outputField.setEditable(false);
        window.add(outputField);
    }
}
