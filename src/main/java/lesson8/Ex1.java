package lesson8;

import javax.swing.*;
import java.awt.*;

public class Ex1 extends JFrame {
    public Ex1() {
        setTitle("Test window");
        setBounds(400, 300, 300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JButton button = new JButton("Новая кнопка");
        add(button);

        setVisible(true);


    }
}