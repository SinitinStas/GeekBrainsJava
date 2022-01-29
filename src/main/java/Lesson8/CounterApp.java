package Lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterApp extends JFrame {
    private int value = 0;
    private JLabel infoLabelW;
    private JLabel infoLabelE;

    public CounterApp(){
        setBounds(500, 500, 550, 150);
        setTitle("Counter App");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Font font = new Font("Arial", Font.BOLD, 32);
        Font font2 = new Font("Arial", Font.BOLD, 60);
        Font font3 = new Font("Arial", Font.BOLD, 10);
        setLayout(new GridLayout(1, 3));

        JLabel label = new JLabel(String.valueOf(value));
        label.setFont(font2);
        label.setHorizontalAlignment(SwingConstants.CENTER);

        infoLabelW = new JLabel();
        infoLabelW.setFont(font3);

        infoLabelE = new JLabel();
        infoLabelE.setFont(font3);

        JButton dozenDecrementButton = new JButton("<<");
        dozenDecrementButton.setFont(font);
        dozenDecrementButton.addActionListener(new ActionListener()  {
            @Override
            public void actionPerformed(ActionEvent e) {
                value-=10;
                label.setText(String.valueOf(value));
                validateRange(infoLabelE);
                validateRange(infoLabelW);
            }
        });
        JButton decrementButton = new JButton("<");
        decrementButton.setFont(font);
        decrementButton.addActionListener(new ActionListener()  {
            @Override
            public void actionPerformed(ActionEvent e) {
                value--;
                label.setText(String.valueOf(value));
                validateRange(infoLabelE);
                validateRange(infoLabelW);
            }
        });
        JButton incrementButton = new JButton(">");
        incrementButton.setFont(font);
        incrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value++;
                label.setText(String.valueOf(value));
                validateRange(infoLabelE);
                validateRange(infoLabelW);
            }
        });

        JButton dozenIncrementButton = new JButton(">>");
        dozenIncrementButton.setFont(font);
        dozenIncrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value+=10;
                label.setText(String.valueOf(value));
                validateRange(infoLabelE);
                validateRange(infoLabelW);
            }
        });

        add(dozenDecrementButton);
        add(decrementButton);
        add(infoLabelW);
        add(label);
        add(infoLabelE);
        add(incrementButton);
        add(dozenIncrementButton);
        setVisible(true);
    }

    private void validateRange(JLabel infoLabel) {
        if (Math.abs(value) > 100) {
            infoLabel.setText("<html>Value out <br>of range</html>");
            infoLabel.setHorizontalAlignment(SwingConstants.CENTER);
            infoLabel.setVerticalAlignment(SwingConstants.CENTER);
        } else {
            infoLabel.setText("");
        }
    }

    public static void main(String[] args) {
        new CounterApp();
    }
}
