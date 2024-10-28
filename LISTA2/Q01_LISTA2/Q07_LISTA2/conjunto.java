package LISTA2.Q01_LISTA2.Q07_LISTA2;

import java.util.Arrays;

public class conjunto {
    private String[] elementos;
    private int tamanho;

    public conjunto() {
        this.elementos = new String[10]; // Capacidade inicial
        this.tamanho = 0; // Tamanho inicial
    }

    public void adicionar(String elemento) {
        if (!contido(elemento)) {
            if (tamanho == elementos.length) {
                aumentarCapacidade();
            }
            elementos[tamanho] = elemento;
            tamanho++;
        }
    }

    public boolean contido(String elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(elemento)) {
                return true;
            }
        }
        return false;
    }

    public conjunto uniao(conjunto outro) {
        conjunto resultado = new conjunto();

        // Adiciona elementos do conjunto atual
        for (int i = 0; i < this.tamanho; i++) {
            resultado.adicionar(this.elementos[i]);
        }

        // Adiciona elementos do outro conjunto
        for (int i = 0; i < outro.tamanho; i++) {
            resultado.adicionar(outro.elementos[i]);
        }

        return resultado;
    }

    public conjunto inter(conjunto outro) {
        conjunto resultado = new conjunto();

        for (int i = 0; i < this.tamanho; i++) {
            if (outro.contido(this.elementos[i])) {
                resultado.adicionar(this.elementos[i]);
            }
        }

        return resultado;
    }

    public conjunto menos(conjunto outro) {
        conjunto resultado = new conjunto();

        for (int i = 0; i < this.tamanho; i++) {
            if (!outro.contido(this.elementos[i])) {
                resultado.adicionar(this.elementos[i]);
            }
        }

        return resultado;
    }

    public void aumentarCapacidade() {
        elementos = Arrays.copyOf(elementos, elementos.length * 2);
    }

    public void print() {
        for (int i = 0; i < tamanho; i++) {
            System.out.print(elementos[i] + " ");
        }
        System.out.println();
    }

    public int getTamanho() {
        return this.tamanho;
    }
}
