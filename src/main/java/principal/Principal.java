package principal;

import javax.swing.JOptionPane;
import model.Triangulo;

public class Principal {

    public static void main(String[] args) {

        Triangulo tri1 = new Triangulo();

        tri1.setBase(Double.parseDouble(JOptionPane.
                showInputDialog("Digite a base do triângulo")));
        tri1.setAltura(Double.parseDouble(JOptionPane.
                showInputDialog("Digite a algura do triângulo")));

        JOptionPane.showMessageDialog(null, "A área do triângulo é " + tri1.getArea());
    }
}
