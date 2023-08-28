package Exercicios_medium;

public class Exercicio07_08_medium {
    public String [] mesesEmVetores() {
        int i = 0;
        String[] vetorMeses;
        vetorMeses = new String[12];

        vetorMeses[0] = "Janeiro";
        vetorMeses[1] = "Fevereiro";
        vetorMeses[2] = "Março";
        vetorMeses[3] = "Abril";
        vetorMeses[4] = "Maio";
        vetorMeses[5] = "Junho";
        vetorMeses[6] = "Julho";
        vetorMeses[7] = "Agosto";
        vetorMeses[8] = "Setembro";
        vetorMeses[9] = "Outubro";
        vetorMeses[10] = "Novembro";
        vetorMeses[11] = "Dezembro";

        return vetorMeses;
        
    }

    public void imprimeMeses(String[] vetorMeses) {
        int i=0;
        while (i < 12) {
            System.out.println("O mês " + (i + 1) + " é " + vetorMeses[i]);
            i++;
        }
    }
}// fim class
