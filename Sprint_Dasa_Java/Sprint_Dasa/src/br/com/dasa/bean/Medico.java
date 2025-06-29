/* Projeto Realizado por :
Victor M L Capp - RM 555753
Bruno Carneiro Leão - RM 555563
Paulo Akira Okama - RM 556840
Guilherme da Cunha Melo - RM 555310
Matheus Guishi Morioka - RM 556935
*/

package br.com.dasa.bean;

/**
 * Classe Medico é a classe filho de Peossa, aqui queremos identificar o crm do médico através do id_crm e a especialidade do médico que será utilizada depois no main para classificar quem atendeu o paciente
 * @author Victor Capp
 * @version 1.0
 */

public class Medico extends Pessoa{
    private int id_crm;
    private String especialidade;

    public Medico(){
    }

    public Medico(String email, String nome_comp, int id_crm, String especialidade){
        super.setEmail(email);
        super.setNome_comp(nome_comp);
        this.id_crm = id_crm;
        this.especialidade = especialidade;
    }

    public int getId_crm() {
        return id_crm;
    }

    public void setId_crm(int id_crm) {
        // fazer condição de crm depois
        this.id_crm = id_crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
