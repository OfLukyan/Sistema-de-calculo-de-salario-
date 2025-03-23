package Application;

import Entities.Funcionario;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        funcionario.name = entrada.nextLine();
        funcionario.grossSalary = entrada.nextDouble();
        funcionario.percentage = entrada.nextDouble();
        funcionario.IncreaseSalary(funcionario.percentage);
        funcionario.tax = entrada.nextDouble();

        System.out.println(funcionario);

        entrada.close();
    }
}