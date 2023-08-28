import org.junit.Assert;
import org.junit.Test;

import qaacademy_exercicios_teste_unitario.Exercicios_easy.Exercicio03_easy;

public class TestExercicio03_easy {

    @Test
    public void testeRetornarValorTrocado (){
        Exercicio03_easy exercicio03_easy = new Exercicio03_easy();
        String valorEsperado, valorAtual;

        valorEsperado = "O primeiro valor é: segundoValor\nO segundo valor é: primeiroValor";
        valorAtual = exercicio03_easy.retornarValorTrocado("primeiroValor", "segundoValor");
        Assert.assertEquals(valorEsperado, valorAtual);

    }
    
}
