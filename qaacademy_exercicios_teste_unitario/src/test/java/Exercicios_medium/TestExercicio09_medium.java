package Exercicios_medium;

import org.junit.BeforeClass;
import org.junit.Test;

import qaacademy_exercicios_teste_unitario.Exercicios_medium.Exercicio09_medium;

public class TestExercicio09_medium {
    static Exercicio09_medium exercicio09_medium;

    @BeforeClass
    public static void before (){
        exercicio09_medium = new Exercicio09_medium();
    }

    @Test
    public void testeVetorNomesENumeros(){
        exercicio09_medium.vetorNomesENumeros();
    }

    
}
