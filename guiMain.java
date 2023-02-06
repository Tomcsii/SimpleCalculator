//BY TAMAS BORBELY

import java.awt.*;
import javax.swing.*;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.event.*;
import java.io.File;

public class guiMain {
    
    Font newButtonFont = new Font("Bebas Neue", Font.BOLD, 16);
    Font displayFont = new Font("Bebas Neue", Font.BOLD, 50);
    //Font displayFont = new Font("Bebas Neue", Font.BOLD, 75);
    Font smallButton = new Font("Bebas Neue", Font.BOLD, 12);
    Font evenSmallerButton = new Font("Bebas Neue", Font.BOLD, 9);
    String calculation = "";
    Calculations newCalc = new Calculations();
    boolean lastCalc = false;
    //Image img = Toolkit.getDefaultToolkit().getImage("mainpage.png");

    public guiMain(JFrame frame) {
  
        //DISPLAY 
        
        JTextField inputBox = new JTextField(" ");
        inputBox.setBounds(25, 50, 475, 100);
        inputBox.setBackground(new Color(40, 61, 59));
        frame.add(inputBox);
        inputBox.setForeground(Color.WHITE);
        inputBox.setFont(displayFont);
        inputBox.setHorizontalAlignment(SwingConstants.RIGHT);

        //NUMBER BUTTONS

        JButton zero = new JButton("0");
        zero.setBounds(150, 575, 100, 100);
        zero.setBackground(new Color(219, 58, 52));
        frame.add(zero);
        zero.setFont(newButtonFont);
        zero.setForeground(Color.WHITE);

        JButton one = new JButton("1");
        one.setBounds(25, 450, 100, 100);
        one.setBackground(new Color(219, 58, 52));
        frame.add(one);
        one.setFont(newButtonFont);
        one.setForeground(Color.WHITE);

        JButton two = new JButton("2");
        two.setBounds(150, 450, 100, 100);
        two.setBackground(new Color(219, 58, 52));
        frame.add(two);
        two.setFont(newButtonFont);
        two.setForeground(Color.WHITE);

        JButton three = new JButton("3");
        three.setBounds(275, 450, 100, 100);
        three.setBackground(new Color(219, 58, 52));
        frame.add(three);
        three.setFont(newButtonFont);
        three.setForeground(Color.WHITE);

        JButton four = new JButton("4");
        four.setBounds(25, 325, 100, 100);
        four.setBackground(new Color(219, 58, 52));
        frame.add(four);
        four.setFont(newButtonFont);
        four.setForeground(Color.WHITE);

        JButton five = new JButton("5");
        five.setBounds(150, 325, 100, 100);
        five.setBackground(new Color(219, 58, 52));
        frame.add(five);
        five.setFont(newButtonFont);
        five.setForeground(Color.WHITE);

        JButton six = new JButton("6");
        six.setBounds(275, 325, 100, 100);
        six.setBackground(new Color(219, 58, 52));
        frame.add(six);
        six.setFont(newButtonFont);
        six.setForeground(Color.WHITE);

        JButton seven = new JButton("7");
        seven.setBounds(25, 200, 100, 100);
        seven.setBackground(new Color(219, 58, 52));
        frame.add(seven);
        seven.setFont(newButtonFont);
        seven.setForeground(Color.WHITE);

        JButton eight = new JButton("8");
        eight.setBounds(150, 200, 100, 100);
        eight.setBackground(new Color(219, 58, 52));
        frame.add(eight);
        eight.setFont(newButtonFont);
        eight.setForeground(Color.WHITE);

        JButton nine = new JButton("9");
        nine.setBounds(275, 200, 100, 100);
        nine.setBackground(new Color(219, 58, 52));
        frame.add(nine);
        nine.setFont(newButtonFont);
        nine.setForeground(Color.WHITE);

        //MAIN FUNCTION BUTTONS

        JButton add = new JButton("+");
        add.setBounds(400, 200, 100, 100);
        add.setBackground(new Color(255,99,71));
        frame.add(add);
        add.setFont(newButtonFont);
        add.setForeground(Color.WHITE);

        JButton subtract = new JButton("-");
        subtract.setBounds(400, 325, 100, 100);
        subtract.setBackground(new Color(255,99,71));
        frame.add(subtract);
        subtract.setFont(newButtonFont);
        subtract.setForeground(Color.WHITE);

        JButton multiply = new JButton("*");
        multiply.setBounds(400, 450, 100, 100);
        multiply.setBackground(new Color(255,99,71));
        frame.add(multiply);
        multiply.setFont(newButtonFont);
        multiply.setForeground(Color.WHITE);

        JButton divide = new JButton("%");
        divide.setBounds(400, 575, 100, 100);
        divide.setBackground(new Color(255,99,71));
        frame.add(divide);
        divide.setFont(newButtonFont);
        divide.setForeground(Color.WHITE);

        //SMALL BUTTONS RIGHT SIDE

        JButton decimal = new JButton(".");
        decimal.setBounds(275, 625, 45, 45);
        decimal.setBackground(new Color(255,165,0));
        frame.add(decimal);
        decimal.setFont(newButtonFont);
        decimal.setForeground(Color.WHITE);

        JButton delete = new JButton("D");
        delete.setBounds(325, 625, 45, 45);
        delete.setBackground(new Color(255,165,0));
        frame.add(delete);
        delete.setFont(smallButton);
        delete.setForeground(Color.WHITE);

        JButton window2 = new JButton("2F");
        window2.setBounds(275, 575, 45, 45);
        window2.setBackground(new Color(255,165,0));
        frame.add(window2);
        window2.setFont(evenSmallerButton);
        window2.setForeground(Color.WHITE);

        JButton negative = new JButton("-X");
        negative.setBounds(325, 575, 45, 45);
        negative.setBackground(new Color(255,165,0));
        frame.add(negative);
        negative.setFont(evenSmallerButton);
        negative.setForeground(Color.WHITE);

        //SMALL BUTTONS LEFT SIDE

        JButton sqrt = new JButton("√");
        sqrt.setBounds(25, 575, 45, 45);
        sqrt.setBackground(new Color(255,165,0));
        frame.add(sqrt);
        sqrt.setFont(smallButton);
        sqrt.setForeground(Color.WHITE);

        JButton exponent = new JButton("^");
        exponent.setBounds(75, 575, 45, 45);
        exponent.setBackground(new Color(255,165,0));
        frame.add(exponent);
        exponent.setFont(smallButton);
        exponent.setForeground(Color.WHITE);

        JButton lBracket = new JButton("(");
        lBracket.setBounds(25, 625, 45, 45);
        lBracket.setBackground(new Color(255,165,0));
        frame.add(lBracket);
        lBracket.setFont(smallButton);
        lBracket.setForeground(Color.WHITE);

        JButton rBracket = new JButton(")");
        rBracket.setBounds(75, 625, 45, 45);
        rBracket.setBackground(new Color(255,165,0));
        frame.add(rBracket);
        rBracket.setFont(smallButton);
        rBracket.setForeground(Color.WHITE);

        //HIST FUNCTION BUTTONS

        JButton history = new JButton("HIST");
        history.setBounds(25, 700, 95, 45);
        history.setBackground(new Color(255,200,0));
        frame.add(history);
        history.setFont(smallButton);
        history.setForeground(Color.WHITE);

        //previousAwnser.setBounds(275, 750, 95, 45);

        JButton previousAwnser = new JButton("AWNS");
        previousAwnser.setBounds(25, 750, 95, 45);
        previousAwnser.setBackground(new Color(255,200,0));
        frame.add(previousAwnser);
        previousAwnser.setFont(smallButton);
        previousAwnser.setForeground(Color.WHITE);

        //ENDGAME BUTTONS

        JButton equals = new JButton("=");
        equals.setBounds(150, 700, 225, 100);
        equals.setBackground(new Color(255,140,0));
        frame.add(equals);
        equals.setFont(newButtonFont);
        equals.setForeground(Color.WHITE);

        JButton cler = new JButton("CLR");
        cler.setBounds(400, 700, 100, 100);
        cler.setBackground(new Color(255,200,0));
        frame.add(cler);
        cler.setFont(newButtonFont);
        cler.setForeground(Color.WHITE);

        frame.setVisible(true);

        // BUTTON FUNCTIONS

        //NUMBER FUNCTION BUTTONS

        zero.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = e.getActionCommand();
                if (str.equals("0")) {
                    if(lastCalc == true) {
                        calculation = "";
                        lastCalc = false;
                    }
                    calculation = calculation + "0";
                    inputBox.setText(calculation);
                    
                }
            }
        });
        one.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = e.getActionCommand();
                if (str.equals("1")) {
                    if(lastCalc == true) {
                        calculation = "";
                        lastCalc = false;
                    }
                    calculation = calculation + "1";
                    inputBox.setText(calculation);
                    
                }
            }
        });
        two.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = e.getActionCommand();
                if (str.equals("2")) {
                    if(lastCalc == true) {
                        calculation = "";
                        lastCalc = false;
                    }
                    calculation = calculation + "2";
                    inputBox.setText(calculation);
                    
                }
            }
        });
        three.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = e.getActionCommand();
                if (str.equals("3")) {
                    if(lastCalc == true) {
                        calculation = "";
                        lastCalc = false;
                    }
                    calculation = calculation + "3";
                    inputBox.setText(calculation);
                    
                }
            }
        });
        four.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = e.getActionCommand();
                if (str.equals("4")) {
                    if(lastCalc == true) {
                        calculation = "";
                        lastCalc = false;
                    }
                    calculation = calculation + "4";
                    inputBox.setText(calculation);
                    
                }
            }
        });
        five.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = e.getActionCommand();
                if (str.equals("5")) {
                    if(lastCalc == true) {
                        calculation = "";
                        lastCalc = false;
                    }
                    calculation = calculation + "5";
                    inputBox.setText(calculation);
                    
                }
            }
        });
        six.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = e.getActionCommand();
                if (str.equals("6")) {
                    if(lastCalc == true) {
                        calculation = "";
                        lastCalc = false;
                    }
                    calculation = calculation + "6";
                    inputBox.setText(calculation);
                    
                }
            }
        });
        seven.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = e.getActionCommand();
                if (str.equals("7")) {
                    if(lastCalc == true) {
                        calculation = "";
                        lastCalc = false;
                    }
                    calculation = calculation + "7";
                    inputBox.setText(calculation);
                    
                }
            }
        });
        eight.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = e.getActionCommand();
                if (str.equals("8")) {
                    if(lastCalc == true) {
                        calculation = "";
                        lastCalc = false;
                    }
                    calculation = calculation + "8";
                    inputBox.setText(calculation);
                    
                }
            }
        });
        nine.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = e.getActionCommand();
                if (str.equals("9")) {
                    if(lastCalc == true) {
                        calculation = "";
                        lastCalc = false;
                    }
                    calculation = calculation + "9";
                    inputBox.setText(calculation);
                    
                }
            }
        });

        //MATHEMATICAL FUNCTION BUTTONS

        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = e.getActionCommand();
                if (str.equals("+")) {
                    lastCalc = false;
                    calculation = calculation + " + ";
                    inputBox.setText(calculation);
                    
                }
            }
        });
        subtract.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = e.getActionCommand();
                if (str.equals("-")) {
                    lastCalc = false;
                    calculation = calculation + " - ";
                    inputBox.setText(calculation);
                    
                }
            }
        });
        multiply.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = e.getActionCommand();
                if (str.equals("*")) {
                    lastCalc = false;
                    calculation = calculation + " * ";
                    inputBox.setText(calculation);
                    
                }
            }
        });
        divide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = e.getActionCommand();
                if (str.equals("%")) {
                    lastCalc = false;
                    calculation = calculation + " % ";
                    inputBox.setText(calculation);
                    
                }
            }
        });
        
        //SMALL BUTTONS RIGHT SIDE FUNC

        decimal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = e.getActionCommand();
                if (str.equals(".")) {
                    lastCalc = false;
                    calculation = calculation + ".";
                    inputBox.setText(calculation);
                    
                }
            }
        });

        delete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = e.getActionCommand();
                if (str.equals("D")) {
                    lastCalc = false;
                    int lengt = calculation.length();
                    calculation = calculation.substring(0,lengt-1);
                    inputBox.setText(calculation);
                    
                }
            }
        });

        negative.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = e.getActionCommand();
                if (str.equals("-X")) {
                    if(lastCalc == true) {
                        calculation = "";
                        lastCalc = false;
                    }
                    calculation = calculation + "-";
                    inputBox.setText(calculation);
                }
            }
        });

        //SMALL BUTTONS LEFT SIDE FUNC

        sqrt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = e.getActionCommand();
                if (str.equals("√")) {
                    if(lastCalc == true) {
                        calculation = "";
                        lastCalc = false;
                    }
                    calculation = calculation + "√ ";
                    inputBox.setText(calculation);
                    
                }
            }
        });

        exponent.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = e.getActionCommand();
                if (str.equals("^")) {
                    lastCalc = false;
                    calculation = calculation + " ^ ";
                    inputBox.setText(calculation);
                    
                }
            }
        });

        lBracket.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = e.getActionCommand();
                if (str.equals("(")) {
                    if(lastCalc == true) {
                        calculation = "";
                        lastCalc = false;
                    }
                    calculation = calculation + "(";
                    inputBox.setText(calculation);
                    
                }
            }
        });

        rBracket.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = e.getActionCommand();
                if (str.equals(")")) {
                    calculation = calculation + ")";
                    inputBox.setText(calculation);
                    
                }
            }
        });

        //HIST BUTTONS FUNC

        history.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = e.getActionCommand();
                if (str.equals("HIST")) {
                    if(lastCalc == true) {
                        calculation = "";
                        lastCalc = false;
                    }
                    String twoAwnsersAgo = newCalc.getLastAwns();
                    calculation = calculation + twoAwnsersAgo;
                    inputBox.setText(calculation);
                    
                }
            }
        });

        previousAwnser.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = e.getActionCommand();
                if (str.equals("AWNS")) {
                    if(lastCalc == true) {
                        calculation = "";
                        lastCalc = false;
                    }
                    String lastAwnser = newCalc.getAwnser();
                    calculation = calculation + lastAwnser;
                    inputBox.setText(calculation);
                    
                }
            }
        });

        //ENDGAME BUTTONS FUNC 

        equals.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = e.getActionCommand();
                if (str.equals("=")) {
                    try {
                    calculation = inputBox.getText();
                    newCalc.setCalc(calculation);
                    newCalc.calculate();
                    calculation = newCalc.getAwnser();
                    inputBox.setText(calculation);
                    newCalc.clear();
                    lastCalc = true;
                    } catch (Exception ex) {
                        inputBox.setText("ERROR");
                        newCalc.clear();
                        calculation = "";
                        lastCalc = true;
                    }
                }
            }
        });
        cler.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = e.getActionCommand();
                if (str.equals("CLR")) {
                    lastCalc = false;
                    calculation = "";
                    inputBox.setText(calculation);
                    newCalc.clear();
                }
            }
        });

        //2ND FUNCTION BUTTON FUNC

        window2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = e.getActionCommand();
                if (str.equals("2F")) {
                    frame.remove(zero);
                    frame.remove(one);
                    frame.remove(two);
                    frame.remove(three);
                    frame.remove(four);
                    frame.remove(five);
                    frame.remove(six);
                    frame.remove(seven);
                    frame.remove(eight);
                    frame.remove(nine);
                    frame.remove(add);
                    frame.remove(subtract);
                    frame.remove(multiply);
                    frame.remove(divide);
                    frame.remove(equals);
                    frame.remove(cler);
                    frame.remove(delete);
                    frame.remove(decimal);
                    frame.remove(lBracket);
                    frame.remove(rBracket);
                    frame.remove(sqrt);
                    frame.remove(exponent);
                    frame.remove(window2);
                    frame.remove(negative);
                    frame.remove(history);
                    frame.remove(previousAwnser);
                    guiSecondary test = new guiSecondary(frame);
                    calculation = "";
                    inputBox.setText(calculation);
                    newCalc.clear();
                    SwingUtilities.updateComponentTreeUI(frame);
                }
            }
        });
        SwingUtilities.updateComponentTreeUI(frame);
    }
}
