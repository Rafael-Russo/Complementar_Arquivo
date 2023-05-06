package br.newtonpaiva.ui;

import br.newtonpaiva.dominio.Banco;
import br.newtonpaiva.dominio.Cliente;
import br.newtonpaiva.dominio.Conta;
import br.newtonpaiva.dominio.ManipuladorArquivos;

import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SistemaBancario {
    public static void main(String[] args) throws IOException {
        Cliente c1 = new Cliente();

        Banco banco = new Banco();

        c1.setNome(JOptionPane.showInputDialog("Digite o nome do cliente: "));

        String file = "../Complementar_Arquivos/Contas.txt";
        String[] contas = ManipuladorArquivos.leitor(file);

        Conta[] objContas = new Conta[contas.length-1];

        for (int i = 0; i < contas.length-1; i++) {
            String[] contaSeparada = contas[i].split(";");

            objContas[i] = new Conta(contaSeparada[0], contaSeparada[1], Double.parseDouble(contaSeparada[2]));

            banco.addConta(objContas[i]);
        }

        banco.setNome(JOptionPane.showInputDialog("Digite o nome do Banco: "));

        file = "../Complementar_Arquivos/Banco.txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        writer.write("Banco " + banco.getNome() + " possui o saldo geral de contas de: " + banco.somarSaldos() + ".");
        writer.close();
    }
}
