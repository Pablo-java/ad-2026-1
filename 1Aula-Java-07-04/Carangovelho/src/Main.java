import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char opcao = 'S';
        int totalCarros = 0;
        int carrosAte2010 = 0;

        while (opcao == 'S' || opcao == 's') {
            System.out.print("Digite o valor do carro: ");
            double valor = scanner.nextDouble();

            System.out.print("Digite o ano do carro: ");
            int ano = scanner.nextInt();

            double desconto;

            if (ano <= 2010) {
                desconto = valor * 0.12;
                carrosAte2010++;
            } else {
                desconto = valor * 0.07;
            }

            double valorFinal = valor - desconto;

            System.out.println("Desconto: R$ " + desconto);
            System.out.println("Valor a pagar: R$ " + valorFinal);

            totalCarros++;

            System.out.print("Deseja continuar? (S/N): ");
            opcao = scanner.next().charAt(0);
        }

        System.out.println("\nTotal de carros até 2010: " + carrosAte2010);
        System.out.println("Total geral de carros: " + totalCarros);
    }
}