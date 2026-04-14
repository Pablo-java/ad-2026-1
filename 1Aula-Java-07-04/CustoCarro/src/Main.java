import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o custo de fábrica: ");
        double custoFabrica = scanner.nextDouble();

        double impostos = custoFabrica * 0.45;
        double custoComImposto = custoFabrica + impostos;

        double distribuidor = custoComImposto * 0.28;
        double custoFinal = custoComImposto + distribuidor;

        System.out.println("Custo ao consumidor: R$ " + custoFinal);
    }
}