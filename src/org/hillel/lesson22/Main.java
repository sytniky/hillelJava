package org.hillel.lesson22;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by yuriy on 25.02.16.
 */
public class Main {

    public static void main(String[] args) {
        JFrame frame = new MyForm();
    }
}

class MyForm extends JFrame {

    private JTextArea textArea;
    private JTextArea textArea1;
    private JButton button;


    public MyForm() {
        super("Some form");

        textArea = new JTextArea();
        textArea1 = new JTextArea();
        button = new JButton("PUSH");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("Button clicked\n");
            }
        });

        setLayout(new BorderLayout());
        add(textArea, BorderLayout.NORTH);
        add(textArea1, BorderLayout.CENTER);
        add(button, BorderLayout.SOUTH);

        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}