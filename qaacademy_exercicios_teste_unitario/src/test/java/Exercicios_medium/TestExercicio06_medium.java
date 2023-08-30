package Exercicios_medium;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import qaacademy_exercicios_teste_unitario.Exercicios_medium.Exercicio06_medium;

public class TestExercicio06_medium {
    static Exercicio06_medium exercicio06_medium;

    @BeforeClass
    public static void before (){
        exercicio06_medium = new Exercicio06_medium();
    }
    
    @Test
    public void testeCalculoFatorial (){
        int valorEsperado = 2;
        int valorAtual = exercicio06_medium.calculoFatorial(2);

        Assert.assertEquals(valorEsperado, valorAtual);
    }
    
}
