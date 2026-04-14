import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        float C, F;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a temperatura em Celsius: ");
        C = Float.parseFloat(scanner.next());

        F = (9 * C + 160) / 5;

        System.out.println("Temperatura em Fahrenheit: " + F);
    }
}