package Exercicios_medium;

import javax.swing.JOptionPane;

public class Execucao06a10_medium {
    public static void main(String[] args) {
      
    //Exercicio06_medium
    String fatorialStg = JOptionPane.showInputDialog("Digite um número para ser calculado seu fatorial!");
    int fatorial = Integer.parseInt(fatorialStg);

    Exercicio06_medium exercicio06_medium = new Exercicio06_medium();
    exercicio06_medium.calculoFatorial(fatorial);

    System.out.println("O fatorial do número digitado é = " + exercicio06_medium.calculoFatorial(fatorial));


    //Exercicio07_08_medium
    Exercicio07_08_medium exercicio07_08_medium = new Exercicio07_08_medium();
    String [] vetorMeses = exercicio07_08_medium.mesesEmVetores();
    exercicio07_08_medium.imprimeMeses(vetorMeses);


    //Exercicio09_medium
    Exercicio09_medium exercicio09_medium = new Exercicio09_medium();
    exercicio09_medium.vetorNomesENumeros();


    //Exercicio10_medium
    Exercicio10_medium exercicio10_medium = new Exercicio10_medium();
    exercicio10_medium.calculoFibonacci();


    }
}
