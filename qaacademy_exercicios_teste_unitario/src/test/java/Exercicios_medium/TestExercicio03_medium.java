package Exercicios_medium;

import org.junit.BeforeClass;
import org.junit.Test;

import qaacademy_exercicios_teste_unitario.Exercicios_medium.Exercicio03_medium;

public class TestExercicio03_medium {
    static Exercicio03_medium exercicio03_medium;

    @BeforeClass
    public static void before (){
        exercicio03_medium = new Exercicio03_medium();
    }

    @Test
    public void testeCalcularInteracoesComBreak (){
        exercicio03_medium.calcularInteracoesComBreak();
    }
    
}
