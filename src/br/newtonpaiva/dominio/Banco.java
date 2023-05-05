package br.newtonpaiva.dominio;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public void addConta(Conta conta){
        contas.add(conta);
    }
    public List<Conta> getContas(){
        return contas;
    }
}
