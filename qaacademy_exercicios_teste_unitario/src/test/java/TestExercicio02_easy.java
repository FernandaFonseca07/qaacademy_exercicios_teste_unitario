import org.junit.Assert;
import org.junit.Test;

import qaacademy_exercicios_teste_unitario.Exercicios_easy.Exercicio02_easy;

public class TestExercicio02_easy {
        
    @Test
    public void testRetornarPalavra (){ 
        Exercicio02_easy exercicio02_easy = new Exercicio02_easy();
        Assert.assertEquals("Test", exercicio02_easy.retornarPalavra("Test"));
    }
}
