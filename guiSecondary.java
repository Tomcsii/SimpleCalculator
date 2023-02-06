//BY TAMAS BORBELY

import java.awt.*;
import javax.swing.*;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.event.*;
import java.io.File;

public class guiSecondary {

    Font newButtonFont = new Font("Bebas Neue", Font.BOLD, 16);
    Font displayFont = new Font("Bebas Neue", Font.BOLD, 75);
    Calculations newCalc = new Calculations();
    String conversion = "";
    String currencyLeft;
    String currencyRight;
    String amount;


    public guiSecondary(JFrame frame) {
        frame.setLayout(null);

        //BUTTONS

        JTextField inputBox = new JTextField(" ");
        inputBox.setBounds(25, 50, 475, 100);
        inputBox.setBackground(new Color(40, 61, 59));
        frame.add(inputBox);
        inputBox.setForeground(Color.WHITE);
        inputBox.setFont(displayFont);
        inputBox.setHorizontalAlignment(SwingConstants.RIGHT);

        //1ST FUNCTION BUTTON 

        JButton window1 = new JButton("1F");
        window1.setBounds(136, 575, 276, 100);
        window1.setBackground(new Color(219, 58, 52));
        frame.add(window1);
        window1.setFont(newButtonFont);
        window1.setForeground(Color.WHITE);

        //DROP DOWN MENU

        String[] lChoice = {"USD", "EUR", "CAD", "GBP", "HUF"};

        JComboBox<String> lChoices = new JComboBox<String>(lChoice);
        lChoices.setBounds(50, 250, 150, 50);
        frame.add(lChoices);

        JTextField linputBox = new JTextField(" ");
        linputBox.setBounds(50, 350, 150, 50);
        linputBox.setBackground(new Color(40, 61, 59));
        frame.add(linputBox);
        linputBox.setForeground(Color.WHITE);
        linputBox.setFont(newButtonFont);
        linputBox.setHorizontalAlignment(SwingConstants.RIGHT);

        String[] rChoice = {"USD", "EUR", "CAD", "GBP", "HUF"};

        JComboBox<String> rChoices = new JComboBox<String>(rChoice);
        rChoices.setBounds(325, 250, 150, 50);
        frame.add(rChoices);

        JTextField rinputBox = new JTextField(" ");
        rinputBox.setBounds(325, 350, 150, 50);
        rinputBox.setBackground(new Color(40, 61, 59));
        frame.add(rinputBox);
        rinputBox.setForeground(Color.WHITE);
        rinputBox.setFont(newButtonFont);
        rinputBox.setHorizontalAlignment(SwingConstants.RIGHT);

        //CONVERT AND CLEAR BUTTONS

        JButton convert = new JButton("Convert");
        convert.setBounds(136, 500, 175, 50);
        convert.setBackground(new Color(136, 58, 52));
        frame.add(convert);
        convert.setFont(newButtonFont);
        convert.setForeground(Color.WHITE);

        JButton clear = new JButton("CLR");
        clear.setBounds(336, 500, 76, 50);
        clear.setBackground(new Color(136, 58, 52));
        frame.add(clear);
        clear.setFont(newButtonFont);
        clear.setForeground(Color.WHITE);

        //CONVERT AND CLEAR BUTTONS FUNC

        convert.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = e.getActionCommand();
                if (str.equals("Convert")) {
                    try {
                    currencyLeft = (String)lChoices.getSelectedItem();
                    currencyRight = (String)rChoices.getSelectedItem();
                    amount = linputBox.getText();
                    newCalc.convert(currencyLeft, currencyRight, amount);
                    conversion = newCalc.getAwnser2();
                    rinputBox.setText(conversion);
                    } catch (Exception ex) {
                        rinputBox.setText("ERROR");
                        conversion = "";
                    }
                }
            }
        }); 

        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = e.getActionCommand();
                if (str.equals("CLR")) {
                    conversion = "";
                    currencyLeft = "";
                    currencyRight = "";
                    amount = "";
                    linputBox.setText(conversion);
                    rinputBox.setText(conversion);
                    newCalc.clear2();
                }
            }
        }); 

        //1ST FUNCTION BUTTON FUNC 

        window1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = e.getActionCommand();
                if (str.equals("1F")) {
                    frame.remove(inputBox);
                    frame.remove(window1);
                    frame.remove(lChoices);
                    frame.remove(rChoices);
                    frame.remove(rinputBox);
                    frame.remove(linputBox);
                    frame.remove(convert);
                    frame.remove(clear);
                    guiMain test = new guiMain(frame);
                    SwingUtilities.updateComponentTreeUI(frame);
                }
            }
        });
        SwingUtilities.updateComponentTreeUI(frame);
    }
}
