package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorUI {
    public JTextField tF_Out;
    public JButton b_01;
    public JButton b_07;
    public JButton b_04;
    public JButton b_08;
    public JButton b_09;
    public JButton b_05;
    public JButton b_06;
    public JButton b_02;
    public JButton b_03;
    public JButton b_del;
    public JButton b_00;
    public JButton b_calc;
    public JButton b_Add;
    public JButton b_sub;
    public JButton b_mult;
    public JButton b_divide;
    public JPanel p_Panel;
    private JButton b_com;

    public JFrame f_Frame = new JFrame("Calculator");

    private boolean firstKlick = false;
    private float C1 = (float) 0.0;
    private float C2 = (float) 0.0;
    private String type = "a";
    private float Summary = (float) 0.0;

    public CalculatorUI() {
        f_Frame.setContentPane(p_Panel);
        f_Frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f_Frame.setLocationRelativeTo(null);
        f_Frame.setSize(400,300);
        f_Frame.setBackground(Color.darkGray);
        f_Frame.setVisible(true);

        Calculation Calc = new Calculation();

        b_00.addActionListener(e -> {
            if (!firstKlick) {
                tF_Out.setText("");
                firstKlick = true;
            }
            tF_Out.setText(tF_Out.getText()+"0");
        });

        b_01.addActionListener(e -> {
            if (!firstKlick) {
                tF_Out.setText("");
                firstKlick = true;
            }
            tF_Out.setText(tF_Out.getText()+"1");
        });

        b_02.addActionListener(e -> {
            if (!firstKlick) {
                tF_Out.setText("");
                firstKlick = true;
            }
            tF_Out.setText(tF_Out.getText()+"2");
        });

        b_03.addActionListener(e -> {
            if (!firstKlick) {
                tF_Out.setText("");
                firstKlick = true;
            }
            tF_Out.setText(tF_Out.getText()+"3");
        });

        b_04.addActionListener(e -> {
            if (!firstKlick) {
                tF_Out.setText("");
                firstKlick = true;
            }
            tF_Out.setText(tF_Out.getText()+"4");
        });

        b_05.addActionListener(e -> {
            if (!firstKlick) {
                tF_Out.setText("");
                firstKlick = true;
            }
            tF_Out.setText(tF_Out.getText()+"5");
        });

        b_06.addActionListener(e -> {
            if (!firstKlick) {
                tF_Out.setText("");
                firstKlick = true;
            }
            tF_Out.setText(tF_Out.getText()+"6");
        });

        b_07.addActionListener(e -> {
            if (!firstKlick) {
                tF_Out.setText("");
                firstKlick = true;
            }
            tF_Out.setText(tF_Out.getText()+"7");
        });

        b_08.addActionListener(e -> {
            if (!firstKlick) {
                tF_Out.setText("");
                firstKlick = true;
            }
            tF_Out.setText(tF_Out.getText()+"8");
        });

        b_09.addActionListener(e -> {
            if (!firstKlick) {
                tF_Out.setText("");
                firstKlick = true;
            }
            tF_Out.setText(tF_Out.getText()+"9");
        });

        b_com.addActionListener(e -> {
            if (!firstKlick) {
                tF_Out.setText("0");
                firstKlick = true;
            }
            tF_Out.setText(tF_Out.getText()+".");
            b_com.setEnabled(false);
        });

        b_del.addActionListener(e -> {
            System.out.println("del");
            if (tF_Out.getText().length() > 0) {
                if (String.valueOf(tF_Out.getText().charAt(tF_Out.getText().length() -1)).equals(".") ) {
                    b_com.setEnabled(true);
                }
                tF_Out.setText(removeLastChar(tF_Out.getText()));
            } else {
                firstKlick = false;
            }
        });

        b_Add.addActionListener(e -> {
            b_com.setEnabled(true);
            C1 = Float.parseFloat(tF_Out.getText());
            tF_Out.setText("");
            type = "a";
            b_Add.setEnabled(false);
            b_sub.setEnabled(false);
            b_mult.setEnabled(false);
            b_divide.setEnabled(false);
            firstKlick = false;
        });

        b_sub.addActionListener(e -> {
            b_com.setEnabled(true);
            C1 = Float.parseFloat(tF_Out.getText());
            tF_Out.setText("");
            type = "s";
            b_Add.setEnabled(false);
            b_sub.setEnabled(false);
            b_mult.setEnabled(false);
            b_divide.setEnabled(false);
            firstKlick = false;
        });

        b_mult.addActionListener(e -> {
            b_com.setEnabled(true);
            C1 = Float.parseFloat(tF_Out.getText());
            tF_Out.setText("");
            type = "m";
            b_Add.setEnabled(false);
            b_sub.setEnabled(false);
            b_mult.setEnabled(false);
            b_divide.setEnabled(false);
            firstKlick = false;
        });

        b_divide.addActionListener(e -> {
            b_com.setEnabled(true);
            C1 = Float.parseFloat(tF_Out.getText());
            tF_Out.setText("");
            type = "d";
            b_Add.setEnabled(false);
            b_sub.setEnabled(false);
            b_mult.setEnabled(false);
            b_divide.setEnabled(false);
            firstKlick = false;
        });

        b_calc.addActionListener(e -> {
            C2 = Float.parseFloat(tF_Out.getText());
            Summary = Calc.Sum(C1, C2, type);
            System.out.println(Summary);
            tF_Out.setText("Ergebnis: "+Summary);
            firstKlick = false;
            b_divide.setEnabled(true);
            b_mult.setEnabled(true);
            b_sub.setEnabled(true);
            b_Add.setEnabled(true);
            b_com.setEnabled(true);
        });

    }

    private static String removeLastChar(String str) {
        return str.substring(0, str.length() - 1);
    }

}
