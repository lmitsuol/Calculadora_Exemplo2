package formas;

import formas.Retangulo;
import formas.Triangulo;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        String opcao = "";
        Triangulo triangulo = new Triangulo();
        Retangulo retangulo = new Retangulo();

        while (!opcao.equals("9")) {
            opcao = JOptionPane.showInputDialog("""
                    1 - Leitura Triângulo
                    2 - Área Triângulo
                    3 - Leitura Retângulo
                    4 - Área Retângulo
                    9 - Sair""");

            switch (opcao) {
                case "1" -> {
                    double base = Double.parseDouble(JOptionPane.showInputDialog("Base do Triângulo:"));
                    double altura = Double.parseDouble(JOptionPane.showInputDialog("Altura do Triângulo:"));
                    triangulo.setBase(base);
                    triangulo.setAltura(altura);
                }

                case "2" -> {
                    double area = triangulo.getArea();
                    JOptionPane.showMessageDialog(null, "Área Triângulo: " + area);
                }

                case "3" -> {
                    double base = Double.parseDouble(JOptionPane.showInputDialog("Base do Retângulo:"));
                    double altura = Double.parseDouble(JOptionPane.showInputDialog("Altura do Retângulo:"));
                    retangulo.setBase(base);
                    retangulo.setAltura(altura);
                }

                case "4" -> {
                    double area = retangulo.getArea();
                    JOptionPane.showMessageDialog(null, "Área Retângulo: " + area);
                }

                case "9" ->
                    JOptionPane.showMessageDialog(null, "Encerrando o programa.");

                default ->
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        }
    }
}
