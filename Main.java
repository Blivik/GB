package geekbrains.org;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    int counter = 0;
    Font font = new Font("Arial", Font.BOLD, 32);

    public Main(){
        setTitle("First App");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300,300,200,200);
        JLabel label = new JLabel();
        label.setFont(font);
        label.setHorizontalAlignment(SwingConstants.CENTER);

        setLayout(new GridLayout(1,2));

        JButton buttonMinus = new JButton("<");

        buttonMinus.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    counter--;
                    label.setText(String.valueOf(counter));

                }
            });

        JButton buttonPlus = new JButton(">");


        buttonPlus.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                counter++;
                label.setText(String.valueOf(counter));
            }
        });
        add(buttonMinus);
        add(label, BorderLayout.CENTER);
        add(buttonPlus);

        setVisible(true);

    }

    public static void main(String[] args) {

        new Main();

    }
}
