package qaacademy_exercicios_teste_unitario.Exercicios_easy;

public class Exercicio06_easy {

    public String verificaMediaEAprovacao (double nota1, double nota2) {
        double media;
        media = (nota1 + nota2) / 2;

        if (media > 5) {
            return "O aluno foi aprovado";
        }

        if (media < 5) {
            return "O aluno foi reprovado";
        }

        else {
            return "O aluno está de exame";
        }

    }
}