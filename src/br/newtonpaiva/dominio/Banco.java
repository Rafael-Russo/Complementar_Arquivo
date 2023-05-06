package br.newtonpaiva.dominio;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas = new ArrayList<>();

    public Double somarSaldos(){
        Double soma = 0.0;
        for (Conta temp : contas){
            soma += temp.getSaldo();
        }
        return soma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addConta(Conta conta) {
        this.contas.add(conta);
    }

    public List<Conta> getContas() {
        return contas;
    }
}
