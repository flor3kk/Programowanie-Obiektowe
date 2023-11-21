package programowanie_rok2_lab2;

import javax.swing.*;
import java.awt.*;

public class Szachownica {

    public Szachownica() {

        JFrame frame = new JFrame();
        frame.setTitle("szachownica");
        frame.setBounds(100, 100 ,500 ,500);
        frame.setVisible(true);

        JPanel szachownica = new JPanel(new GridLayout(8,8));
        for (int i = 0; i<8; i++){
            for (int j =0; j<8; j++){
                JPanel kwadrat = new JPanel();
                if ((i + j) % 2 != 0){
                    kwadrat.setBackground(Color.BLACK);
                }else kwadrat.setBackground(Color.WHITE);
                szachownica.add(kwadrat);
            }
        }

        frame.add(szachownica);
    }
}
