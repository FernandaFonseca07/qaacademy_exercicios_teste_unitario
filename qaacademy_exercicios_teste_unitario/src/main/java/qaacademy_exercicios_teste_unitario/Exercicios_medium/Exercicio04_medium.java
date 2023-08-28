package qaacademy_exercicios_teste_unitario.Exercicios_medium;
public class Exercicio04_medium {

    public void exibirResultadoMilInteracoes () {
        int i=1, multiplicacao = 1;

        while (i <= 1000) {
            multiplicacao = multiplicacao * i;
            System.out.println("A " + i + " interação, resulta em: " + multiplicacao);
            i++;

            if (multiplicacao >= 1000) {
                multiplicacao = 1;
            }
        }
    } //fim main
    
} // fim class
