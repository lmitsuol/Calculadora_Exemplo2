/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package formas;

import static org.junit.jupiter.api.Assertions.assertEquals; // AssertsEqual
import org.junit.jupiter.api.Test; // marcador de test

/**
 *
 * @author guiho
 */
public class TrianguloTest {

    @Test // Indica que o método abaixo é um teste
    public void testGetArea() {
        // cria um objeto Triangulo com base 10 e altura 5
        Triangulo triangulo = new Triangulo(10, 5);

        // calcula a área esperada: (10 * 5) / 2 = 25
        double expectedArea = 25.0;

        // pega o valor da área retornado pela função getArea()
        double actualArea = triangulo.getArea();

        // Verifica se a área retornada é igual à esperada
        assertEquals(expectedArea, actualArea, 0, "Área do triângulo incorreta");
    }
}