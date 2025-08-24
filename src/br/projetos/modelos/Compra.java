package br.projetos.modelos;

public class Compra {

    String descricao;
    public double valor;

    public Compra(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Compra [descricao=" + descricao + ", valor=" + valor + "]";
    }

}
