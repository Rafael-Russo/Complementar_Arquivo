package br.newtonpaiva.dominio;

import java.lang.Double;

public class Conta {
    private String agencia;
    private String numero;
    private Double saldo;

    public Conta() {
        this(null,null,null);
    }

    public Conta(String agencia, String numero, Double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
