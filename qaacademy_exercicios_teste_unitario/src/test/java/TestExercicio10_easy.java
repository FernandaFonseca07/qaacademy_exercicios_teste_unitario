import java.text.DecimalFormat;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import qaacademy_exercicios_teste_unitario.Exercicios_easy.Exercicio10_easy;

public class TestExercicio10_easy {
    static Exercicio10_easy exercicio10_easy;
    static DecimalFormat decimalFormat;

    @BeforeClass
    public static void before (){
        exercicio10_easy = new Exercicio10_easy();
        decimalFormat = new DecimalFormat("###0.00");
    }

    @Test
    public void testeValorJuros (){
        String valorEsperado = "2500,00";
        String valorAtual = decimalFormat.format(exercicio10_easy.calculoJuros(5000));

        Assert.assertEquals(valorEsperado, valorAtual);

    }
}
