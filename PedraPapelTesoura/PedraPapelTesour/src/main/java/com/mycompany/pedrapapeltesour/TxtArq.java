/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pedrapapeltesour;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author WINDOWS
 */
public class TxtArq {
    
    public static Jogador linhaJogador;
    public static class PontosComparator implements Comparator<Jogador> {

        @Override
        public int compare(Jogador jogador1, Jogador jogador2) {
            return Integer.compare(jogador2.getPontos(), jogador1.getPontos());
        }
    }
    public static int qtdLinhas;
    public static int contaLinhas() throws FileNotFoundException, IOException{
     FileReader fr = new FileReader("C:/Users/WINDOWS/Desktop/Universidade-main/Universidade-main/PedraPapelTesoura/PedraPapelTesoura/PedraPapelTesour/rank.txt");
     BufferedReader br = new BufferedReader(fr);
     qtdLinhas =0;
     while(br.readLine()!=null){
         
         qtdLinhas++;
     }
     return qtdLinhas;
    }
    
    public static void acessarLinha() throws FileNotFoundException, IOException{
     
     int i;
     FileReader fr = new FileReader("C:/Users/WINDOWS/Desktop/Universidade-main/Universidade-main/PedraPapelTesoura/PedraPapelTesoura/PedraPapelTesour/rank.txt");
     BufferedReader br = new BufferedReader(fr);
     String targetLinha;
     contaLinhas();
        
     while ((targetLinha = br.readLine())!=null){
                
           String[] split = targetLinha.split("-");
           System.out.println(linhaJogador); 
           
           linhaJogador = new Jogador(split[0]+"-", Integer.parseInt(split[1]));
           Ranking.jogadores.add(linhaJogador);
           
        
     }
       
        br.close();
        
        Collections.sort(Ranking.jogadores, new PontosComparator());
       
         
     
    
    }
    
    public static void incluirRank() throws FileNotFoundException, IOException{
     if(TelaRegistro.entradaNome.getText() != null){
         try (FileOutputStream fos = new FileOutputStream("C:/Users/WINDOWS/Desktop/Universidade-main/Universidade-main/PedraPapelTesoura/PedraPapelTesoura/PedraPapelTesour/rank.txt", true)) {
             String entrada = TelaRegistro.entradaNome.getText()+"-"+String.valueOf(NovoJogo.getPontos());
             
             String newLinha = "\n";
             byte [] b =  entrada.getBytes();
             byte [] n = newLinha.getBytes();
             
             fos.write(n);
             fos.write(b);
         }
     }
     
     TelaRegistro.entradaNome=null;
     
   
    }
    
    public static void exibirRank(){
    if(Ranking.jogadores.get(0) != null){ 
    String J1 = Ranking.jogadores.get(0).toString();
    Ranking.jTextField1.setText(J1);
    }
    
    if(Ranking.jogadores.get(1) != null){ 
    String J2 = Ranking.jogadores.get(1).toString();
    Ranking.jTextField2.setText(J2);
    }
    
    if(Ranking.jogadores.get(2) != null){ 
    String J3 = Ranking.jogadores.get(2).toString();
    Ranking.jTextField3.setText(J3);
    }
    
    if(Ranking.jogadores.get(3) != null){ 
    String J4 = Ranking.jogadores.get(3).toString();
    Ranking.jTextField11.setText(J4);
    }
    
    if(Ranking.jogadores.get(4) != null){ 
    String J5 = Ranking.jogadores.get(4).toString();
    Ranking.jTextField5.setText(J5);
    }
    
    if(Ranking.jogadores.get(5) != null){ 
    String J6 = Ranking.jogadores.get(5).toString();
    Ranking.jTextField6.setText(J6);
    }
    
    if(Ranking.jogadores.get(6) != null){ 
    String J7 = Ranking.jogadores.get(6).toString();
    Ranking.jTextField7.setText(J7);
    }
    
    if(Ranking.jogadores.get(7) != null){ 
    String J8 = Ranking.jogadores.get(7).toString();
    Ranking.jTextField8.setText(J8);
    }
    
    if(Ranking.jogadores.get(8) != null){ 
    String J9 = Ranking.jogadores.get(8).toString();
    Ranking.jTextField9.setText(J9);
    }
    
    if(Ranking.jogadores.get(9) != null){ 
    String J10 = Ranking.jogadores.get(9).toString();
    Ranking.jTextField10.setText(J10);
    }
    }
    

}




