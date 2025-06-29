/* Projeto Realizado por :
Victor M L Capp - RM 555753
Bruno Carneiro Leão - RM 555563
Paulo Akira Okama - RM 556840
Guilherme da Cunha Melo - RM 555310
Matheus Guishi Morioka - RM 556935
*/

package br.com.dasa.bean;

import java.time.LocalDate;

public interface AmostraVolume {
    public int calcularVolume();
    public boolean ultrapassaLimiteVolume(int limite);
}
