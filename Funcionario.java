

package com.mycompany.mavenproject2;

import java.util.Objects;

public class Funcionario {

     private String nome;
    private double salario;

    // Construtor
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método para exibir os dados do funcionário
    @Override
    public String toString() {
        return "Nome: " + nome + ", Salário: R$ " + salario;
    }

    // Equals e hashCode 
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Funcionario that = (Funcionario) o;
        return Double.compare(that.salario, salario) == 0 &&
                Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, salario);
    }
}
