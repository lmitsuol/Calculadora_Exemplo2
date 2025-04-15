package formas;

import static org.junit.jupiter.api.Assertions.assertEquals; // igual ao outro, para o uso do AssertEquals
import org.junit.jupiter.api.Test; // marcador para uso do teste

public class RetanguloTest {

    @Test // test usado para que o método abaixo seja um teste
    public void testGetArea() {
        // cria um objeto Retangulo com base 8 e altura 4
        Retangulo retangulo = new Retangulo(8, 4);

        // calcula a área esperada: 8 * 4 = 32
        double expectedArea = 32.0;

        // pega o valor da área retornado pela função getArea()
        double actualArea = retangulo.getArea();

        // verifica se a área retornada é igual à esperada
        assertEquals(expectedArea, actualArea, 0, "Área do retângulo incorreta");
    }
}
