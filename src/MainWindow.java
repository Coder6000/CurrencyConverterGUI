import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow {

    private JFrame window = new JFrame();
    
    private final JLabel initialCurrencyText = new JLabel("Initial Currency: ");
    private final JLabel amountText = new JLabel("Amount: ");
    private final JLabel wantedCurrencyText = new JLabel("Wanted Currency: ");
    private final JLabel outputText = new JLabel("Output: ");

    private final JTextField amountFieldInput = new JTextField();

    private final JTextField outputField = new JTextField();

    private String initialCurrencies[] = {"Euros", "Dollars", "British Pounds"};
    private final JComboBox<String> initialCurrencyOptions = new JComboBox<>(initialCurrencies);

    private String wantedCurrencies[] = {"Euros", "Dollars", "British Pounds"};
    private final JComboBox<String> wantedCurrencyOptions = new JComboBox<>(wantedCurrencies);

    private final JButton convertButton = new JButton("Convert");
    
    public MainWindow(){
        initializeWindow();
        initializeLabels();
        initializeButtons();
        initializeListeners();

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

        amountFieldInput.setBounds(70, 62, 120, 20);
        window.add(amountFieldInput);

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

    private void initializeButtons(){
        convertButton.setBounds(220, 200, 100, 40);
        window.add(convertButton);
    }

    private void initializeListeners() {
        convertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Converter.convertCurrency(initialCurrencyOptions, wantedCurrencyOptions, amountFieldInput, outputField);
            }
        });
    }
}
