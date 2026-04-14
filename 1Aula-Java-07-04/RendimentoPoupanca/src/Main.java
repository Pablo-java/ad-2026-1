import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor depositado: ");
        double valor = scanner.nextDouble();

        double rendimento = valor * 0.007;
        double valorFinal = valor + rendimento;

        System.out.println("Valor após 1 mês: R$ " + valorFinal);
    }
}