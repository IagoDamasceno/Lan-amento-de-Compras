package br.projetos.modelos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Cartao {
    double limite;
    double saldo;

    ArrayList<Compra> compras = new ArrayList<>();

    public Cartao(double limite) {
        this.limite = limite;
        this.saldo = limite;
    }

    public boolean realizarCompra(Compra compra) {
        if (compra.valor <= this.saldo) {
            this.compras.add(compra);
            this.saldo -= compra.valor;
            System.out.println("Compra realizada com sucesso");
            return true;
        } else {
            System.out.println("Saldo insuficiente");
            return false;
        }
    }

    public void exibirCompras() {
        Collections.sort(compras, Comparator.comparingDouble(compra -> compra.valor));
        for (Compra compra : this.compras) {
            System.out.println(compra);
        } 
        System.out.println("Saldo atual: " + this.saldo);
    }
}
