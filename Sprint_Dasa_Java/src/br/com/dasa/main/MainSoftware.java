package br.com.dasa.main;

import br.com.dasa.bean.*;

import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MainSoftware {
    static int idCounter = 1; // Controle de ID automático

    public static void main(String[] args) {
        String pergunta, cpf, cep, telefone, nome, dataNascimento, rua, numero, email, complemento, cidade, estado, escolha = "sim", exibicao, especialidade, descricao, dataEntrada, id, nomeUnidade, telUnidade, estadoUnidade, cidadeUnidade, ruaUnidade, cepUnidade;
        int idPac, idAmostra, crm, largura, altura, profundidade;
        LocalDate dataNasc;

        while (escolha.equalsIgnoreCase("sim")) {
            try {

                pergunta = JOptionPane.showInputDialog("""
                        Bem-Vindo ao Software Dasa!
                        O que gostaria de fazer?
                        1. Implementar Novo Paciente
                        2. Implementar e Analisar Amostra
                        3. Verificar se Amostra é Recente""");

                int opcao = Integer.parseInt(pergunta);
                switch (opcao) {
                    case 1:
                        pergunta = JOptionPane.showInputDialog("Seu paciente já possui Cadastro? Digite: 'Sim' ou 'Não' ");
                        if (pergunta.equalsIgnoreCase("Sim")) {
                            JOptionPane.showMessageDialog(null, "Vá para a Opção 3. 'Verifique se Amostra é Recente' ");
                            break;
                        }

                        if (pergunta.equalsIgnoreCase("Não")) {
                            idPac = idCounter++;
                            nome = JOptionPane.showInputDialog("Qual o Nome Completo do Paciente?").toUpperCase();

                            cpf = JOptionPane.showInputDialog("Qual o CPF do Paciente? Digite Apenas Números.");
                            if (cpf.length() != 11) throw new Exception("CPF inválido. Deve conter exatamente 11 dígitos numéricos.");
                            String cpfFormatado = cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-" + cpf.substring(9, 11);

                            pergunta = JOptionPane.showInputDialog("Digite a data de nascimento: \nEx: 15/09/2005");
                            dataNascimento = pergunta.substring(6,10);
                            dataNascimento += "-" + pergunta.substring(3,5);
                            dataNascimento += "-" + pergunta.substring(0,2);
                            dataNasc = LocalDate.parse(dataNascimento);
                            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

                            estado = JOptionPane.showInputDialog("Qual o Estado que o Paciente reside?");
                            cidade = JOptionPane.showInputDialog("Qual a cidade que o Paciente mora?");
                            rua = JOptionPane.showInputDialog("Qual o endereço da Residência do Paciente? (Apenas a rua)");
                            numero = JOptionPane.showInputDialog("Qual o Número da Residência?");
                            complemento = JOptionPane.showInputDialog("Digite um Complemento para o Endereço.");

                            cep = JOptionPane.showInputDialog("Qual o CEP da Residência? (Apenas números)");
                            if (cep.length() != 8) throw new Exception("CEP inválido. Deve conter exatamente 8 dígitos numéricos.");
                            String cepFormatado = cep.substring(0, 5) + "-" + cep.substring(5, 8);

                            email = JOptionPane.showInputDialog("Digite o E-mail do Paciente:");
                            telefone = JOptionPane.showInputDialog("Digite o Telefone do Paciente com o DDD: '1199999999'");
                            if (telefone.length() != 11) throw new Exception("Telefone inválido. Deve conter 11 dígitos numéricos.");
                            String telefoneFormatado = "(" + telefone.substring(0, 2) + ") " + telefone.substring(2, 7) + "-" + telefone.substring(7, 11);

                            Paciente paciente = new Paciente();
                            paciente.setDataNascimento(dataNasc);
                            paciente.setIdPac(idCounter);
                            paciente.setEmail(email);
                            paciente.setNomeComp(nome);
                            paciente.setCpf(cpfFormatado);
                            paciente.setNumTel(telefoneFormatado);

                            Endereco endereco = new Endereco();
                            endereco.setEstado(estado);
                            endereco.setCidade(cidade);
                            endereco.setRua(rua);
                            endereco.setNumero(Integer.parseInt(numero));
                            endereco.setComplemento(complemento);
                            endereco.setCEP(cepFormatado);

                            nome = JOptionPane.showInputDialog("Digite o nome do médico responsável: ");
                            email = JOptionPane.showInputDialog("Digite o email do médico: ");
                            crm = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do CRM \n 6 Digitos: "));
                            especialidade = JOptionPane.showInputDialog("Digite a especialidade do médico: ");

                            Medico medico = new Medico();
                            medico.setEspecialidade(especialidade);
                            medico.setIdCrm(crm);
                            medico.setNomeComp(nome);
                            medico.setEmail(email);

                            exibicao = String.format("""
                                    Paciente implementado no Banco de Dados!
                                    ------------------------------
                                    ID: %s
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
                                    ------------------------------
                                    Médico Responsável:
                                    Nome: %s
                                    CRM: %d
                                    Especialidade: %s
                                    ------------------------------""",
                                    idPac, paciente.getNomeComp(), cpfFormatado, paciente.getDataNascimento().format(dtf),
                                    paciente.getEmail(), telefoneFormatado,
                                    endereco.getEstado(), endereco.getCidade(), endereco.getRua(), endereco.getNumero(), endereco.getComplemento(), cepFormatado,
                                    medico.getNomeComp(), medico.getIdCrm(), medico.getEspecialidade()
                            );

                            JOptionPane.showMessageDialog(null, exibicao);
                        }
                        break;

                    case 2:
                        idAmostra = idCounter++;
                        JOptionPane.showMessageDialog(null, "Implementando informações da Sede que a Amostra será armazenada");
                        nomeUnidade = JOptionPane.showInputDialog("Digite o nome da Unidade: ");
                        telUnidade = JOptionPane.showInputDialog("Digite o telofone da Unidade: (11999999999)");
                        if (telUnidade.length() != 11) throw new Exception("Telefone inválido. Deve conter 11 dígitos numéricos.");
                        String telefoneFormatado = "(" + telUnidade.substring(0, 2) + ") " + telUnidade.substring(2, 7) + "-" + telUnidade.substring(7, 11);

                        estadoUnidade = JOptionPane.showInputDialog("Digite o Estado que a Unidade está localizada: ");
                        cidadeUnidade = JOptionPane.showInputDialog("Digite a Cidade: ");
                        ruaUnidade = JOptionPane.showInputDialog("Digite a Rua: ");
                        cepUnidade = JOptionPane.showInputDialog("Digite o CEP: (06542111)");
                        if (cepUnidade.length() != 8) throw new Exception("CEP inválido. Deve conter exatamente 8 dígitos numéricos.");
                        String cepFormatado = cepUnidade.substring(0, 5) + "-" + cepUnidade.substring(5, 8);

                        JOptionPane.showMessageDialog(null, "Implementando informações da Amostra");
                        descricao = JOptionPane.showInputDialog("Digite a descrição da Amostra: ");
                        largura = Integer.parseInt(JOptionPane.showInputDialog("Digite a largura da Amostra (cm):"));
                        altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura da Amostra (cm):"));
                        profundidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a profundidade da Amostra (cm):"));
                        JOptionPane.showMessageDialog(null, "Exibindo todas as informações...");

                        Sede sede = new Sede();
                        sede.setNomeUnidade(nomeUnidade);
                        sede.setNumTel(telUnidade);
                        sede.setEstado(estadoUnidade);
                        sede.setCidade(cidadeUnidade);
                        sede.setRua(ruaUnidade);
                        sede.setCEP(cepUnidade);

                        Amostra amostra = new Amostra();
                        amostra.setIdAmostra(idCounter);
                        amostra.setLarguraCm(largura);
                        amostra.setAlturaCm(altura);
                        amostra.setProfundidadeCm(profundidade);
                        amostra.setDescricao(descricao);

                        exibicao = String.format("""
                                   Exibindo informações sobre a Amostra:
                                   ID: %s
                                   Unidade da Amostra
                                   Nome Unidade: %s
                                   Telefone Unidade: %s
                                   Estado : %s
                                   Cidade: %s
                                   Rua: %s
                                   CEP: %s
                                   Detalhes da Amostra
                                   Descrição: %s
                                   Largura: %s
                                   Altura: %s
                                   Profundidade: %s
                                   Volume da Amostra: %s
                                   Volume transformado em Litros: %s""", idAmostra, sede.getNomeUnidade(), telefoneFormatado, sede.getEstado(), sede.getCidade(), sede.getRua(), cepFormatado, amostra.getDescricao(), amostra.getLarguraCm(), amostra.getAlturaCm(), amostra.getProfundidadeCm(), amostra.calcularVolume(), amostra.calcularVolume(0)
                        );

                        JOptionPane.showMessageDialog(null, exibicao);
                        break;

                    case 3:
                        id = JOptionPane.showInputDialog("Qual o ID da Amostra requisitada?");
                        dataEntrada = JOptionPane.showInputDialog("Digite a data de entrada da amostra (dd/MM/yyyy):");
                        LocalDate dataFormato = LocalDate.parse(dataEntrada, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                        AmostraRecente amostraRecente = new AmostraRecente();
                        amostraRecente.setDataEntrada(dataFormato);

                        exibicao = String.format("""
                                   Exibindo informações sobre a Amostra:
                                   ID: %s
                                   Data de entrada: %s
                                   A Amostra é: %s""", id, dataFormato, amostraRecente.classificarAmostra()

                        );

                        JOptionPane.showMessageDialog(null, exibicao);
                        break;

                    default:
                        throw new Exception("Opção Inválida! Por Favor, Tente Novamente!");
                }
                escolha = JOptionPane.showInputDialog("Deseja Continuar? (Sim ou Não)");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }

        JOptionPane.showMessageDialog(null, "Programa Finalizado, Até a próxima!");
    }
}
