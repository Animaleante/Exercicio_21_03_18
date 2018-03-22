package com.example.adapterandroid;

/**
 * Created by opet on 21/03/2018.
 */

public class ItemControle {
    private String nome;
    private String tipo;
    private double valor;

    public ItemControle() {}

    public ItemControle(String nome, String tipo, double valor) {
        this.nome = nome;
        this.tipo = tipo;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
