/* Projeto Realizado por :
Victor M L Capp - RM 555753
Bruno Carneiro Leão - RM 555563
Paulo Akira Okama - RM 556840
Guilherme da Cunha Melo - RM 555310
Matheus Guishi Morioka - RM 556935
*/

package br.com.dasa.bean;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;

/**
 * Classe para Paciente, pegamos todas as informações do paciente, temos a interface PacienteIdade determinando "calcularIdade" e data de nascimento,e é uma classe filha da classe Pessoa
 * @author Victor Capp
 * @version 1.0
 */

public class Paciente extends Pessoa implements PacienteIdade {
    private String cpf, numTel;
    private int idPac;
    private LocalDate dataNascimento;

    public Paciente() {
    }

    public Paciente(String email, String nomeComp, int idPac, String cpf, String numTel, LocalDate dataNascimento) {
        super.setEmail(email);
        super.setNomeComp(nomeComp);
        this.numTel = numTel;
        this.idPac = idPac;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public String getNumTel(String telefone) {
        return numTel;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }

    public int getIdPac() {
        return idPac;
    }

    public void setIdPac(int idPac) {
        this.idPac = idPac;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    /**
     * Setando que a data de nascimento será de  1-01-1900 até atualmente, caso o input esteja incorreto será realizado uma Exception
     *
     * @param dataNascimento - determinando data de nascimento
     * @author Victor Capp
     */
    public void setDataNascimento(LocalDate dataNascimento) {
        LocalDate inicio = LocalDate.parse("1899-12-31");
        LocalDate fim = LocalDate.now();
        try {
            if (dataNascimento.isAfter(inicio) && dataNascimento.isBefore(fim)) {
                this.dataNascimento = dataNascimento;
            } else {
                throw new Exception("Data fora da faixa permitida");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public int calcularIdade() {
        LocalDate dateAtual = LocalDate.now();
        Period idade = Period.between(dataNascimento, dateAtual);
        return idade.getYears();
    }
}
