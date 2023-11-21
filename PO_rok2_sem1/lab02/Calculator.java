package programowanie_rok2_lab2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {


    public Calculator() {
        JFrame kalku = new JFrame();
        kalku.setTitle("kalkulator");
        kalku.setBounds(100, 100, 200, 250);
        kalku.setVisible(true);

        JTextField liczba = new JTextField();
        kalku.add(liczba, BorderLayout.NORTH);

        JPanel panel = new JPanel();

        JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, eq, add, min, mul, div, clear, dot;
        String s0, s1, s2;

        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");

        eq = new JButton("=");
        add = new JButton("+");
        min = new JButton("-");
        mul = new JButton("*");
        div = new JButton("/");
        clear = new JButton("C");
        dot = new JButton(".");

        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(add);
        panel.add(b4);
        panel.add(b5);
        panel.add(b6);
        panel.add(min);
        panel.add(b7);
        panel.add(b8);
        panel.add(b9);
        panel.add(mul);
        panel.add(clear);
        panel.add(b0);
        panel.add(dot);
        panel.add(div);
        panel.add(eq);

        kalku.add(panel);

        b0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                liczba.setText("0");
            }
        });

    }
}
