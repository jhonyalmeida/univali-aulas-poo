package br.univali.gui;

import javax.swing.*;
import java.awt.*;

public class ExemploGUI {

    public ExemploGUI() {
        JFrame frame = new JFrame();
        frame.setMinimumSize(new Dimension(300, 200));

        JPanel panel = new JPanel();
        JLabel label = new JLabel("Digite um número:");
        panel.setLayout(new FlowLayout());

        JTextField text = new JTextField();
        text.setColumns(20);

        JButton button = new JButton("Enviar");
        button.addActionListener(e -> {
            int numero = Integer.parseInt(text.getText());
            JOptionPane.showMessageDialog(frame, "O dobro do número é " + (numero * 2));
        });

        panel.add(label);
        panel.add(text);
        panel.add(button);

        frame.setContentPane(panel);
        frame.setVisible(true);
    }

}
