import java.text.DecimalFormat;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import qaacademy_exercicios_teste_unitario.Exercicios_easy.Exercicio08_easy;

public class TestExercicio08_easy {
    static Exercicio08_easy exercicio08_easy;
    static DecimalFormat decimalFormat;

    @BeforeClass
    public static void before() {
        exercicio08_easy = new Exercicio08_easy();
        decimalFormat = new DecimalFormat("###0.00");
    }

    @Test
    public void testeSalarioLiquidoPrimeiraFaixa() {
        String valorEsperado = "1903,98";
        String valorAtual = decimalFormat.format(exercicio08_easy.calcularImpostoDeRenda(1903.98));

        Assert.assertEquals(valorEsperado, valorAtual);
    }

    @Test
    public void testeSalarioLiquidoSegundaFaixa() {
        String valorEsperado = "1903,99";
        String valorAtual = decimalFormat.format(exercicio08_easy.calcularImpostoDeRenda(1903.99));

        Assert.assertEquals(valorEsperado, valorAtual);
    }

    @Test
    public void testeSalarioLiquidoSegundaFaixaSegundaCondicao() {
        String valorEsperado = "2757,45";
        String valorAtual = decimalFormat.format(exercicio08_easy.calcularImpostoDeRenda(2826.65));

        Assert.assertEquals(valorEsperado, valorAtual);
    }

    @Test
    public void testeSalarioLiquidoTerceiraFaixa() {
        String valorEsperado = "2757,46";
        String valorAtual = decimalFormat.format(exercicio08_easy.calcularImpostoDeRenda(2826.66));

        Assert.assertEquals(valorEsperado, valorAtual);
    }

    @Test
    public void testeSalarioLiquidoTerceiraFaixaSegundaCondicao() {
        String valorEsperado = "3543,19";
        String valorAtual = decimalFormat.format(exercicio08_easy.calcularImpostoDeRenda(3751.05));

        Assert.assertEquals(valorEsperado, valorAtual);
    }

    @Test
    public void testeSalarioLiquidoQuartaFaixa() {
        String valorEsperado = "3543,20";
        String valorAtual = decimalFormat.format(exercicio08_easy.calcularImpostoDeRenda(3751.06));

        Assert.assertEquals(valorEsperado, valorAtual);
    }

    @Test
    public void testeSalarioLiquidoQuartaFaixaSegundaCondicao() {
        String valorEsperado = "4251,26";
        String valorAtual = decimalFormat.format(exercicio08_easy.calcularImpostoDeRenda(4664.68));

        Assert.assertEquals(valorEsperado, valorAtual);
    }

    @Test
    public void testeSalarioLiquidoQuintaFaixa() {
        String valorEsperado = "4251,26";
        String valorAtual = decimalFormat.format(exercicio08_easy.calcularImpostoDeRenda(4664.69));

        Assert.assertEquals(valorEsperado, valorAtual);
    }

    @Test
    public void testeValorInvalido() {
        String valorEsperado = "0,00";
        String valorAtual = decimalFormat.format(exercicio08_easy.calcularImpostoDeRenda(-100000));

        Assert.assertEquals(valorEsperado, valorAtual);
    }

}
