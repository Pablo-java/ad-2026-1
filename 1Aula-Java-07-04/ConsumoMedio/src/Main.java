import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                float distanciaTotal;
                float TotalcombustivelGasto;
                float consumoMedio;

                System.out.print("Digite a distância total: ");
                distanciaTotal = scanner.nextFloat();

                System.out.print("Digite o combustível gasto: ");
                TotalcombustivelGasto = scanner.nextFloat();

                consumoMedio = distanciaTotal / TotalcombustivelGasto;

                System.out.println("Consumo médio: " + consumoMedio + " km/l");
    }
}