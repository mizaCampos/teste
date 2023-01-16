package org.example.domain;

import java.util.Objects;

public class Produto implements Comparable<Produto>{
    private String nome;
    private Double valor;

    public Produto(){}

    public Produto(String nome, Double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return nome.equals(produto.nome) && valor.equals(produto.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, valor);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                '}';
    }

    @Override
    public int compareTo(Produto produto) {
//       return this.nome.compareTo(produto.getNome());
       return Double.valueOf(valor).compareTo(produto.getValor())
    }

    //-1 se this < 0
    // se this == outroProduto, return 0
    // positivo se this > outroProduto
}
