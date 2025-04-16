package calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class TestCalculadora {

    @Test
    void testGetAdicao() {
        //Instancia um objeto da classe Calculadora
        Calculadora calculadora = new Calculadora(4.0, 2.0);
        //Define o valor esperado para a operação
        double retornoEsperado = 6.0;
        //Chama a operacao getSoma()
        double retornoFeito = calculadora.getAdicao();
        //Premissa verifica se os valores são iguais
        assertEquals(retornoEsperado, retornoFeito);
    }

    @Test
    void testGetSubtracao() {
        //Instancia um objeto da classe Calculadora
        Calculadora calculadora = new Calculadora(4.0, 2.0);
        //Define o valor esperado para a operação
        double retornoEsperado = 2.0;
        //Chama a operacao getSubtracao()
        double retornoFeito = calculadora.getSubtracao();
        //Premissa verifica se os valores são iguais	
        assertEquals(retornoEsperado, retornoFeito);
    }

    @Test
    void testGetProduto() {
        //Instancia um objeto da classe Calculadora
        Calculadora calculadora = new Calculadora(4.0, 2.0);
        //Define o valor esperado para a operação
        double retornoEsperado = 8.0;
        //Chama a operacao getProduto()
        double retornoFeito = calculadora.getProduto();
        //Premissa verifica se os valores são iguais	
        assertEquals(retornoEsperado, retornoFeito);
    }

    @Test
    void testGetDivisao() {
        //Instancia um objeto da classe Calculadora
        Calculadora calculadora = new Calculadora(4.0, 2.0);
        //Define o valor esperado para a operação
        double retornoEsperado = 2.0;
        //Chama a operacao getDivisao()
        double retornoFeito = calculadora.getDivisao();
        //Premissa verifica se os valores são iguais	
        assertEquals(retornoEsperado, retornoFeito);
    }
}