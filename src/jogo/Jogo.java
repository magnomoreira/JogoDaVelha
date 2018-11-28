
package jogo;
import java.util.Scanner;

public class Jogo {
  
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        char [][]jogoVelha = new char [3][3];
        System.out.println("Jogador 1 = x");
        System.out.println("Jogador 2 = o");
        
            boolean ganhou = false;
            int jogada = 1;
            char sinal;
            int linha = 0,coluna= 0;
            
            
            while(!ganhou){
                if(jogada% 2==1){
                    System.out.println("Vez do jogador 1, escolha uma linha e uma coluna (1-3");
                        sinal ='x';
                }else{
                    System.out.println("Vez do jogador 2 , escolha uma linha e uma coluna (1-3)");
                        sinal='o';
                }
                
                boolean linhaValida=false;
                while(!linhaValida){
                    System.out.println("Entre com a linha {1,2 ou 3}");
                    linha=scan.nextInt();
                    if(linha>=1 && linha <=3){
                        linhaValida = true;
                        
                    }else{
                        System.out.println("Entrada invalida, tente novamente ");
                    }
                    
                }
                
                boolean colunaValida =false;
                while (!colunaValida){
                    
                     System.out.println("Entre com coluna {1,2 ou 3}");
                    coluna=scan.nextInt();
                    if(coluna>=1 && coluna <=3){
                        colunaValida = true;
                        
                    }else{
                        System.out.println("Entrada invalida, tente novamente ");
                    }
                    
                }
                
                if (jogoVelha[linha][coluna]=='x'|| jogoVelha[linha][coluna]=='0'){
                
            }
            }
    }
    
}

    

    

