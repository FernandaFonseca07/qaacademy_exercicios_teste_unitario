package qaacademy_exercicios_teste_unitario.Exercicios_easy;

import javax.swing.JOptionPane;

public class ExecucaoExercicio06Ao11_easy {
    public static void main(String[] args) {

        // // Exercicio06_easy
        // String nota1digitada, nota2digitada;
        // nota1digitada = JOptionPane.showInputDialog("Digite a primeira nota");
        // nota2digitada = JOptionPane.showInputDialog("Digite a segunda nota");

        // double nota1, nota2;
        // nota1 = Double.parseDouble(nota1digitada);
        // nota2 = Double.parseDouble(nota2digitada);

        // Exercicio06_easy exercicio06_easy = new Exercicio06_easy();
        // System.out.println(exercicio06_easy.verificaMediaEAprovacao(nota1, nota2));

        // Exercicio07_easy
        String salarioDigitado;

        salarioDigitado = JOptionPane.showInputDialog("Digite seu salário para calcular o INSS!");
        double salario = Double.parseDouble(salarioDigitado);

        Exercicio07_easy exercicio07_easy = new Exercicio07_easy();
        System.out.println("O valor do INSS a ser pago é: R$ " + exercicio07_easy.calcularINSS(salario));

        double inss = exercicio07_easy.calcularINSS(salario);
        System.out.println("O valor do salário com desconto do INSS é: R$ " + (salario - inss));

        // // Exercicio08_easy
        // String salarioBrutoDigitado = JOptionPane
        //         .showInputDialog("Digite o valor do seu salário para calcular o Imposto de Renda!");
        // double salarioBruto = Double.parseDouble(salarioBrutoDigitado);

        // Exercicio08_easy exercicio08_easy = new Exercicio08_easy();
        // System.out.println("O seu salário bruto é = R$ " + (salarioBruto));

        // double impostoRenda = (salarioBruto - exercicio08_easy.calcularImpostoDeRenda(salarioBruto));
        // System.out.println("O Imposto de Renda a ser pago é = R$ " + (impostoRenda));

        // System.out.println("O salário líquido é = R$ " + exercicio08_easy.calcularImpostoDeRenda(salarioBruto));

        // // Exercicio09_easy
        // String numeroDigitado = JOptionPane.showInputDialog("Digite um número inteiro para calcular tabuada");
        // int numero = Integer.parseInt(numeroDigitado);

        // Exercicio09_easy exercicio09_easy = new Exercicio09_easy();
        // exercicio09_easy.calcularTabuada(numero);


        // // Exercicio10_easy
        // String valorInvestimentoDigitado = JOptionPane.showInputDialog("Digite o valor do seu investimento!");
        // double valorInvestimento = Double.parseDouble(valorInvestimentoDigitado);

        // Exercicio10_easy exercicio10_easy = new Exercicio10_easy();
        // double valorJuros, valorTotalInvestimento;

        // valorJuros = exercicio10_easy.calculoJuros(valorInvestimento);
        // valorTotalInvestimento = valorInvestimento + valorJuros;

        // System.out.println("O valor do investimento inicial é: R$ " + (valorInvestimento));
        // System.out.println("O valor do juros em 10 anos é: R$ " + valorJuros);
        // System.out.println("O valor total do investimento em 10 anos é: R$ " + valorTotalInvestimento);



        // // Exercicio11_easy
        // String numeroDigitadoExercicio11 = JOptionPane.showInputDialog("Digite um número!");
        // numero = Integer.parseInt(numeroDigitadoExercicio11);

        // Exercicio11_easy exercicio11_easy = new Exercicio11_easy();
        // exercicio11_easy.calculoInteracoes(numero);

    }

}
