package exercicio04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario fu = new Funcionario("Ana", "Estag", 4000);
        String nomeFuncionario;
        String cargoFuncionario;
        double salario;
        double porcentagem;
        String cargoNovo;
        Funcionario[] f = new Funcionario[1];

        for (int i = 0; i < f.length; i++) {
            System.out.println("Nome: ");
            nomeFuncionario = sc.next();
            System.out.println("Cargo: ");
            cargoFuncionario = sc.next();
            System.out.println("Salario: ");
            salario = sc.nextDouble();
            f[i] = new Funcionario(nomeFuncionario, cargoFuncionario, salario);
        }


        System.out.println("Insira a porcentagem de aumento");
        porcentagem = sc.nextDouble();

        System.out.println("Insira o seu novo cargo --> ");
        cargoNovo = sc.next();

        System.out.println(fu.PromoverCargo(cargoNovo, fu.cargoFuncionario));
        
    }
}
