package exercicio04;

public class Funcionario {
    String nomeFuncionario;
    String cargoFuncionario;
    double salario;

    public Funcionario (String nomeFuncionario, String cargoFuncionario, double salario){
        this.nomeFuncionario = nomeFuncionario;
        this.cargoFuncionario = cargoFuncionario;
        this.salario = salario;

    }
    public double AumentoSalario(double porcentagem, double salario){
        salario += salario * porcentagem/100;
        return salario;
    }
    public double AumentarSalarioCargo(double porcentagem, String cargoFuncionario){
        if(this.cargoFuncionario.equalsIgnoreCase(cargoFuncionario)){
            salario = AumentoSalario(porcentagem, salario);
        }
        return salario;
    }

    public String PromoverCargo(String cargoNovo, String cargoFuncionario) {
        cargoFuncionario = cargoNovo;
        return cargoFuncionario;
    }




}
