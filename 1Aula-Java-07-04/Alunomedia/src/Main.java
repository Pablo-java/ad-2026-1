import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Float nota1, nota2, nota3, media;
        String nome;

        System.out.printf("Digite o nome do aluno: ");
        Scanner entradaDados = new Scanner(System.in);
        nome = entradaDados.next();
        System.out.printf("Digite a primeira nota do aluno: ");
        nota1 = entradaDados.nextFloat();
        System.out.printf("Digite a segunda nota do aluno: ");
        nota2 = entradaDados.nextFloat();
        System.out.printf("Digite a terceira nota do aluno: ");
        nota3 = entradaDados.nextFloat();
        media = (nota1 + nota2 + nota3) / 3;

        System.out.println("Nome do aluno: "+ nome);
        System.out.println("Média do aluno: "+ media);
    }
}