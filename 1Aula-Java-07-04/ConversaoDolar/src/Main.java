import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a cotação do dólar: ");
        float cotacao = scanner.nextFloat();

        System.out.print("Digite a quantidade de dólares: ");
        float dolares = scanner.nextFloat();

        float reais = dolares * cotacao;

        System.out.println("Valor em reais: R$ " + reais);

    }
}