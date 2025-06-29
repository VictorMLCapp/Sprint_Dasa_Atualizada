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

/**
 * Classe para Paciente, pegamos todas as informações do paciente, temos a interface PacienteIdade determinando "calcularIdade" e data de nascimento,e é uma classe filha da classe Pessoa
 * @author Victor Capp
 * @version 1.0
 */

public class Paciente extends Pessoa implements PacienteIdade {
    private String cpf, num_tel;
    private int id_paciente;
    private LocalDate data_nasc;

    public Paciente() {
    }

    public Paciente(String email, String nome_comp, int id_paciente, String cpf, String num_tel, LocalDate data_nasc) {
        super.setEmail(email);
        super.setNome_comp(nome_comp);
        this.num_tel = num_tel;
        this.id_paciente = id_paciente;
        this.cpf = cpf;
        this.data_nasc = data_nasc;
    }

    public String getNum_tel(String telefone) {
        return num_tel;
    }

    public void setNum_tel(String num_tel) {
        this.num_tel = num_tel;
    }

    public int getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getData_nasc() {
        return data_nasc;
    }

    /**
     * Setando que a data de nascimento será de  1-01-1900 até atualmente, caso o input esteja incorreto será realizado uma Exception
     *
     * @param data_nasc - determinando data de nascimento
     * @author Victor Capp
     */
    public void setData_nasc(LocalDate data_nasc) {
        LocalDate inicio = LocalDate.parse("1899-12-31");
        LocalDate fim = LocalDate.now();
        try {
            if (data_nasc.isAfter(inicio) && data_nasc.isBefore(fim)) {
                this.data_nasc = data_nasc;
            } else {
                throw new Exception("Data fora da faixa permitida");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
