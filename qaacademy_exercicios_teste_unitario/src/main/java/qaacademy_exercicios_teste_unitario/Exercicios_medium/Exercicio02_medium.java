package qaacademy_exercicios_teste_unitario.Exercicios_medium;

public class Exercicio02_medium {
    public double valorInvestimentoEmDezAnos(double valorInvestimento) {
        double valorTotalInvestimento, juros = 0.05;
        int i = 1;
        valorTotalInvestimento = valorInvestimento;

        while (i <= 10) {
            valorTotalInvestimento = (valorTotalInvestimento * juros) + valorTotalInvestimento;
            i++;
        } // fim while

        return valorTotalInvestimento;


    } // fim maim

} // fim class
