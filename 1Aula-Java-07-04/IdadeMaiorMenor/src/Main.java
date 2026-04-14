import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual a sua idade?: ");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.print("Você é maior de idade");
        }
        else if (idade >= 60) {
            System.out.print("Você é idoso");
        }

        else {
            System.out.print("Você é menor de idade");
        }
    }
}