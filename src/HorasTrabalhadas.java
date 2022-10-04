import java.util.Scanner;

// 8- Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
// Calcule e mostre o total do seu salário no referido mês.

public class HorasTrabalhadas {
    public static void main(String[] args){
        // Requisito 1: Solicitar quanto ganha por hora e horas trab.
        Scanner userInput = new Scanner(System.in);
        System.out.println("Digite quanto você ganha por hora: ");
        double sal_hora = userInput.nextDouble();

        System.out.println("Digite quantas horas você trabalha por mês: ");
        double horas_trab = userInput.nextDouble();

        // Requisito 2: Calcular e mostrar o total do salário no mês.
        System.out.println("O seu salário no referido mês é: R$ " + (sal_hora * horas_trab));
    }
}
