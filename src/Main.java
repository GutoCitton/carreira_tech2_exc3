// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Funcionario gerente = new Funcionario();
        gerente.nome = "Bruno";
        gerente.salario = 1000;

        Funcionario desenvolvedor = new Funcionario();
        desenvolvedor.nome = "Pedro";
        desenvolvedor.salario = 1500;

        System.out.print("O salário final do gerente é de: R$");
        gerente.salario = gerente.calcularSalario(1.1f, 1.15f);
        System.out.println(gerente.salario);

        System.out.print("O salário final do desenvolvedor é de: R$");
        desenvolvedor.salario = desenvolvedor.calcularSalario(1, 1.1f);
        System.out.println(desenvolvedor.salario);
    }
}