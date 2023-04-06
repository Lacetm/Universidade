/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pedrapapeltesour;

import static com.mycompany.pedrapapeltesour.Ranking.jogadores;
import static com.mycompany.pedrapapeltesour.TelaRegistro.entradaNome;



/**
 *
 * @author Marquinhos e Dandan
 */
public class Jogador {
      private String nomePlayer;
      private int pontos;
      private Jogador proximoJogador;
      
    public Jogador(String nomePlayer, int pontos){
        this.nomePlayer = nomePlayer;
        this.pontos = pontos;
        this.proximoJogador= null;
    }
    
    public String getNomePlayer() {
    return this.nomePlayer;
    }
    public int getPontos() {
    return this.pontos;
    }
    
    public void setProximoJogador(Jogador proximoJogador) {
        this.proximoJogador = proximoJogador;
    }

    public Jogador getProximoJogador() {
        return proximoJogador;
    }
    
  @Override
  public String toString(){
    return this.nomePlayer + "- " + pontos + " pontos";
  }
    
    
    
}
