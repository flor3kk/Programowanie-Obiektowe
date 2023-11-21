package programowanie_rok2_lab2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class zad2 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("tytul");
        frame.setBounds(100, 100, 550, 500);

        CustomJPanel custom = new CustomJPanel();
        frame.add(custom);

        JMenuBar pasek = new JMenuBar();
        JMenu szach = new JMenu("szachownica");
        JMenu kalk = new JMenu("kalkulator");
        JMenu rejestr = new JMenu("rejestracja");

        JMenuItem chess = new JMenuItem("szachownica");
        szach.add(chess);

        JMenuItem klik = new JMenuItem("kalkulator");
        kalk.add(klik);

        JMenuItem rejestracja = new JMenuItem("rejestracja");
        rejestr.add(rejestracja);

        pasek.add(szach);
        pasek.add(kalk);
        pasek.add(rejestr);

        chess.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Szachownica szachownica = new Szachownica();
                System.out.println("szachownica");
            }
        });

        klik.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Calculator kalk = new Calculator();
                System.out.println("uruchamiam kalkulator");
            }
        });

        rejestracja.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Rejestracja rejestr  = new Rejestracja();
                System.out.println("rejestracja");
            }
        });

        frame.add(pasek, BorderLayout.NORTH);
        frame.setVisible(true);
    }

}
