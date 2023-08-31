package Exercicios_medium;

import org.junit.BeforeClass;
import org.junit.Test;

import qaacademy_exercicios_teste_unitario.Exercicios_medium.Exercicio10_medium;

public class TestExercicio10_medium {
    static Exercicio10_medium exercicio10_medium;

    @BeforeClass
    public static void before(){
        exercicio10_medium = new Exercicio10_medium();
    }

    @Test
    public void testeCalculoFibonacci(){
        exercicio10_medium.calculoFibonacci();
    }
    
}
