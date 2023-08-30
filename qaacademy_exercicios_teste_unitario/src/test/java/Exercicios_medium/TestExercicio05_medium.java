package Exercicios_medium;

import org.junit.BeforeClass;
import org.junit.Test;

import qaacademy_exercicios_teste_unitario.Exercicios_medium.Exercicio05_medium;

public class TestExercicio05_medium {
    static Exercicio05_medium exercicio05_medium;

    @BeforeClass
    public static void before (){
        exercicio05_medium = new Exercicio05_medium();
    }
    
    @Test
    public void testeMenorNumeroDigitado (){
        exercicio05_medium.menorNumeroDigitado();
    }
}
