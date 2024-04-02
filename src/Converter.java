import java.text.DecimalFormat;
import java.util.Objects;

import javax.swing.JComboBox;
import javax.swing.JTextField;

public class Converter {

    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void convertCurrency(JComboBox initialCurrencyOptions, JComboBox wantedCurrencyOptions, JTextField amountFieldInput, JTextField outputField) {
        float initialAmount = Float.parseFloat(amountFieldInput.getText());
        float wantedAmount = 0;
        
        int initialIndex = initialCurrencyOptions.getSelectedIndex();
        int wantedIndex = wantedCurrencyOptions.getSelectedIndex();
        
        switch (initialIndex) {
            case 0: // Euro
                switch (wantedIndex) {
                    case 0: // Euro
                        wantedAmount = initialAmount;
                        break;
                    case 1: // Dollar
                        wantedAmount = initialAmount * 1.08f;
                        break;
                    case 2: // British Pounds
                        wantedAmount = initialAmount * 0.86f;
                        break;
                }
                break;
            case 1: // Dollar
                switch (wantedIndex) {
                    case 0: // Euro
                        wantedAmount = initialAmount / 1.08f;
                        break;
                    case 1: // Dollar
                        wantedAmount = initialAmount;
                        break;
                    case 2: // British Pounds
                        wantedAmount = initialAmount * 0.8f;
                        break;
                }
                break;
            case 2: // British Pounds
                switch (wantedIndex) {
                    case 0: // Euro
                        wantedAmount = initialAmount / 0.86f;
                        break;
                    case 1: // Dollar
                        wantedAmount = initialAmount / 0.8f;
                        break;
                    case 2: // British Pounds
                        wantedAmount = initialAmount;
                        break;
                }
                break;
        }
        
        outputField.setText(df.format(wantedAmount));
    }
}
