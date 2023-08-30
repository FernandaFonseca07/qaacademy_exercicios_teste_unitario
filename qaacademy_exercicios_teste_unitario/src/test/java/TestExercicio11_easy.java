import org.junit.BeforeClass;
import org.junit.Test;

import qaacademy_exercicios_teste_unitario.Exercicios_easy.Exercicio11_easy;

public class TestExercicio11_easy {
    static Exercicio11_easy exercicio11_easy;

    @BeforeClass
    public static void before() {
        exercicio11_easy = new Exercicio11_easy();
    }

    @Test
    public void testeCalculoInteracoes() {
        exercicio11_easy.calculoInteracoes(50);
    }

}
