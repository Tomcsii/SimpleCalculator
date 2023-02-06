package Calculator_Tamas_Borbely;

//BY TAMAS BORBELY

import java.awt.*;
import javax.swing.*;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.event.*;
import java.io.File;

public class mainFrame {

    public mainFrame() {
        JFrame frame = new JFrame("Main Window");
        frame = new JFrame();
        frame.setTitle("Calculator");
        frame.setSize(550, 875);
        frame.setResizable(false);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(null);

        JLabel credits = new JLabel();
        credits.setText("BY: TAMAS BORBELY");
        credits.setBounds(25, 810, 125, 20);
        credits.setForeground(new Color(192,192,192));
        frame.add(credits);

        guiMain newWindow = new guiMain(frame);

        frame.setVisible(true);

        SwingUtilities.updateComponentTreeUI(frame);
    }
    

    public static void main(String args[]) {
        new mainFrame();
    }
}
