package Exercicios_medium;

import org.junit.BeforeClass;
import org.junit.Test;

import qaacademy_exercicios_teste_unitario.Exercicios_medium.Exercicio04_medium;

public class TestExercicio04_medium {
    static Exercicio04_medium exercicio04_medium;

    @BeforeClass
    public static void before (){
        exercicio04_medium = new Exercicio04_medium();
    }

    @Test
    public void testeExibirResultadoMilInteracoes (){
        exercicio04_medium.exibirResultadoMilInteracoes();
    }
}
