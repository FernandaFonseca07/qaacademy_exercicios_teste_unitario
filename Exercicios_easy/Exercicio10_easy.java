package Exercicios_easy;

public class Exercicio10_easy {
    public double calculoJuros(double valorInvestimento) {
        double taxaJuros = 0.05, valorJuros = 0.0, ano = 1;

        while (ano <= 10) {
            valorJuros = (valorInvestimento * taxaJuros) + valorJuros;
            ano++;
        }
        
        return valorJuros;
    }
}
