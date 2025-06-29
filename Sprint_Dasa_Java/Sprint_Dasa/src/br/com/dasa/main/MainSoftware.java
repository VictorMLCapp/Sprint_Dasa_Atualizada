package br.com.dasa.main;

import br.com.dasa.bean.Paciente;

import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MainSoftware {
    static int idCounter = 1; // Controle de ID automático

    public static void main(String[] args) {
        String pergunta, cpf = "", cep = "", telefone = "", nome = "", dataNascimento = "", rua = "", numero = "", email = "", complemento = "", cidade = "", estado = "", escolha = "sim", exibicao;
        int id_pac = 0;
        LocalDate dataNasc = null;
        Paciente paciente = null;

        while (escolha.equalsIgnoreCase("sim")) {
            try {
                pergunta = JOptionPane.showInputDialog("""
                        Bem-Vindo ao Software Dasa!
                        O que gostaria de fazer?
                        1. Implementar Usuário
                        2. Analisar Amostra
                        3. ?????
                        4. Atualizar Informações do Paciente
                        5. Atualizar Informações da Amostra""");

                int opcao = Integer.parseInt(pergunta);

                switch (opcao) {
                    case 1:
                        pergunta = JOptionPane.showInputDialog("Seu paciente já passou por atendimento alguma vez?\n'Sim' ou 'Não' ");
                        if (pergunta.equalsIgnoreCase("Sim")) {
                            throw new Exception("Se seu paciente já passou por atendimento, Por Favor Atualize suas informações.");
                        }
                        if (pergunta.equalsIgnoreCase("Não")) {
                            id_pac = idCounter++;

                            nome = JOptionPane.showInputDialog("Qual o Nome Completo do Paciente?").toUpperCase();
                            cpf = JOptionPane.showInputDialog("Qual o CPF do Paciente? Digite Apenas Números.");
                            if (cpf.length() != 11) throw new Exception("CPF inválido. Deve conter exatamente 11 dígitos numéricos.");
                            String cpfFormatado = cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-" + cpf.substring(9, 11);

                            pergunta = JOptionPane.showInputDialog("Qual Data de Nascimento do Paciente? (dd/MM/yyyy)");
                            dataNascimento = pergunta.substring(6, 10) + "-" + pergunta.substring(3, 5) + "-" + pergunta.substring(0, 2);
                            dataNasc = LocalDate.parse(dataNascimento);

                            estado = JOptionPane.showInputDialog("Qual o Estado que o Paciente reside?");
                            cidade = JOptionPane.showInputDialog("Qual a cidade que o Paciente mora?");
                            rua = JOptionPane.showInputDialog("Qual o endereço da Residência do Paciente? (Apenas a rua)");
                            numero = JOptionPane.showInputDialog("Qual o Número da Residência?");
                            complemento = JOptionPane.showInputDialog("Digite um Complemento para o Endereço.");
                            cep = JOptionPane.showInputDialog("Qual o CEP da Residência? (Apenas números)");
                            if (cep.length() != 8) throw new Exception("CEP inválido. Deve conter exatamente 8 dígitos numéricos.");
                            String cepFormatado = cep.substring(0, 5) + "-" + cep.substring(5, 8);

                            email = JOptionPane.showInputDialog("Digite o E-mail do Paciente.");
                            telefone = JOptionPane.showInputDialog("Digite o Telefone do Paciente com o DDD.");
                            if (telefone.length() != 11) throw new Exception("Telefone inválido. Deve conter 11 dígitos numéricos.");
                            String telefoneFormatado = "(" + telefone.substring(0, 2) + ") " + telefone.substring(2, 7) + "-" + telefone.substring(7, 11);

                            // Criar objeto Paciente
                            paciente = new Paciente(email, nome, id_pac, cpf, telefone, dataNasc);
                            paciente.setData_nasc(dataNasc);

                            exibicao = String.format("""
                                Paciente implementado no Banco de Dados!
                                ------------------------------
                                Nome: %s
                                CPF: %s
                                Data de Nascimento: %s
                                Email: %s
                                Telefone: %s
                                ------------------------------
                                Endereço:
                                Estado: %s
                                Cidade: %s
                                Rua: %s
                                Número: %s
                                Complemento: %s
                                CEP: %s
                                ------------------------------""",
                                    nome, cpfFormatado, dataNasc.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                                    email, telefoneFormatado, estado, cidade, rua, numero, complemento, cepFormatado
                            );

                            JOptionPane.showMessageDialog(null, exibicao);
                        }
                        break;

                    case 2:
                        JOptionPane.showMessageDialog(null, "Análise de amostra realizada com sucesso!\n(Não implementada de forma real, apenas simulação).");
                        break;

                    case 3:
                        JOptionPane.showMessageDialog(null, "🚀 Easter Egg desbloqueado: Parabéns, você achou o segredo da função 3!");
                        break;

                    case 4:
                        if (paciente == null) {
                            JOptionPane.showMessageDialog(null, "Nenhum paciente cadastrado ainda.");
                            break;
                        }
                        nome = JOptionPane.showInputDialog("Digite o novo nome completo do paciente:").toUpperCase();
                        paciente.setNome_comp(nome);
                        cpf = JOptionPane.showInputDialog("Digite o novo CPF (somente números):");
                        paciente.setCpf(cpf);
                        email = JOptionPane.showInputDialog("Digite o novo e-mail:");
                        paciente.setEmail(email);
                        telefone = JOptionPane.showInputDialog("Digite o novo telefone com DDD:");
                        paciente.setNum_tel(telefone);
                        JOptionPane.showMessageDialog(null, "Informações do paciente atualizadas com sucesso.");
                        break;

                    case 5:
                        if (paciente == null) {
                            JOptionPane.showMessageDialog(null, "Nenhum paciente cadastrado ainda.");
                            break;
                        }
                        estado = JOptionPane.showInputDialog("Digite o novo estado:");
                        cidade = JOptionPane.showInputDialog("Digite a nova cidade:");
                        rua = JOptionPane.showInputDialog("Digite a nova rua:");
                        numero = JOptionPane.showInputDialog("Digite o novo número:");
                        complemento = JOptionPane.showInputDialog("Digite o novo complemento:");
                        cep = JOptionPane.showInputDialog("Digite o novo CEP (somente números):");
                        JOptionPane.showMessageDialog(null, "Endereço atualizado com sucesso (simulação).");
                        break;

                    default:
                        throw new Exception("Opção Inválida! Por Favor, Tente Novamente!");
                }

                escolha = JOptionPane.showInputDialog("Deseja Continuar? (Sim ou Não)");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
            }
        }

        JOptionPane.showMessageDialog(null, "Programa Finalizado, Até a próxima!");
    }
}
