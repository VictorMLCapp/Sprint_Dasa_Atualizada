/* Projeto Realizado por :
Victor M L Capp - RM 555753
Bruno Carneiro Leão - RM 555563
Paulo Akira Okama - RM 556840
Guilherme da Cunha Melo - RM 555310
Matheus Guishi Morioka - RM 556935
*/

package br.com.dasa.bean;

import java.time.LocalDate;
import java.time.Period;

/**
 * Classe pessoa, classe Pai da classe Paciente e Medico, atributos: email e nome completo
 * @author Victor Capp
 * @version 1.0
 */

public class Pessoa implements PacienteIdade{
    private String email, nomeComp;
    private LocalDate dataNascimento;

    public Pessoa(){
    }

    public Pessoa(String email, String nomeComp, LocalDate dataNascimento){
        this.email = email;
        this.nomeComp = nomeComp;
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomeComp() {
        return nomeComp;
    }

    public void setNomeComp(String nomeComp) {
        this.nomeComp = nomeComp;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int calcularIdade() {
        LocalDate dateAtual = LocalDate.now();
        Period idade = Period.between(dataNascimento, dateAtual);
        return idade.getYears();
    }
}

