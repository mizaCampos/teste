package org.example.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class  ProdutoByValorComparator implements Comparator<Produto> {

    @Override
    public int compare(Produto produto, Produto t1) {

    }
}

public class ProdutoSortTest {
    public static void main(String[] args) {

        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("MAÇA", 14.40));
        produtos.add(new Produto("SABONETE", 10.0));
        produtos.add(new Produto("ALICATE", 10.0));
        produtos.add(new Produto("BOLA", 10.0));
        produtos.add(new Produto("Ervilha", 20.0));

        Collections.sort(produtos);
        produtos.forEach(System.out::println);

    }
}
