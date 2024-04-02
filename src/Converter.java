import java.text.DecimalFormat;
import java.util.Objects;

import javax.swing.JComboBox;
import javax.swing.JTextField;

public class Converter {

    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void ConvertEuro(JComboBox initialCurrencyOptions, JComboBox wantedCurrencyOptions, JTextField amountFieldInput, JTextField outputField, float initialAmount, float wantedAmount)
    {
        // initialAmount = Float.parseFloat(amountFieldInput.getText());
        if(Objects.equals(String.valueOf(initialCurrencyOptions.getSelectedIndex()), "0")){

            // From Euro to Euro
            if(Objects.equals(String.valueOf(wantedCurrencyOptions.getSelectedIndex()), "0")){
                initialAmount = Float.parseFloat(amountFieldInput.getText());

                wantedAmount = initialAmount * 1;

                outputField.setText(String.valueOf(wantedAmount));
            }

            //From Euro to Dollar
            if(Objects.equals(String.valueOf(wantedCurrencyOptions.getSelectedIndex()), "1")){
                initialAmount = Float.parseFloat(amountFieldInput.getText());

                wantedAmount = initialAmount * 1.08f;

                outputField.setText(String.valueOf(df.format(wantedAmount)));
            }

            //From Euro to British Pounds
            if(Objects.equals(String.valueOf(wantedCurrencyOptions.getSelectedIndex()), "2")){
                initialAmount = Float.parseFloat(amountFieldInput.getText());

                wantedAmount = initialAmount * 0.86f;

                outputField.setText(String.valueOf(df.format(wantedAmount)));
            }
        }
    }

    public static void ConvertDollar(JComboBox initialCurrencyOptions, JComboBox wantedCurrencyOptions, JTextField amountFieldInput, JTextField outputField, float initialAmount, float wantedAmount)
    {
        // initialAmount = Float.parseFloat(amountFieldInput.getText());
        if(Objects.equals(String.valueOf(initialCurrencyOptions.getSelectedIndex()), "1")){

            // From Dollar to Dollar
            if(Objects.equals(String.valueOf(wantedCurrencyOptions.getSelectedIndex()), "1")){
                initialAmount = Float.parseFloat(amountFieldInput.getText());

                wantedAmount = initialAmount * 1;

                outputField.setText(String.valueOf(wantedAmount));
            }

            //From Dollar to Euro
            if(Objects.equals(String.valueOf(wantedCurrencyOptions.getSelectedIndex()), "0")){
                initialAmount = Float.parseFloat(amountFieldInput.getText());

                wantedAmount = initialAmount / 1.08f;

                outputField.setText(String.valueOf(df.format(wantedAmount)));
            }

            //From Dollar to British Pounds
            if(Objects.equals(String.valueOf(wantedCurrencyOptions.getSelectedIndex()), "2")){
                initialAmount = Float.parseFloat(amountFieldInput.getText());

                wantedAmount = initialAmount * 0.8f;

                outputField.setText(String.valueOf(df.format(wantedAmount)));
            }
        }
    }

    public static void ConvertBP(JComboBox initialCurrencyOptions, JComboBox wantedCurrencyOptions, JTextField amountFieldInput, JTextField outputField, float initialAmount, float wantedAmount)
    {
        // initialAmount = Float.parseFloat(amountFieldInput.getText());
        if(Objects.equals(String.valueOf(initialCurrencyOptions.getSelectedIndex()), "2")){

            // From BP to BP
            if(Objects.equals(String.valueOf(wantedCurrencyOptions.getSelectedIndex()), "2")){
                initialAmount = Float.parseFloat(amountFieldInput.getText());

                wantedAmount = initialAmount * 1f;

                outputField.setText(String.valueOf(wantedAmount));
            }

            //From BP to Euro
            if(Objects.equals(String.valueOf(wantedCurrencyOptions.getSelectedIndex()), "0")){
                initialAmount = Float.parseFloat(amountFieldInput.getText());

                wantedAmount = initialAmount / 0.86f;

                outputField.setText(String.valueOf(df.format(wantedAmount)));
            }

            //From BP to Dollar
            if(Objects.equals(String.valueOf(wantedCurrencyOptions.getSelectedIndex()), "1")){
                initialAmount = Float.parseFloat(amountFieldInput.getText());

                wantedAmount = initialAmount / 0.8f;

                outputField.setText(String.valueOf(df.format(wantedAmount)));
            }
        }
    }
}
