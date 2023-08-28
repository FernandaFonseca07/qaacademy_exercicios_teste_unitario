package qaacademy_exercicios_teste_unitario.Exercicios_easy;

public class Exercicio08_easy {
    public double calcularImpostoDeRenda(double salarioBruto) {
        double impostoRenda=0.0, salarioLiquido=0.0;

        if (salarioBruto <= 1903.98) {
            impostoRenda = 0.0;
            return salarioLiquido = salarioBruto;
        }

        if (salarioBruto >= 1903.99 && salarioBruto <=2826.65) {
            impostoRenda = (salarioBruto * 0.075) - 142.80;
            return salarioLiquido = salarioBruto - impostoRenda;
        }

        if (salarioBruto >= 2826.66 && salarioBruto <=3751.05) {
            impostoRenda = (salarioBruto * 0.15) - 354.80;
            return salarioLiquido = salarioBruto - impostoRenda;
        }

        if (salarioBruto >= 3751.06 && salarioBruto <=4664.68) {
            impostoRenda = (salarioBruto * 0.225) - 636.13;
            return salarioLiquido = salarioBruto - impostoRenda;
        }

        if (salarioBruto >=4664.69) {
            impostoRenda = (salarioBruto * 0.275) - 869.36;
            return salarioLiquido = salarioBruto - impostoRenda;
        }

        return 0.0;

    }
    
}
