public class Funcionario {

    String nome = "";

    float salario = 0;


    float calcularSalario(float bonusFuncionario, float descontoSalario) {
        float newSalarioBonus = salario * bonusFuncionario;
        float newSalarioDesconto = salario - (salario * descontoSalario) ;
        float salarioFinal = newSalarioDesconto + newSalarioBonus;
        return salarioFinal;
    }
}
