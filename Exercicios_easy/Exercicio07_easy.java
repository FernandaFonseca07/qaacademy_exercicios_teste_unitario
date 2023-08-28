package Exercicios_easy;

public class Exercicio07_easy {
    
    public double calcularINSS(double salario) {
        double inss=0.0;
      
        if (salario <= 1045.00) {
            return inss = salario * 0.075;
        }

        if (salario >= 1045.01 && salario <=2089.60) {
            return inss = salario * 0.09;
        }

        if (salario >= 2089.61 && salario <=3134.40) {
            return inss = salario * 0.12;
        }

        if (salario >= 3134.41 && salario <=6101.06) {
            return inss = salario * 0.14;
        }

        if (salario >= 6101.07) {
            return inss = 6101.06 * 0.075;
        }
        return inss;
    
    }
}
