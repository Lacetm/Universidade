/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pedrapapeltesour;

/**
 *
 * @author Marquinhos e Dandan
 */
public class ListaJogadores {
    private Jogador primeiroJogador;
    private Jogador lastJogador;
    public ListaJogadores() {
        this.primeiroJogador = null;
    }

    public void adicionarJogador(Jogador jogador) {
        if (primeiroJogador == null) {
            primeiroJogador = jogador;
        } else {
            Jogador atual = primeiroJogador;
            Jogador anterior = null;

            while (atual != null && jogador.getPontos() > atual.getPontos()) {
                anterior = atual;
                atual = atual.getProximoJogador();
            }

            if (anterior == null) {
                jogador.setProximoJogador(primeiroJogador);
                primeiroJogador = jogador;
            } else {
                anterior.setProximoJogador(jogador);
                jogador.setProximoJogador(atual);
            }
        }
    }
}
