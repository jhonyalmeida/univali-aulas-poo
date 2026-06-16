package br.univali.turma2601.aula15;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class JanelaFoto extends JFrame {

    public JanelaFoto(Foto foto) {
        super("Grayscale Image");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new JLabel(new ImageIcon(foto.toImage())));
        pack();
        setLocationRelativeTo(null);
    }

    public void exibir() {
        setVisible(true);
    }

}
