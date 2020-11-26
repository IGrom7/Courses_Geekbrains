package ru.geekbrains.com;

import javax.swing.*;
import java.awt.*;

public class MyWindow extends JFrame {
        public MyWindow() {
            setTitle("Расчет ЗП");
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            setBounds(300, 300, 400, 400);
            setVisible(true);
            JButton[] jbs = new JButton[5];
            for (int i = 0; i < 5; i++) {
                jbs[i] = new JButton("#" + i);
            }
            setLayout(new FlowLayout());
            add(jbs[0], BorderLayout.NORTH);
        }
}