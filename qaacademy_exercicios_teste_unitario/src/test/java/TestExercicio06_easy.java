import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import qaacademy_exercicios_teste_unitario.Exercicios_easy.Exercicio06_easy;

public class TestExercicio06_easy {
    static Exercicio06_easy exercicio06_easy;

    @BeforeClass
    public static void before (){
        exercicio06_easy = new Exercicio06_easy();
    }

    
    @Test
    public void testeAprovado (){
        String resultadoEsperado = "O aluno foi aprovado";
        String resultadoAtual = exercicio06_easy.verificaMediaEAprovacao(10, 8);
        Assert.assertEquals(resultadoEsperado, resultadoAtual);
    }

    @Test
    public void testeReprovado (){
        String resultadoEsperado = "O aluno foi reprovado";
        String resultadoAtual = exercicio06_easy.verificaMediaEAprovacao(4, 2);
        Assert.assertEquals(resultadoEsperado, resultadoAtual);
    }

    @Test
    public void testeExame (){
        String resultadoEsperado = "O aluno está de exame";
        String resultadoAtual = exercicio06_easy.verificaMediaEAprovacao(5, 5);
        Assert.assertEquals(resultadoEsperado, resultadoAtual);
    }
    

     @Test
    public void testeValorInvalido (){
        String resultadoEsperado = "Valor invalido. Digite Novamente!";
        String resultadoAtual = exercicio06_easy.verificaMediaEAprovacao(-2, -5);
        Assert.assertEquals(resultadoEsperado, resultadoAtual);
    }
}
