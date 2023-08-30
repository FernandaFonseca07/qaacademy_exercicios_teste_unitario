package Exercicios_medium;

import java.text.DecimalFormat;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import qaacademy_exercicios_teste_unitario.Exercicios_medium.Exercicio02_medium;

public class TestExercicio02_medium {
    static Exercicio02_medium exercicio02_medium;
    static DecimalFormat decimalFormat;

    @BeforeClass
    public static void before(){
        exercicio02_medium = new Exercicio02_medium();
        decimalFormat = new DecimalFormat("###0.00");
    }

    @Test
    public void testeValorInvestimentoEmDezAnos (){
        String valorEsperado = "16288,95";
        String valorAtual = decimalFormat.format(exercicio02_medium.valorInvestimentoEmDezAnos(10000));

        Assert.assertEquals(valorEsperado, valorAtual);
    }

}
