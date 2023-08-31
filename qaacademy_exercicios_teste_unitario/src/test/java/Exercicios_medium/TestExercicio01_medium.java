package Exercicios_medium;

import org.junit.BeforeClass;
import org.junit.Test;

import qaacademy_exercicios_teste_unitario.Exercicios_medium.Exercicio01_medium;

public class TestExercicio01_medium {
    static Exercicio01_medium exercicio01_medium;

    @BeforeClass
    public static void before (){
        exercicio01_medium = new Exercicio01_medium();
    }

    @Test
    public void testeVerificarParEImpar (){
        exercicio01_medium.verificarParEImpar();
    }
    
}
