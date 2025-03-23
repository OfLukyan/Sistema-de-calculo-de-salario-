package Entities;

public class Funcionario {

    public String name;
    public double grossSalary;
    public double tax;
    public double percentage;

    public double netSalary() {
        return this.grossSalary - (this.grossSalary * tax / 100);
    }
    public void IncreaseSalary(double percentage) {
        this.grossSalary += ( this.grossSalary * percentage / 100);
    }
    public String toString() {
        return "nome do funcionario: " + name + ", salario bruto: " + grossSalary + ", taxa de aumento ao salario bruto: " + percentage + ", taxa ao salario bruto " + tax + ", salario liquido: " + netSalary();
    }
}