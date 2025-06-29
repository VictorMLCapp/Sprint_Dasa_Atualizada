/* Projeto Realizado por :
Victor M L Capp - RM 555753
Bruno Carneiro Leão - RM 555563
Paulo Akira Okama - RM 556840
Guilherme da Cunha Melo - RM 555310
Matheus Guishi Morioka - RM 556935
*/

package br.com.dasa.bean;

/**
 * Classe pessoa, classe Pai da classe Paciente e Medico, atributos: email e nome completo
 * @author Victor Capp
 * @version 1.0
 */

public class Pessoa {
    private String email, nomeComp;

    public Pessoa(){
    }

    public Pessoa(String email, String nomeComp){
        this.email = email;
        this.nomeComp = nomeComp;
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
}
