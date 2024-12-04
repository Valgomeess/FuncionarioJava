

package com.mycompany.mavenproject2;

import java.util.HashMap;
import java.util.Map;

public class TesteFuncionario {
    public static void main(String[] args) {
        // HashMap para armazenar os funcionários
        HashMap<Integer, Funcionario> funcionarios = new HashMap<>();

        // Add alguns funcionários ao HashMap
        funcionarios.put(1, new Funcionario("Elisa", 3000.00));
        funcionarios.put(2, new Funcionario("Miguel", 4000.00));
        funcionarios.put(3, new Funcionario("Enzo", 3500.00));

        //  Exibir os funcionários no HashMap
        System.out.println("Funcionarios cadastrados:");
        for (Map.Entry<Integer, Funcionario> entry : funcionarios.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", " + entry.getValue());
        }
    }
}