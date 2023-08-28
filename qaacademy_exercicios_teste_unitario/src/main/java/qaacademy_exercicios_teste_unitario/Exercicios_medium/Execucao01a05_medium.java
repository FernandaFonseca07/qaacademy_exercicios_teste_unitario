package qaacademy_exercicios_teste_unitario.Exercicios_medium;

import javax.swing.JOptionPane;

public class Execucao01a05_medium {

    public static void main(String[] args) {

        
    //Exercicio01_medium
    Exercicio01_medium exercicio01_medium = new Exercicio01_medium();
    exercicio01_medium.verificarParEImpar();


    //Exercicio02_medium
    String valorInvestimentoStg = JOptionPane.showInputDialog("Digito o valor do investimento");
    double valorInvestimento, valorTotalInvestimento;
    valorInvestimento = Double.parseDouble(valorInvestimentoStg);
    
    Exercicio02_medium exercicio02_medium = new Exercicio02_medium();
    valorTotalInvestimento = exercicio02_medium.valorInvestimentoEmDezAnos(valorInvestimento);

    System.out.println("O valor inicial do investimento é: R$ " + valorInvestimento);
    System.out.println("O valor total do juros é: R$" + (valorTotalInvestimento - valorInvestimento));
    System.out.println("O valor total do investimento em 10 anos é: R$ " + valorTotalInvestimento);


    //Exercicio03_medium
    Exercicio03_medium exercicio03_medium = new Exercicio03_medium();
    exercicio03_medium.calcularInteracoesComBreak();


    //Exercicio04_medium
    Exercicio04_medium exercicio04_medium = new Exercicio04_medium();
    exercicio04_medium.exibirResultadoMilInteracoes();


    //Exercicio05_medium
    Exercicio05_medium exercicio05_medium = new Exercicio05_medium();
    exercicio05_medium.menorNumeroDigitado();



    }
}
