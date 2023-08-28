import org.junit.Assert;
import org.junit.Test;

import qaacademy_exercicios_teste_unitario.Exercicios_easy.Exercicio04_easy;

public class TestExercicio04_easy {
    
    @Test
    public void testCalcularDobro () {
        Exercicio04_easy exercicio04_easy = new Exercicio04_easy();

        int valorEsperado, valorAtual;
        valorEsperado = 20;
        valorAtual = exercicio04_easy.calcularDobro(10);

        Assert.assertEquals(valorEsperado, valorAtual);
    }
}
