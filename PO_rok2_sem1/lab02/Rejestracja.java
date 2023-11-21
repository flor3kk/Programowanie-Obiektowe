package programowanie_rok2_lab2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Rejestracja {

    public Rejestracja() {

        JFrame frame = new JFrame();
        frame.setTitle("rejestracja");
        frame.setBounds(100, 100, 200, 270);
        frame.setVisible(true);

        JPanel rejestracja = new JPanel();

        JLabel imie = new JLabel("imie:");
        rejestracja.add(imie);
        JTextField imiee = new JTextField(15);
        rejestracja.add(imiee);

        JLabel nazwisko = new JLabel("nazwisko: ");
        rejestracja.add(nazwisko);
        JTextField nazwiskoo = new JTextField(15);
        rejestracja.add(nazwiskoo);

        JLabel haslo = new JLabel("haslo: ");
        rejestracja.add(haslo);
        JPasswordField hasloo = new JPasswordField(15);
        rejestracja.add(hasloo);


        JLabel powtorz = new JLabel("powtroz haslo: ");
        rejestracja.add(powtorz);
        JPasswordField powtorzz = new JPasswordField(15);
        rejestracja.add(powtorzz);

        JButton zaloguj = new JButton("zaloguj");
        rejestracja.add(zaloguj);

        zaloguj.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (nazwiskoo.getText().length() != 0 && imiee.getText().length() != 0) {
                    if (hasloo.getPassword().length != 0 || powtorzz.getPassword().length != 0) {
                        if (Arrays.equals(hasloo.getPassword(), powtorzz.getPassword())) {
                            JOptionPane.showMessageDialog(null, "zostales pomyslnie zarejestrowany");
                            JOptionPane.showMessageDialog(null, "siema" + imiee.getText());

                        } else JOptionPane.showMessageDialog(null, "hasla sie nie zgadzaja ");
                    } else JOptionPane.showMessageDialog(null, "nie powtorzyles hasla");
                } else JOptionPane.showMessageDialog(null, "nazwisko albo imie pozostalo puste");
            }
        });

        frame.add(rejestracja);

    }
}
