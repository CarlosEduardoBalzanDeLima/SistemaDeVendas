package telas;

import models.Clientes;
import models.Funcionarios;
import java.util.Scanner;

public class Login {
    public static String login() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Você deseja entrar no sistema como: \n" +
                "C - Cliente\n" +
                "F - Funcionário\n" +
                "S - Sair");
        String decisaoEntrada = sc.nextLine();
        String decisaoSaida = null;

        if (decisaoEntrada.equals("C") || decisaoEntrada.equals("c")) {
            Clientes cliente = new Clientes();
            System.out.println(cliente.darBoasVindas());
            decisaoSaida = "C";
        } else if (decisaoEntrada.equals("F") || decisaoEntrada.equals("f")) {
            Funcionarios funcionario = new Funcionarios();
            System.out.println(funcionario.darBoasVindas());
            decisaoSaida = "F";
        } else if (decisaoEntrada.equals("s")) {
            decisaoSaida = "S";
        }
        return decisaoSaida;
    }
}
